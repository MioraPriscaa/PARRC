CREATE OR REPLACE FUNCTION generate_ppab_detail_view()
RETURNS void AS $$
DECLARE
years text;
sql text;
BEGIN
    -- Get distinct years from A2budget
SELECT STRING_AGG(DISTINCT
        'SUM(CASE WHEN b.annee = ' || annee || ' THEN b.montant ELSE 0 END) AS "Budget ' || annee || ' (en euros)"',
               ', ')
INTO years
FROM A2budget;

-- Construct the dynamic SQL for the view
sql := '
    CREATE OR REPLACE VIEW PPAB_detail AS 
    SELECT 
        a1.codea1 as "codeA1",
        a2.codeA2 as "codeA2",
        a2.designation AS "Actions/Activites",
        a2.libelle AS "Libellé",
        a2.cible AS "Cible",
        a2.codetyp AS "Type action",
        STRING_AGG(DISTINCT me.modeExecution, ''/'') AS "Mode d''exécution",
        STRING_AGG(DISTINCT r.responsable, ''/'') AS "Resp",
        STRING_AGG(DISTINCT cb.codeBenef, ''/'') AS "Bénéficiaires",
        SUM(b.montant) AS "Budget (en euros)",
        ' || years || '

    FROM
        CodeA1 a1
    JOIN
        CodeA2 a2 ON a1.codeA1 = a2.codeA1
    LEFT JOIN
        A1Responsable ar ON a1.codeA1 = ar.codeA1
    LEFT JOIN
        Responsable r ON ar.responsable = r.responsable
    LEFT JOIN
        A2Benef ab ON a2.codeA2 = ab.codeA2
    LEFT JOIN
        CodeBenef cb ON ab.codeBenef = cb.codeBenef
    LEFT JOIN
        A2budget b ON a2.codeA2 = b.codeA2
    LEFT JOIN
        A2Modeexecution ame ON a2.codeA2 = ame.codeA2
    LEFT JOIN
        ModeExecution me ON ame.modeExecution = me.modeExecution

    GROUP BY
        a1.codeA1,a2.designation, a2.libelle, a2.cible, a2.codetyp, a2.codeA2
    ORDER BY
        a1.codeA1, a2.codeA2,a2.designation;
    ';

    -- Execute the dynamic SQL
EXECUTE sql;
END;
$$ LANGUAGE plpgsql;



SELECT generate_ppab_detail_view();


--plan financier
create or replace view Tauxplanfinanciere as
WITH TotalAmount AS (
    SELECT SUM(montant) AS total
    FROM Planfinaciere
)
SELECT
    d.codecompo,
    d.montant AS montant,
    (d.montant * 100.0 / ta.total) AS pourcentage
FROM
    Planfinaciere AS d,
    TotalAmount AS ta;


create or replace VIEW ptba AS
SELECT
    a1.codea1 as "codeA1",
    a2.codeA2 as "codeA2",
    a2.designation AS "Actions/Activites",
    a2.libelle AS "Libelle",
    a2.cible AS "Cible",
    a2.codetyp AS "Typeaction",
    STRING_AGG(DISTINCT me.modeExecution::text, '/'::text) AS "Modedexecution",
    STRING_AGG(DISTINCT r.responsable::text, '/'::text) AS "Resp",
    STRING_AGG(DISTINCT cb.codeBenef::text, '/'::text) AS "Beneficiaires",
    b.annee AS "Annee",
    SUM(b.montant) AS "Budget"
FROM
    CodeA1 a1
        JOIN
    CodeA2 a2 ON a1.codeA1 = a2.codeA1
        LEFT JOIN
    A1Responsable ar ON a1.codeA1 = ar.codeA1
        LEFT JOIN
    Responsable r ON ar.responsable = r.responsable
        LEFT JOIN
    A2Benef ab ON a2.codeA2 = ab.codeA2
        LEFT JOIN
    CodeBenef cb ON ab.codeBenef = cb.codeBenef
        LEFT JOIN
    A2budget b ON a2.codeA2 = b.codeA2
        LEFT JOIN
    A2Modeexecution ame ON a2.codeA2 = ame.codeA2
        LEFT JOIN
    ModeExecution me ON ame.modeExecution = me.modeExecution
GROUP BY
    a1.codeA1, a2.codeA2, a2.designation, a2.libelle, a2.cible, a2.codetyp, b.annee
ORDER BY
    a1.codeA1, a2.codeA2, a2.designation, b.annee;
