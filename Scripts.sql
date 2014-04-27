drop table armes;
drop table armures;
drop table habilites;
drop table inventaire;
drop table panier;
drop table potions;
drop table items;
drop table joueurs;



CREATE TABLE Armes
  (
    IdItem     NUMBER NOT NULL ,
    Efficacite NUMBER NOT NULL ,
    Degats     NUMBER NOT NULL
  ) ;
ALTER TABLE Armes ADD CONSTRAINT Armes_PK PRIMARY KEY
(
  IdItem
)
;

CREATE TABLE Armures
  (
    IdItem     NUMBER NOT NULL ,
    Matiere    VARCHAR2 (40) NOT NULL ,
    Taille     NUMBER NOT NULL ,
    Efficacite NUMBER ,
    Poids      NUMBER NOT NULL
  ) ;
ALTER TABLE Armures ADD CONSTRAINT Armure_PK PRIMARY KEY
(
  IdItem
)
;

CREATE TABLE Habilites
  (
    IdItem      NUMBER NOT NULL ,
    Description VARCHAR2 (20) NOT NULL
  ) ;
ALTER TABLE Habilites ADD CONSTRAINT Habilites_PK PRIMARY KEY
(
  IdItem
)
;

CREATE TABLE Inventaire
  (
    IdJoueur NUMBER NOT NULL ,
    IdItem   NUMBER NOT NULL ,
    Quantite NUMBER NOT NULL
  ) ;
ALTER TABLE Inventaire ADD CONSTRAINT Inventaire_PK PRIMARY KEY
(
  IdJoueur, IdItem
)
;

CREATE TABLE Items
  (
    IdItem        NUMBER NOT NULL ,
    NomItem       VARCHAR2 (40) NOT NULL ,
    Genre         CHAR (2) ,
    Prix          NUMBER (2,4) NOT NULL ,
    QuantiteDispo NUMBER NOT NULL
  ) ;
ALTER TABLE Items ADD CONSTRAINT Items_PK PRIMARY KEY
(
  IdItem
)
;

CREATE TABLE Joueurs
  (
    IdJoueur    NUMBER NOT NULL ,
    NomUsager   VARCHAR2 (40) NOT NULL ,
    NomJoueur   VARCHAR2 (40) NOT NULL ,
    Prenom      VARCHAR2 (40) NOT NULL ,
    EcusJoueurs NUMBER (2) NOT NULL ,
    MotDePasse  VARCHAR2 (40) NOT NULL
  ) ;
COMMENT ON COLUMN Joueurs.EcusJoueurs
IS
  'Check >=0' ;
  ALTER TABLE Joueurs ADD CONSTRAINT Joueurs_PK PRIMARY KEY
  (
    IdJoueur
  )
  ;
  ALTER TABLE Joueurs ADD CONSTRAINT Joueurs__UN UNIQUE
  (
    NomUsager
  )
  ;

CREATE TABLE Panier
  (
    IdJoueur NUMBER NOT NULL ,
    IdItem   NUMBER NOT NULL ,
    Quantite NUMBER NOT NULL
  ) ;
ALTER TABLE Panier ADD CONSTRAINT Panier_PK PRIMARY KEY
(
  IdJoueur, IdItem
)
;

CREATE TABLE Potions
  (
    IdItem     NUMBER NOT NULL ,
    Effet      VARCHAR2 (40) NOT NULL ,
    DureeEffet NUMBER
  ) ;
ALTER TABLE Potions ADD CONSTRAINT Potions_PK PRIMARY KEY
(
  IdItem
)
;

ALTER TABLE Armes ADD CONSTRAINT Armes_Items_FK FOREIGN KEY ( IdItem ) REFERENCES Items ( IdItem ) ;

ALTER TABLE Armures ADD CONSTRAINT Armure_Items_FK FOREIGN KEY ( IdItem ) REFERENCES Items ( IdItem ) ;

ALTER TABLE Inventaire ADD CONSTRAINT Inventaire_Items_FK FOREIGN KEY ( IdItem ) REFERENCES Items ( IdItem ) ;

ALTER TABLE Inventaire ADD CONSTRAINT Inventaire_Joueurs_FK FOREIGN KEY ( IdJoueur ) REFERENCES Joueurs ( IdJoueur ) ;

ALTER TABLE Panier ADD CONSTRAINT Panier_Items_FK FOREIGN KEY ( IdItem ) REFERENCES Items ( IdItem ) ;

ALTER TABLE Panier ADD CONSTRAINT Panier_Joueurs_FK FOREIGN KEY ( IdJoueur ) REFERENCES Joueurs ( IdJoueur ) ;

ALTER TABLE Potions ADD CONSTRAINT Potions_Items_FK FOREIGN KEY ( IdItem ) REFERENCES Items ( IdItem ) ;

ALTER TABLE Habilites ADD CONSTRAINT TABLE_7_Items_FK FOREIGN KEY ( IdItem ) REFERENCES Items ( IdItem ) ;







