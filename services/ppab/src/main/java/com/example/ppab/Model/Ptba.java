package com.example.ppab.Model;


import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Entity
@Immutable
public class Ptba {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "codeA2")
    private String codeA2;

    @Column(name = "Actions")
    private String actions;

    @Column(name = "Libelle")
    private String libelle;

    @Column(name = "Cible")
    private String cible;

    @Column(name = "Typeaction")
    private String typeAction;

    @Column(name = "Modedexecution")
    private String modeExecution;

    @Column(name = "Resp")
    private String resp;

    @Column(name = "Beneficiaires")
    private String beneficiaires;

    @Column(name = "Annee")
    private int annee;

    @Column(name = "Budget")
    private double budget;

    public Ptba() {
    }

    public Ptba(int id, String codeA2, String actions, String libelle, String cible, String typeAction, String modeExecution, String resp, String beneficiaires, int annee, double budget) {
        this.id = id;
        this.codeA2 = codeA2;
        this.actions = actions;
        this.libelle = libelle;
        this.cible = cible;
        this.typeAction = typeAction;
        this.modeExecution = modeExecution;
        this.resp = resp;
        this.beneficiaires = beneficiaires;
        this.annee = annee;
        this.budget = budget;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeA2() {
        return codeA2;
    }

    public void setCodeA2(String codeA2) {
        this.codeA2 = codeA2;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCible() {
        return cible;
    }

    public void setCible(String cible) {
        this.cible = cible;
    }

    public String getTypeAction() {
        return typeAction;
    }

    public void setTypeAction(String typeAction) {
        this.typeAction = typeAction;
    }

    public String getModeExecution() {
        return modeExecution;
    }

    public void setModeExecution(String modeExecution) {
        this.modeExecution = modeExecution;
    }

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }

    public String getBeneficiaires() {
        return beneficiaires;
    }

    public void setBeneficiaires(String beneficiaires) {
        this.beneficiaires = beneficiaires;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
