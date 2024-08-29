INSERT INTO CodeG (codeG, libelle, compte)
VALUES
    (1100, 'Report a nouveau - Solde crediteur', 'Compte de capitaux'),
    (1190, 'Report a nouveau - Solde debiteur', 'Compte de capitaux'),
    (1200, 'Resultat de l''exercice (Excedent)', 'Compte de capitaux'),
    (1311, 'Subventions d''investissement (tirage)', 'Compte de capitaux'),
    (1312, 'Subventions d''investissement (paiement direct/ MOA MEF)', 'Compte de capitaux'),
    (2311, 'Formation', 'Compte d''immobilisations'),
    (2312, 'Animation et encadrement', 'Compte d''immobilisations'),
    (2313, 'Assistance technique', 'Compte d''immobilisations'),
    (2314, 'Logiciels informatiques', 'Compte d''immobilisations'),
    (2315, 'Frais d''etudes', 'Compte d''immobilisations'),
    (2316, 'Suivi- Evaluation et Controle', 'Compte d''immobilisations'),
    (2317, 'Frais de pre-exploitation', 'Compte d''immobilisations'),
    (2461, 'Materiels techniques', 'Compte d''immobilisations'),
    (2463, 'Materiels informatiques, electrique et electronique', 'Compte d''immobilisations'),
    (2464, 'Materiels et mobiliers de bureau', 'Compte d''immobilisations'),
    (2472, 'Immobilisation corporelle en cours: materiels automobiles', 'Compte d''immobilisations'),
    (4020, 'Fournisseur', 'Compte de tiers'),
    (4040, 'Fournisseur d''immobilisation', 'Compte de tiers'),
    (4080, 'Fournisseur: facture non parvenue', 'Compte de tiers'),
    (4670, 'Debiteur divers', 'Compte de tiers'),
    (4671, 'Crediteur divers', 'Compte de tiers'),
    (4710, 'Compte d''imputation provisoire de recettes', 'Compte de tiers'),
    (4720, 'Compte d''imputation provisoire de depenses', 'Compte de tiers'),
    (5121, 'Compte BFM', 'Compte financier'),
    (5122, 'Compte BMOI', 'Compte financier'),
    (5310, 'Caisse', 'Compte financier'),
    (5810, 'Virement de fonds', 'Compte financier'),
    (7421, 'Subvention AFD - Versement de fonds', 'Compte de produits'),
    (7422, 'Subvention AFD - Paiement direct', 'Compte de produits'),
    (7660, 'Gains de change', 'Compte de produits'),
    (7680, 'Autres produits financiers', 'Compte de produits'),
    (23172, 'Abonnement et communication', 'Compte d''immobilisations'),
    (23173, 'Fournitures et services', 'Compte d''immobilisations'),
    (23174, 'Transport et mission', 'Compte d''immobilisations'),
    (23175, 'Entretiens et reparation', 'Compte d''immobilisations'),
    (24721, 'Acquisition materiels roulants, vehicules', 'Compte d''immobilisations'),
    (46701, 'AFD (debiteur)', 'Compte de tiers'),
    (46711, 'equipe Projet', 'Compte de tiers'),
    (46712, 'Autres', 'Compte de tiers')
; 
INSERT INTO CodeCompo (codeCompo, designation) VALUES
(1, 'Programmation et exécution budgétaire'),
(2, 'Gouvernance des SI du MEF et systématisation du partage d''information'),
(3, 'GRH et développement des compétences'),
(4, 'Pilotage des réformes et mise en œuvre et suivi-évaluation du PARRC');

INSERT INTO CodeTyp (codeTyp, designation) VALUES
('AC', 'Activités'),
('AQ', 'Acquisitions'),
('ET', 'Etudes'),
('FO', 'Formations'),
('IN', 'Informatique'),
('VO', 'Voyages d''études'),
('SA', 'Suivi-évaluation, audits'),
('IM', 'Imprévus');

INSERT INTO CodeBenef (codeBenef, designation) VALUES
('ARMP', 'Autorité de Régulation des Marchés Publics'),
('CNM', 'Commission Nationale des Marchés'),
('DCSR', 'Direction'),
('DGBF', 'Direction Générale du Budget et des Finances'),
('DGCF', 'Direction Générale du Contrôle Financier'),
('DGT', 'Direction Générale du Trésor');

