package com.example.ppab.Controller;

import com.example.ppab.Model.Compte;
import com.example.ppab.Service.Compteservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compte")
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
