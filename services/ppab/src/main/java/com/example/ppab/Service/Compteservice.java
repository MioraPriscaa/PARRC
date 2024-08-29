package com.example.ppab.Service;

import com.example.ppab.Model.Compte;

import java.util.List;

public interface Compteservice {

    public Compte insererCompte(Compte compte);

    public List<Compte> listeCompte();
}
