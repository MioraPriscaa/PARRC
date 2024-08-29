package com.example.ppab.Service;

import com.example.ppab.Model.Compte;
import com.example.ppab.Repository.CompteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Compteserviceimpl implements Compteservice{
    @Autowired
    private CompteRepo compteRepo;

    @Override
    public Compte insererCompte(Compte compte) {
        return compteRepo.save(compte);
    }

    @Override
    public List<Compte> listeCompte() {
        return compteRepo.findAll();
    }
}
