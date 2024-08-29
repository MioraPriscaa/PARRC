package com.example.ppab.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Codert {
    @Id
    @GeneratedValue
    int codert;

    @Column(columnDefinition = "TEXT")
    String designation;

    int codeos;

    public Codert() {
    }

    public Codert(int codert, String designation, int codeos) {
        this.codert = codert;
        this.designation = designation;
        this.codeos = codeos;
    }

    public int getCodert() {
        return codert;
    }

    public void setCodert(int codert) {
        this.codert = codert;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getCodeos() {
        return codeos;
    }

    public void setCodeos(int codeos) {
        this.codeos = codeos;
    }
}
