package com.example.ppab.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class A2benef {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int ida2benef;

    String codebenef;

    int codea2;

    public A2benef() {
    }

    public A2benef(int ida2benef, String codebenef, int codea2) {
        this.ida2benef = ida2benef;
        this.codebenef = codebenef;
        this.codea2 = codea2;
    }

    public int getIda2benef() {
        return ida2benef;
    }

    public void setIda2benef(int ida2benef) {
        this.ida2benef = ida2benef;
    }

    public String getCodebenef() {
        return codebenef;
    }

    public void setCodebenef(String codebenef) {
        this.codebenef = codebenef;
    }

    public int getCodea2() {
        return codea2;
    }

    public void setCodea2(int codea2) {
        this.codea2 = codea2;
    }
}
