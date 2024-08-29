package com.example.ppab.Controller;

import com.example.ppab.Model.CodeA1;
import com.example.ppab.Model.Responsable;
import com.example.ppab.Service.Responsableservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Responsablecontroller {
    @Autowired
    private Responsableservice responsableservice;

    @PostMapping("/inserer_responsable")
    public String insererresponsable(@RequestBody Responsable responsable){
        responsableservice.insererresponsable(responsable);
        return "nouveau codeA1";
    }
    @GetMapping("/liste_responsable")
    public List<Responsable> listeresponsable(){
        return responsableservice.listeresponsable();
    }

}