INSERT INTO CodeOS (CodeOS, Designation,codeCompo)
VALUES
  (1, 'Améliorer la préparation budgétaire et la chaîne de la dépense',1),
  (2, 'Améliorer la gouvernance des systèmes d''information du MEF et systématiser le partage d''information',2),
  (3, 'Améliorer la gestion des ressources humaines et développer les compétences',3),
  (4, 'Soutenir l''appropriation, la coordination et le pilotage des réformes du niveau opérationnel au niveau stratégique, et le suivi-évaluation orienté usagers/bénéficiaires',4);

INSERT INTO CodeRt (codeRt, designation, codeOS) VALUES
(11, 'La préparation budgétaire est plus transparente et la fiabilité du budget est améliorée', 1),
(12, 'La célérité, la régularité et la transparence de l''exécution de la dépense publique sont améliorées', 1),
(13, 'La comptabilité publique est améliorée', 1),
(14, 'Le contrôle et l''audit interne sont améliorés et respectent les normes internationales', 1),
(15, 'Le reporting est amélioré en qualité et est produit dans des délais correspondants aux standards internationaux', 1),
(21, 'Les systèmes d''information de la DGT et de la DGBF sont améliorés, répondent aux besoins métiers et sont conformes au schéma directeur informatique du MEF', 2),
(22, 'Les paiements sont digitalisés', 2),
(23, 'La dématérialisation des pièces justificatives et des contrôles sur la chaîne de la dépense est réalisée', 2),
(24, 'Le MEF dispose d''une vision consolidée de la gestion financière et opérationnelle des Organismes Publics', 2),
(25, 'Les systèmes d''information sont sécurisés et conformes aux normes internationales', 2),
(31, 'La gestion des ressources humaines des départements impliqués dans la chaîne de la dépense est améliorée', 3),
(32, 'Les capacités des agents des départements du MEF impliqués dans la chaîne de la dépense sont renforcées', 3),
(33, 'Des formations de base et continues répondant aux besoins des départements impliqués dans la chaîne de la dépense sont réalisées et pérennisées au niveau des établissements de formation de l''Etat', 3),
(41, 'Le rôle de la DCSR est conforté dans le pilotage et le suivi des réformes', 4),
(42, 'Le PARRC est mis en œuvre conformément aux prévisions', 4);


INSERT INTO Responsable (responsable, designation) VALUES
('ARMP', 'Autorité de Régulation des Marchés Publics'),
('DBIFA', 'Direction de la Brigade d''Investigation Financière et de l''Audit'),
('DE', 'Direction Executive'),
('DGBF', 'Direction Générale du Budget et des Finances'),
('DGCF', 'Direction Générale du Contrôle Financier'),
('DGT', 'Direction Générale du Trésor'),
('DGT (DCP)', 'Direction Générale du Trésor (Directeur de la Comptabilité Publique)'),
('DSI', 'Direction des Systèmes d''Information'),
('DRH', 'Directeur des Ressources Humaines'),
('PARRC', 'Projet d''Accompagnement des Réformes et de Renforcements de Capacités'),
('DCSR', 'Directeur de la Coordination et du Suivi des Réformes'),
('Eq Pjt', 'Eq Pjt');


INSERT INTO ModeExecution (modeExecution, designation) VALUES
('MEF', ' Ministère de l''Economie et des Finances'),
('FMI', ' Fond Monétaire International'),
('AFD', 'Agence Française de Développement');

