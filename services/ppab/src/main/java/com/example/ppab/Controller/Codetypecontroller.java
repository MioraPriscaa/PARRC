package com.example.ppab.Controller;

import com.example.ppab.Model.Codetype;
import com.example.ppab.Service.codetypeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Codetypecontroller {
    @Autowired
    private codetypeservice codetypeservice;

    @PostMapping("/inserer_codetype")
    public String inserercodetype(@RequestBody Codetype codetype){
        codetypeservice.inserercodetype(codetype);
        return "nouveau codetype";
    }
    @GetMapping("/liste_codetype")
    public List<Codetype> listecodebenef(){
        return codetypeservice.listecodetype();
    }
}
