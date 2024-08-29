package com.example.ppab.Model;

import javax.persistence.*;

@Entity
public class CodeG {

    @Id
    int codeg;
    @Column(columnDefinition = "TEXT")
    String libelle;

    int compte;

    public CodeG() {
    }

    public CodeG(int codeg, String libelle, int compte) {
        this.codeg = codeg;
        this.libelle = libelle;
        this.compte = compte;
    }

    public int getCodeg() {
        return codeg;
    }

    public void setCodeg(int codeg) {
        this.codeg = codeg;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getCompte() {
        return compte;
    }

    public void setCompte(int compte) {
        this.compte = compte;
    }
}
