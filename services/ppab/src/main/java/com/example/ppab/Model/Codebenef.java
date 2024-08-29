package com.example.ppab.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Codebenef {
    @Id
    String Codebenef;
    @Column(columnDefinition = "TEXT")
    String Designation;

    public Codebenef() {
    }

    public Codebenef(String codebenef, String designation) {
        Codebenef = codebenef;
        Designation = designation;
    }

    public String getCodebenef() {
        return Codebenef;
    }

    public void setCodebenef(String codebenef) {
        Codebenef = codebenef;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }
}