INSERT INTO CodeA1 (codeA1, designation)
VALUES
  (111, 'Améliorer la programmation budgétaire alignée sur les priorités nationales et sectorielles'),
  (121, 'Améliorer l''efficacité et la transparence de l''exécution de la dépense publique'),
  (122, 'Améliorer la passation des marchés publics'),
  (123, 'Améliorer le suivi des Etablissements Publics Nationaux (EPN) et des Sociétés à Participation Financière de l''Etat (SPFE)'),
  (124, 'Améliorer la gestion de la trésorerie et des financements extérieurs'),
  (131, 'Améliorer la comptabilité publique'),
  (132, 'Améliorer la comptabilité des EPN (action associée à la suivante)'),
  (133, 'Améliorer la comptabilité des CTD (action associée à la précédente)'),
  (141, 'Mettre aux normes la démarche d''audit selon les pratiques internationales.'),
  (142, 'Structurer et renforcer les organes de contrôle'),
  (151, 'Améliorer le reporting pour assurer un meilleur suivi des dépenses'),
  (211, 'Recommandation: Redévelopper la chaine de la dépense'),
  (212, 'Améliorer le SI de la DGT'),
  (213, 'Améliorer le SI de la DGBF'),
  (214, 'Mettre en place un système de GED ou plus large ECM (Electronic Content Management)- Niveau MEF'),
  (221, 'Contribuer à la mise en œuvre des paiements digitalisés'),
  (222, 'Numériser les titres de règlements'),
  (231, 'Mettre en place la dématérialisation des pièces justificatives et des contrôles dans la chaine dépense'),
  (241, 'Développer un outil de suivi des EPN et des SPFE'),
  (242, 'Développer un système de gestion des EPN et des CTD (DGT et DGBF)'),
  (251, 'Sécuriser les systèmes d''information en conformité avec les normes internationales'),
  (311, 'Mettre en œuvre la GPEEC'),
  (321, 'Réaliser des formations de management et de gestion des RH');  
 -- Assuming the table CodeA1 is already created with columns codeA1 and designation

INSERT INTO CodeA1 (codeA1, designation, codeRt) VALUES
(331, 'Réaliser les formations prévues dans le plan de formation pour les acteurs de la chaine dépense en s''appuyant autant que possible sur des établissements de formation publics (I''IMATEP et l''ENAM...) pour les formations de base et récurrentes', 33),
(332, 'Accélérer la mise en place de l''ENT', 33),
(411, 'Renforcer les capacités de la DCSR en conduite du changement, coordination des réformes et développement institutionnel', 41),
(412, 'Appuyer la mise en œuvre du site Web de la DCSR', 41),
(413, 'Appuyer l''élaboration du nouveau plan stratégique de modernisation de la gestion des finances publiques', 41),
(421, 'Acquérir des équipements pour l''équipe projet', 42),
(422, 'Assurer le fonctionnement de l''équipe projet', 42),
(423, 'Tenir les sessions du comité technique de suivi et du comité de pilotage du projet', 42),
(424, 'Réaliser les missions de l''équipe projet', 42),
(425, 'Renforcer les capacités de l''équipe projet', 42),
(426, 'Réaliser des missions de suivi-évaluation, audits annuels', 42),
(427, 'Organiser des événements de communication', 42);

