package com.example.ppab.Controller;

import com.example.ppab.Model.Compte;
import com.example.ppab.Service.Compteservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Comptecontroller {
    @Autowired
    private Compteservice compteservice;
    @PostMapping("/inserercompte")
    public String inserercompte(@RequestBody Compte compte){
        compteservice.insererCompte(compte);
        return "nouveau compte";
    }

    @GetMapping("/liste_compte")
    public List<Compte> listecompte(){
        return compteservice.listeCompte();
    }
}
