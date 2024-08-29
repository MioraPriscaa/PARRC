package com.example.ppab.Model;

import javax.persistence.*;

@Entity
public class Codecompo {
    @Id @GeneratedValue(strategy =GenerationType.AUTO)
    int codecompo;

    @Column(columnDefinition = "TEXT")
    String Designation;

    public Codecompo() {
    }

    public Codecompo(int codecompo, String designation) {
        this.codecompo = codecompo;
        Designation = designation;
    }

    public int getCodecompo() {
        return codecompo;
    }

    public void setCodecompo(int codecompo) {
        this.codecompo = codecompo;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }
}
