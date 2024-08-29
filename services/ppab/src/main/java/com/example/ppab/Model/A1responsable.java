package com.example.ppab.Model;

import javax.persistence.*;

@Entity
@Table(name = "A1responsable")
public class A1responsable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Utilise SERIAL dans PostgreSQL
    @Column(name = "id", updatable = false, nullable = false)
    int id;
    int codeA1;


    String responsable;

    public A1responsable() {
    }

    public A1responsable(int codeA1, String responsable) {
        this.codeA1 = codeA1;
        this.responsable = responsable;
    }

    public int getCodeA1() {
        return codeA1;
    }

    public void setCodeA1(int codeA1) {
        this.codeA1 = codeA1;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
}
