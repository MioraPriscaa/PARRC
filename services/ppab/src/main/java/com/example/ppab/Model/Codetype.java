package com.example.ppab.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Codetype {
    @Id
    String codetype;
    @Column(columnDefinition = "TEXT")
    String Designation;

    public Codetype() {
    }

    public Codetype(String codetype, String designation) {
        this.codetype = codetype;
        Designation = designation;
    }

    public String getCodetype() {
        return codetype;
    }

    public void setCodetype(String codetype) {
        this.codetype = codetype;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }
}
