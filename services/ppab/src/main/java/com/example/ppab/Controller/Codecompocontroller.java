package com.example.ppab.Controller;

import com.example.ppab.Model.Codecompo;
import com.example.ppab.Model.Planfinaciere;
import com.example.ppab.Service.Codecomposervice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/codeCompo")
@RestController
public class Codecompocontroller {
    @Autowired
    private Codecomposervice codecomposervice;


    @PostMapping("/inserer_codecompo")
    public String inserercodebenef(@RequestBody Codecompo codecompo){
        codecomposervice.insererCodecompo(codecompo);
        return "nouveau composante";
    }
    @GetMapping("/liste_codecompo")
    public List<Codecompo> listecodebenef(){
        return codecomposervice.listeCodecompo();
    }

    @PostMapping("/inserer_planfinaciere")
    public String inserercompo_pf(@RequestBody Planfinaciere planfinaciere){
        codecomposervice.insererplanfinaciere(planfinaciere);
        return "nouveau composantepf";
    }

    @GetMapping("/tauxcomposante")
    public List<Object[]> listetauxcomposante(){
        return codecomposervice.tauxcomposante();
    }


}
