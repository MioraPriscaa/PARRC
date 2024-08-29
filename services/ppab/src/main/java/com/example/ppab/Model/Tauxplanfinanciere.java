package com.example.ppab.Model;

import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Immutable
public class Tauxplanfinanciere {
    @Id
    int codecompo;

    double montant;

    double pourcentage;

    public Tauxplanfinanciere() {
    }

    public Tauxplanfinanciere(int codecompo, double montant, double pourcentage) {
        this.codecompo = codecompo;
        this.montant = montant;
        this.pourcentage = pourcentage;
    }

    public int getCodecompo() {
        return codecompo;
    }

    public void setCodecompo(int codecompo) {
        this.codecompo = codecompo;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }
}
