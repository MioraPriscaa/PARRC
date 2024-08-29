package com.example.ppab.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class A2modeexecution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int ida2modeexecution;

    String modeexecution;

    int codea2;

    public A2modeexecution() {
    }

    public A2modeexecution(int ida2modeexecution, String modeexecution, int codea2) {
        this.ida2modeexecution = ida2modeexecution;
        this.modeexecution = modeexecution;
        this.codea2 = codea2;
    }

    public int getIda2modeexecution() {
        return ida2modeexecution;
    }

    public void setIda2modeexecution(int ida2modeexecution) {
        this.ida2modeexecution = ida2modeexecution;
    }

    public String getModeexecution() {
        return modeexecution;
    }

    public void setModeexecution(String modeexecution) {
        this.modeexecution = modeexecution;
    }

    public int getCodea2() {
        return codea2;
    }

    public void setCodea2(int codea2) {
        this.codea2 = codea2;
    }
}