-- Insertion des données dans la table A1Responsable
INSERT INTO A1Responsable (responsable, codeA1) VALUES
('DGBF', 111),
('DGCF', 121),
('DGT', 121),
('ARMP', 122),
('DGBF', 123),
('DGT', 124),
('DGT (DCP)', 131),
('DGT (DCP)', 132),
('DGT (DCP)', 133),
('DBIFA', 141),
('DGCF', 142),
('DE', 151),
('DSI', 211),
('DGBF', 211),
('DGT', 212),
('DSI', 212),
('DGBF', 213),
('DSI', 214),
('DGT', 221),
('DGT', 222),
('DGBF', 231),
('DGT', 241),
('DGBF', 242),
('DGT', 251),
('DRH', 311),
('DGT', 332),
('DCSR', 411),
('DCSR', 412),
('DCSR', 413),
('Eq Pjt', 421),
('Eq Pjt', 422),
('Eq Pjt', 423),
('Eq Pjt', 424),
('Eq Pjt', 425),
('Eq Pjt', 426),
('Eq Pjt', 427);
INSERT INTO CodeA2 (codeA2, designation, codeA1, libelle, cible, codeTyp) VALUES
(1111, 'Faire un état des lieux (Diagnostic) du processus de préparation budgétaire et proposer un plan d''action d''amélioration du processus de préparation budgétaire', 111, 'Rapport de l''étude diagnostic', 'Rapport disponible', 'ET'),
(1112, 'Faire un voyage d''échanges dans un pays présentant une préparation budgétaire réussie et une application effective du budget programme. Atelier de restitution au retour.', 111, 'Rapport de voyage d''échange', '30 personnes', 'VO'),
(1114, 'Réviser les/des processus / procédures et le calendrier budgétaire et confirmer par un voyage d''échange', 111, 'Nombre de Processus/ procédures affinés', 'à fixer dans plan d''action', 'AC'),
(1116, 'Elaborer des manuels, guides', 111, 'Nombre de manuels, guides élaborés', 'à fixer dans plan d''action', 'AC'),
(1117, 'Réaliser des formations pratiques en lien avec les améliorations apportées', 111, 'Nombre de personnes formées', '100 personnes', 'FO'),
(1118, 'Vulgariser le calendrier budgétaire', 111, 'Nombre de participants sensibilisés', '100 personnes', 'AC'),
(1119, 'Organiser des formations auprès d''instituts de renommée internationale d''un panel d''agents du MEF sur la programmation et l''exécution budgétaire', 111, 'Rapports de formation', '6 agents formés', 'FO'),
(1211, 'Réaliser une étude diagnostique de la chaine dépense et proposer un plan d''action d''amélioration du processus de la chaine dépense', 121, 'Rapport d''étude', 'Rapport d''étude disponible', 'ET'),
(1212, 'Faire un voyage d''étude dans un pays disposant d''une chaine de la dépense réussie', 121, 'Rapport de voyage d''échange', '30 participants', 'VO'),
(1214, 'Réviser les processus / procédures et les outils', 121, 'Nombre de Processus/ procédures affinés', 'à fixer dans plan d''action', 'AC'),
(1216, 'Elaborer des manuels, guides', 121, 'Nombre de manuels, guides élaborés', 'à fixer dans plan d''action', 'AC'),
(1217, 'Réaliser des formations pratiques en lien avec les améliorations apportées', 121, 'Nombre de personnes formées', '200 personnes', 'FO'),
(1218, 'Mettre en place un guichet de renseignement sur l''avancement du traitement des dossiers de dépense (Sur Internet)', 121, 'Enquête d''appréciation des usagers', 'Rapport d''enquête disponible', 'AC'),
(1219, 'Mettre en place des contrats de performance au Trésor', 121, 'Contrats et rapports annuels d''évaluation', 'Contrats et rapports annuels d''évaluation disponibles', 'AC'),
(12110, 'Mettre en place un cadre juridique permettant au trésor de faire un suivi efficace des fonds investis', 121, 'Rapport d''étude', 'Rapport d''étude disponible', 'AC'),
(12111, 'Identifier et éliminer les contrôles redondants au niveau de l''exécution des financements extérieurs', 121, 'Rapport d''analyse', 'à fixer d''après rapport', 'AC'),
(1221, 'Renforcement de capacités des régulateurs et contrôleurs pour une uniformisation des langages dans le cadre de la mise en oeuvre de l''e-GP Madagascar et l''amélioration et le déploiement régional du PRS', 122, 'Nombre de personnes formées', '30 pers ARMP, 70 pers CNM', 'FO'),
(1222, 'Former les formateurs à l''ARMP', 122, 'Nombre de formateurs formés', '46 personnes', 'FO'),
(1223, 'Faire une visite d''échanges pour étudier le mécanisme de contrôle et de régulation des marchés publics dans d''autres systèmes pour une amélioration de la performance du système national de passation de marchés', 122, 'Rapport de voyage d''échange', '30 participants', 'VO'),
(1224, 'Améliorer la cohérence entre la plateforme e-GP et le SIIGFP (Chaine dépense) (interface informatique de déversement)', 122, 'Nombre de personnes assistant à l''atelier de restitution', '2 x 30 participants', 'IN'),
(1226, 'Former sur la manipulation et sur le déploiement de l''e-GP dans les STD', 122, 'Nombre de personnes formées', 'à fixer', 'FO'),
(1231, 'Réaliser une étude diagnostique et avoir un plan d''action pour améliorer le suivi des EPN', 123, 'Rapport de l''étude diagnostic', 'Rapport disponible', 'ET'),
(1232, 'Réaliser une étude diagnostique et avoir un plan d''action pour améliorer le suivi des SPFE', 123, 'Rapport de l''étude diagnostic', 'Rapport disponible', 'ET'),
(1233, 'Faire un voyage d''étude dans un pays présentant une expérience réussie en matière de suivi des EPN', 123, 'Rapport de voyage d''échange', '30 participants', 'VO'),
(1234, 'Faire un voyage d''étude dans un pays présentant une expérience réussie en matière de suivi des SPFE', 123, 'Rapport de voyage d''échange', '20 participants', 'VO'),
(1235, 'Développer et formaliser les processus de suivi des EPN', 123, 'Document présentant les processus', 'Document disponible', 'AC'),
(1236, 'Développer et formaliser les processus de suivi des SPFE', 123, 'Document présentant les processus', 'Document disponible', 'AC'),
(1237, 'Développer un outil informatique de suivi des EPN. Elaborer les TDR pour recruter l''expert', 123, 'TDR pour recrutement expert', 'TDR disponibles', 'AC'),
(1238, 'Développer un outil informatique de suivi des SPFE. Elaborer les TDR pour recruter l''expert', 123, 'TDR pour recrutement expert', 'TDR disponibles', 'AC'),
(1239, 'Renforcer les capacités des responsables chargés de l''encadrement des EPN sur l''analyse du budget et compte administratif des EPN', 123, 'Rapport de formation', '20 agents formés', 'FO'),
(12310, 'Renforcer les compétences de la structure en charge de la gestion des SPFE (service des participations financières de l''Etat) en matière de valorisation des actions à la valeur mathématique et à l''évaluation des titres de participation', 123, 'Rapport de formation', '14 agents formés', 'FO'),
(12311, 'Former les acteurs en charge du suivi des SPFE (Analyse financière)', 123, 'Rapport de formation', '30 agents formés', 'FO'),
(1241, 'Intégrer les fonds EPN dans le CUT', 124, 'Nombre d''EPN dont les fonds sont intégrés dans le CUT', 'à fixer', 'AC'),
(1242, 'Réaliser une étude pour la participation du Trésor Public sur le marché financier (Gestion de trésorerie: placement excédent et emprunt pour combler le gap ponctuel) - En attente d''accord du FMI', 124, 'Rapport d''étude', 'Rapport d''étude disponible', 'ET'),
(1243, 'Missions d''accompagnement pour la participation du Trésor Public sur le marché financier - En attente d''accord du FMI', 124, 'Rapports de missions', '4 rapports de missions disponibles', 'AC'),
(1244, 'Réaliser une étude pour la mise en place du marché des capitaux', 124, 'Rapport d''étude', 'Rapport d''étude disponible', 'ET'),
(1245, 'Missions d''accompagnement pour la mise en place du marché des capitaux', 124, 'Rapports de missions', '4 rapports de missions disponibles', 'AC'),
(1246, 'Elaborer la politique d''évaluation des projets de la DGT et mettre en place les contrats de performance des projets', 124, 'Nombre de procédures améliorées Délais d''exécution', 'Nombre et nouveaux délais à fixer', 'AC'),
(1247, 'Renforcer les capacités de traitement des financements extérieurs', 124, 'Nombre d''agents formés', '25 agents formés', 'FO');
-- Insert data for 2023
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1111, 2023, 0),  -- Budget not specified
(1112, 2023, 0),  -- Budget not specified
(1114, 2023, 41050),
(1116, 2023, 0),  -- No specific budget allocated
(1117, 2023, 0),  -- No specific budget allocated
(1118, 2023, 4220),
(1119, 2023, 0);  -- Budget not specified

