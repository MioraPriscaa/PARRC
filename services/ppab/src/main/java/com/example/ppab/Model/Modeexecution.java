package com.example.ppab.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Modeexecution {
    @Id
    String modeexecution;
    @Column(columnDefinition = "TEXT")
    String Designation;

    public Modeexecution() {
    }

    public Modeexecution(String modeexecution, String designation) {
        this.modeexecution = modeexecution;
        Designation = designation;
    }

    public String getModeexecution() {
        return modeexecution;
    }

    public void setModeexecution(String modeexecution) {
        this.modeexecution = modeexecution;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }
}
