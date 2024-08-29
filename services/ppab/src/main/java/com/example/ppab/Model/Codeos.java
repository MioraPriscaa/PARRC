package com.example.ppab.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Codeos {
    @Id
    int codeos;

    @Column(columnDefinition = "TEXT")
    String designation;

    int codecompo;

    public Codeos() {
    }

    public Codeos(int codeos, String designation, int codecompo) {
        this.codeos = codeos;
        this.designation = designation;
        this.codecompo = codecompo;
    }

    public int getCodecompo() {
        return codecompo;
    }

    public void setCodecompo(int codecompo) {
        this.codecompo = codecompo;
    }

    public int getCodeos() {
        return codeos;
    }

    public void setCodeos(int codeos) {
        this.codeos = codeos;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


}