-- Insert data for 2024
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1111, 2024, 0),  -- Budget not specified
(1112, 2024, 0),  -- Budget not specified
(1114, 2024, 41050),
(1116, 2024, 5000),
(1117, 2024, 6340),
(1118, 2024, 4220),
(1119, 2024, 35670);

-- Insert data for 2025
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1111, 2025, 0),  -- Budget not specified
(1112, 2025, 0),  -- Budget not specified
(1114, 2025, 41050),
(1116, 2025, 5000),
(1117, 2025, 6340),
(1118, 2025, 4220),
(1119, 2025, 35670);

-- Insert data for 2026
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1111, 2026, 0),  -- Budget not specified
(1112, 2026, 0),  -- Budget not specified
(1114, 2026, 41050),
(1116, 2026, 5000),
(1117, 2026, 6340),
(1118, 2026, 4220),
(1119, 2026, 35670);

-- Insert data for 2027
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1111, 2027, 0),  -- Budget not specified
(1112, 2027, 0),  -- Budget not specified
(1114, 2027, 41050),
(1116, 2027, 5000),
(1117, 2027, 6340),
(1118, 2027, 4220),
(1119, 2027, 35670);
-- Insert data for 2023
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1211, 2023, 0),  -- Budget not specified
(1212, 2023, 0),  -- Budget not specified
(1214, 2023, 20000),
(1216, 2023, 0),  -- No specific budget allocated
(1217, 2023, 0),  -- No specific budget allocated
(1218, 2023, 5000),
(1219, 2023, 21340),
(12110, 2023, 34100),
(12111, 2023, 2330);

