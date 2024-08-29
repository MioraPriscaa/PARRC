package com.example.ppab.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Responsable {
    @Id
    String responsable;
    @Column(columnDefinition = "TEXT")
    String Designation;

    public Responsable() {
    }

    public Responsable(String responsable, String designation) {
        this.responsable = responsable;
        Designation = designation;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }
}
