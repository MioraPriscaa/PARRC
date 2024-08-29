CREATE DATABASE ppab;
\c ppab
CREATE TABLE Compte(
    id int serial primary key,
    designation text,
);
CREATE TABLE CodeG(
    codeG int primary key,
    libelle text,
    id_ compte text references Compte(id)
);
CREATE TABLE CodeCompo(
    codeCompo int primary key,
    designation text
);
CREATE TABLE CodeTyp(
    codeTyp varchar(50) primary key,
    designation text
);
CREATE TABLE CodeBenef(
    codeBenef varchar(50) primary key,
    designation text
);
CREATE TABLE CodeOS(
    codeOS int primary key,
    designation text,
    codeCompo int references CodeCompo(codeCompo)
);
CREATE TABLE CodeRt(
    codeRt int primary key,
    designation text,
    codeOS int references CodeOS(codeOS)
);
CREATE TABLE Responsable(
    responsable varchar(50) primary key,
    designation text
);

CREATE TABLE ModeExecution(
    modeExecution varchar(50) primary key,
    designation text
);

CREATE TABLE CodeA1(
    codeA1 int primary key,
    designation text,
    codeRt int references CodeRt(codeRt)
);
CREATE TABLE A1Responsable(
    responsable varchar(50) references Responsable(responsable),
    codeA1 int references CodeA1(codeA1)
);
CREATE TABLE CodeA2(
    codeA2 int primary key,
    designation text,
    codeA1 int references CodeA1(codeA1),
    libelle text,
    cible text,
    codeTyp varchar(50) references CodeTyp(codeTyp)
);
CREATE TABLE A2budget(
    codeA2 int references CodeA2(codeA2),
    annee int,
    montant double precision
);
CREATE TABLE A2Modeexecution(
    modeExecution varchar(50) references ModeExecution(modeExecution),
    codeA2 int references CodeA2(codeA2)
);
CREATE TABLE A2Benef(
    codeBenef varchar(50) references CodeBenef(codeBenef),
    codeA2 int references CodeA2(codeA2)
);
--
-- CREATE TABLE Journal(
--     id_ecriture varchar(50) primary key,
--     dateEcriture date,
--     mois varchar(50),
--     trimestre varchar(50),
--     tiers varchar(50),
--     designation text,
--     codeG int references CodeG(codeG),
--     codeA2 int references CodeA2(codeA2),
--     codeBenef varchar(50) references CodeBenef(codeBenef),
--     codeTyp varchar(50) references CodeTyp(codeTyp),
--     libelle text,
--     PJnum text,
--     refEcriture text,
--     debitDev double precision,
--     creditDev double precision,
--     txchg double precision,
--     debit double precision,
--     credit double precision
-- );