-- Insert data for 2024
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1211, 2024, 0),  -- Budget not specified
(1212, 2024, 23890),
(1214, 2024, 10000),
(1216, 2024, 10000),
(1217, 2024, 14250),
(1218, 2024, 5000),
(1219, 2024, 10670),
(12110, 2024, 17050),
(12111, 2024, 0);  -- Budget not specified

-- Insert data for 2025
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1211, 2025, 0),  -- Budget not specified
(1212, 2025, 0),  -- Budget not specified
(1214, 2025, 10000),
(1216, 2025, 0),  -- No specific budget allocated
(1217, 2025, 14250),
(1218, 2025, 0),  -- No specific budget allocated
(1219, 2025, 10670),
(12110, 2025, 17050),
(12111, 2025, 0);  -- Budget not specified

-- Insert data for 2026
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1211, 2026, 0),  -- Budget not specified
(1212, 2026, 0),  -- Budget not specified
(1214, 2026, 0),  -- No specific budget allocated
(1216, 2026, 0),  -- No specific budget allocated
(1217, 2026, 0),  -- No specific budget allocated
(1218, 2026, 0),  -- No specific budget allocated
(1219, 2026, 0),  -- No specific budget allocated
(12110, 2026, 0),  -- No specific budget allocated
(12111, 2026, 0);  -- No specific budget allocated

-- Insert data for 2027
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1211, 2027, 0),  -- Budget not specified
(1212, 2027, 0),  -- Budget not specified
(1214, 2027, 0),  -- No specific budget allocated
(1216, 2027, 0),  -- No specific budget allocated
(1217, 2027, 0),  -- No specific budget allocated
(1218, 2027, 0),  -- No specific budget allocated
(1219, 2027, 0),  -- No specific budget allocated
(12110, 2027, 0),  -- No specific budget allocated
(12111, 2027, 0);  -- No specific budget allocated

-- Insert data for 2023
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1222, 2023, 0),  -- Budget not specified
(1223, 2023, 0),  -- Budget not specified
(1224, 2023, 21050),
(1225, 2023, 6340),
(1226, 2023, 0);  -- No specific budget allocated

-- Insert data for 2024
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1222, 2024, 34420),
(1223, 2024, 20170),
(1224, 2024, 10525),
(1225, 2024, 6340),
(1226, 2024, 11667);

-- Insert data for 2025
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1222, 2025, 34420),
(1223, 2025, 0),  -- Budget not specified
(1224, 2025, 0),  -- No specific budget allocated
(1225, 2025, 0),  -- No specific budget allocated
(1226, 2025, 11667);

-- Insert data for 2026
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1222, 2026, 0),  -- Budget not specified
(1223, 2026, 0),  -- Budget not specified
(1224, 2026, 0),  -- No specific budget allocated
(1225, 2026, 0),  -- No specific budget allocated
(1226, 2026, 11666);

-- Insert data for 2027
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1222, 2027, 0),  -- Budget not specified
(1223, 2027, 0),  -- Budget not specified
(1224, 2027, 0),  -- No specific budget allocated
(1225, 2027, 0),  -- No specific budget allocated
(1226, 2027, 0);  -- No specific budget allocated

-- Insert data for 2023
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1231, 2023, 27040),
(1232, 2023, 27040),
(1233, 2023, 18190),
(1234, 2023, 18190),
(1235, 2023, 0),  -- No specific budget allocated
(1236, 2023, 0),  -- No specific budget allocated
(1237, 2023, 1585),
(1238, 2023, 1585),
(1239, 2023, 9700),
(12310, 2023, 15950),
(12311, 2023, 44800);

