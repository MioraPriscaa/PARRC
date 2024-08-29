package com.example.ppab.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Planfinaciere {
    @Id
    int codecompo;

    Double montant;

    public Planfinaciere() {
    }

    public Planfinaciere(int codecompo, Double montant) {
        this.codecompo = codecompo;
        this.montant = montant;
    }

    public int getCodecompo() {
        return codecompo;
    }

    public void setCodecompo(int codecompo) {
        this.codecompo = codecompo;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }
}
