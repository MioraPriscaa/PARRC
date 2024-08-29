package com.example.ppab.Model;

import javax.persistence.*;

@Entity
public class A2budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idA2budget;
    int codea2;

    int  annee;
    @Column(name = "etat", nullable = false, columnDefinition = "int default 5")
    int etat;

    double montant;

    public A2budget() {
    }

    public A2budget(int idA2budget, int codea2, int annee, int etat, double montant) {
        this.idA2budget = idA2budget;
        this.codea2 = codea2;
        this.annee = annee;
        this.etat = etat;
        this.montant = montant;
    }

    public int getIdA2budget() {
        return idA2budget;
    }

    public void setIdA2budget(int idA2budget) {
        this.idA2budget = idA2budget;
    }

    public int getCodea2() {
        return codea2;
    }

    public void setCodea2(int codea2) {
        this.codea2 = codea2;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}