-- Insert data for 2024
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1231, 2024, 27040),
(1232, 2024, 27040),
(1233, 2024, 0),  -- Budget not specified
(1234, 2024, 0),  -- Budget not specified
(1235, 2024, 3170),
(1236, 2024, 3170),
(1237, 2024, 0),  -- No specific budget allocated
(1238, 2024, 0),  -- No specific budget allocated
(1239, 2024, 0),  -- No specific budget allocated
(12310, 2024, 0),  -- No specific budget allocated
(12311, 2024, 44800);

-- Insert data for 2025
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1231, 2025, 0),  -- Budget not specified
(1232, 2025, 0),  -- No specific budget allocated
(1233, 2025, 0),  -- No specific budget allocated
(1234, 2025, 0),  -- No specific budget allocated
(1235, 2025, 3170),
(1236, 2025, 3170),
(1237, 2025, 0),  -- No specific budget allocated
(1238, 2025, 0),  -- No specific budget allocated
(1239, 2025, 0),  -- No specific budget allocated
(12310, 2025, 0),  -- No specific budget allocated
(12311, 2025, 0);  -- Budget not specified

-- Insert data for 2026
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1231, 2026, 0),  -- Budget not specified
(1232, 2026, 0),  -- No specific budget allocated
(1233, 2026, 0),  -- No specific budget allocated
(1234, 2026, 0),  -- No specific budget allocated
(1235, 2026, 0),  -- No specific budget allocated
(1236, 2026, 0),  -- No specific budget allocated
(1237, 2026, 0),  -- No specific budget allocated
(1238, 2026, 0),  -- No specific budget allocated
(1239, 2026, 0),  -- No specific budget allocated
(12310, 2026, 0),  -- No specific budget allocated
(12311, 2026, 0);  -- Budget not specified

-- Insert data for 2027
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1231, 2027, 0),  -- Budget not specified
(1232, 2027, 0),  -- No specific budget allocated
(1233, 2027, 0),  -- No specific budget allocated
(1234, 2027, 0),  -- No specific budget allocated
(1235, 2027, 0),  -- No specific budget allocated
(1236, 2027, 0),  -- No specific budget allocated
(1237, 2027, 0),  -- No specific budget allocated
(1238, 2027, 0),  -- No specific budget allocated
(1239, 2027, 0),  -- No specific budget allocated
(12310, 2027, 0),  -- No specific budget allocated
(12311, 2027, 0);  -- No specific budget allocated

-- Insert data for 2023
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1241, 2023, 0),       -- No specific budget allocated
(1242, 2023, 0),       -- No specific budget allocated
(1243, 2023, 0),       -- No specific budget allocated
(1244, 2023, 0),       -- No specific budget allocated
(1245, 2023, 0),       -- No specific budget allocated
(1246, 2023, 0),       -- No specific budget allocated
(1247, 2023, 0);       -- No specific budget allocated

-- Insert data for 2024
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1241, 2024, 15000),
(1242, 2024, 29460),
(1243, 2024, 0),        -- No specific budget allocated
(1244, 2024, 29460),
(1245, 2024, 26870),
(1246, 2024, 0),        -- No specific budget allocated
(1247, 2024, 12278);

-- Insert data for 2025
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1241, 2025, 0),
(1242, 2025, 0),
(1243, 2025, 35827),
(1244, 2025, 0),
(1245, 2025, 26870),
(1246, 2025, 11350),
(1247, 2025, 12277);

-- Insert data for 2026
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1241, 2026, 0),
(1242, 2026, 0),
(1243, 2026, 35826),
(1244, 2026, 0),
(1245, 2026, 26870),
(1246, 2026, 0),
(1247, 2026, 0);

