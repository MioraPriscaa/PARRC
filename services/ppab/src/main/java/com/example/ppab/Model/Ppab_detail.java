package com.example.ppab.Model;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
@Entity
@Immutable
@Table(name = "ppab_detail")
public class Ppab_detail {

    @Id
    @Column(name = "codeA2")
    private int codeA2;

    @Column(name = "codeA1")
    private int codeA1;

    @Column(name = "Actions/Activites")
    private String actionsActivites;

    @Column(name = "Libellé")
    private String libelle;

    @Column(name = "Cible")
    private String cible;

    @Column(name = "Type action")
    private String typeActivite;

    @Column(name = "Mode d'exécution")
    private String modeExecution;

    @Column(name = "Resp")
    private String responsable;

    @Column(name = "Bénéficiaires")
    private String beneficiaires;

    @Column(name = "Budget (en euros)")
    private BigDecimal budget;

    @Column(name = "Budget 2023 (en euros)")
    private BigDecimal budget2023;

    @Column(name = "Budget 2024 (en euros)")
    private BigDecimal budget2024;

    @Column(name = "Budget 2025 (en euros)")
    private BigDecimal budget2025;

    @Column(name = "Budget 2026 (en euros)")
    private BigDecimal budget2026;

    @Column(name = "Budget 2027 (en euros)")
    private BigDecimal budget2027;

    // Getters and Setters

    public int getCodeA2() {
        return codeA2;
    }

    public void setCodeA2(int codeA2) {
        this.codeA2 = codeA2;
    }

    public int getCodeA1() {
        return codeA1;
    }

    public void setCodeA1(int codeA1) {
        this.codeA1 = codeA1;
    }

    public String getActionsActivites() {
        return actionsActivites;
    }

    public void setActionsActivites(String actionsActivites) {
        this.actionsActivites = actionsActivites;
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

    public String getTypeActivite() {
        return typeActivite;
    }

    public void setTypeActivite(String typeActivite) {
        this.typeActivite = typeActivite;
    }

    public String getModeExecution() {
        return modeExecution;
    }

    public void setModeExecution(String modeExecution) {
        this.modeExecution = modeExecution;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getBeneficiaires() {
        return beneficiaires;
    }

    public void setBeneficiaires(String beneficiaires) {
        this.beneficiaires = beneficiaires;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public BigDecimal getBudget2023() {
        return budget2023;
    }

    public void setBudget2023(BigDecimal budget2023) {
        this.budget2023 = budget2023;
    }

    public BigDecimal getBudget2024() {
        return budget2024;
    }

    public void setBudget2024(BigDecimal budget2024) {
        this.budget2024 = budget2024;
    }

    public BigDecimal getBudget2025() {
        return budget2025;
    }

    public void setBudget2025(BigDecimal budget2025) {
        this.budget2025 = budget2025;
    }

    public BigDecimal getBudget2026() {
        return budget2026;
    }

    public void setBudget2026(BigDecimal budget2026) {
        this.budget2026 = budget2026;
    }

    public BigDecimal getBudget2027() {
        return budget2027;
    }

    public void setBudget2027(BigDecimal budget2027) {
        this.budget2027 = budget2027;
    }
}
