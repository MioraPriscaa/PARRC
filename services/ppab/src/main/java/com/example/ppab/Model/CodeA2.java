package com.example.ppab.Model;

import javax.persistence.*;

@Entity
public class CodeA2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int codeA2;

    @Column(columnDefinition = "TEXT")
    String Designation;

    @Column(columnDefinition = "TEXT")
    String Libelle;

    @Column(columnDefinition = "TEXT")
    String cible;

    int codeA1;

    String codetype;

    public CodeA2() {
    }

    public CodeA2(int codeA2, String designation, String libelle, String cible, int codeA1, String codetype) {
        this.codeA2 = codeA2;
        Designation = designation;
        Libelle = libelle;
        this.cible = cible;
        this.codeA1 = codeA1;
        this.codetype = codetype;
    }

    public int getCodeA2() {
        return codeA2;
    }

    public void setCodeA2(int codeA2) {
        this.codeA2 = codeA2;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getLibelle() {
        return Libelle;
    }

    public void setLibelle(String libelle) {
        Libelle = libelle;
    }

    public String getCible() {
        return cible;
    }

    public void setCible(String cible) {
        this.cible = cible;
    }

    public int getCodeA1() {
        return codeA1;
    }

    public void setCodeA1(int codeA1) {
        this.codeA1 = codeA1;
    }


    public String getCodetype() {
        return codetype;
    }

    public void setCodetype(String codetype) {
        this.codetype = codetype;
    }
}