-- Insert data for 2027
INSERT INTO A2budget (codeA2, annee, montant) VALUES
(1241, 2027, 0),
(1242, 2027, 0),
(1243, 2027, 0),
(1244, 2027, 0),
(1245, 2027, 26870),
(1246, 2027, 0),
(1247, 2027, 0);
INSERT INTO A2Benef (codeBenef, codeA2) VALUES
('DGBF', 1111),
('DGBF', 1112),
('DGBF', 1114),
('DGBF', 1116),
('DGBF', 1117),
('DGBF', 1118),
('DGBF', 1119),
('DGT', 1218),
('DGT', 1219),
('ARMP', 1221),
('CNM', 1221),
('ARMP', 1222),
('ARMP', 1223),
('CNM', 1223),
('ARMP', 1224),
('ARMP', 1226),
('DGT', 1231),
('DGBF', 1231),
('DGT', 1232),
('DGBF', 1232),
('DGT', 1233),
('DGBF', 1233),
('DGT', 1234),
('DGT', 1235),
('DGBF', 1235),
('DGT', 1236),
('DGBF', 1236),
('DGT', 1237),
('DGBF', 1237),
('DGT', 1238),
('DGBF', 1238),
('DGT', 1239),
('DGBF', 1239),
('DGT', 1241),
('DGT', 1242),
('DGT', 1243),
('DGT', 1244),
('DGT', 1245),
('DGT', 1246),
('DGT', 1247);
INSERT INTO A2Benef (codeBenef, codeA2) VALUES
('DGT', 1211),
('DGBF', 1211),
('DGCF', 1211),
('DGT', 1212),
('DGBF', 1212),
('DGCF', 1212),
('DGT', 1214),
('DGBF', 1214),
('DGCF', 1214),
('DGT', 1216),
('DGBF', 1216),
('DGCF', 1216),
('DGT', 1217),
('DGBF', 1217),
('DGCF', 1217);


INSERT INTO A2Modeexecution (modeExecution, codeA2) VALUES
('MEF', 1111), -- For activity A 1.1.1.1.
('AFD', 1111), -- For activity A 1.1.1.1.
('MEF', 1112), -- For activity A 1.1.1.2.
('MEF', 1114), -- For activity A 1.1.1.4.
('MEF', 1116), -- For activity A 1.1.1.6.
('MEF', 1117), -- For activity A 1.1.1.7.
('MEF', 1118), -- For activity A 1.1.1.8.
('MEF', 1119), -- For activity A 1.1.1.9.
('FMI', 1211), -- For activity A 1.2.1.1.
('MEF', 1212), -- For activity A 1.2.1.2.
('MEF', 1214), -- For activity A 1.2.1.4.
('MEF', 1216), -- For activity A 1.2.1.6.
('MEF', 1217), -- For activity A 1.2.1.7.
('MEF', 1218), -- For activity A 1.2.1.8.
('MEF', 1219), -- For activity A 1.2.1.9.
('AFD', 1219), -- For activity A 1.2.1.9.
('AFD', 12110), -- For activity A 1.2.1.10.
('MEF', 12111), -- For activity A 1.2.1.11.
('MEF', 1221), -- For activity A 1.2.2.1.
('AFD', 1221), -- For activity A 1.2.2.1.
('MEF', 1222), -- For activity A 1.2.2.2.
('MEF', 1223), -- For activity A 1.2.2.3.
('MEF', 1224), -- For activity A 1.2.2.4.
('MEF', 1226), -- For activity A 1.2.2.6.
('MEF', 1231), -- For activity A 1.2.3.1.
('AFD', 1231), -- For activity A 1.2.3.1.
('MEF', 1232), -- For activity A 1.2.3.2.
('MEF', 1233), -- For activity A 1.2.3.3.
('MEF', 1234), -- For activity A 1.2.3.4.
('MEF', 1235), -- For activity A 1.2.3.5.
('MEF', 1236), -- For activity A 1.2.3.6.
('MEF', 1237), -- For activity A 1.2.3.7.
('MEF', 1238), -- For activity A 1.2.3.8.
('AFD', 1239), -- For activity A 1.2.3.9.
('AFD', 12310), -- For activity A 1.2.3.10.
('MEF', 12311), -- For activity A 1.2.3.11.
('MEF', 1241), -- For activity A 1.2.4.1.
('AFD', 1242), -- For activity A 1.2.4.2.
('AFD', 1243), -- For activity A 1.2.4.3.
('AFD', 1244), -- For activity A 1.2.4.4.
('AFD', 1245), -- For activity A 1.2.4.5.
('AFD', 1246), -- For activity A 1.2.4.6.
('AFD', 1247); -- For activity A 1.2.4.7.
