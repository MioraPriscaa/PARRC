package com.example.ppab.Model;

import javax.persistence.*;

@Entity
public class CodeA1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int codeA1;

    @Column(columnDefinition = "TEXT")
    String Designation;

    int codert;

    public CodeA1() {
    }

    public CodeA1(int codeA1, String designation, int codert) {
        this.codeA1 = codeA1;
        Designation = designation;
        this.codert = codert;
    }

    public CodeA1(int codeA1, String designation) {
        this.codeA1 = codeA1;
        Designation = designation;
    }

    public int getCodeA1() {
        return codeA1;
    }

    public void setCodeA1(int codeA1) {
        this.codeA1 = codeA1;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public int getCodert() {
        return codert;
    }

    public void setCodert(int codert) {
        this.codert = codert;
    }
}
