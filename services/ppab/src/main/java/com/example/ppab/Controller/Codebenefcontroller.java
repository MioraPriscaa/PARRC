package com.example.ppab.Controller;

import com.example.ppab.Model.Codebenef;
import com.example.ppab.Service.CodeBenefservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Codebenefcontroller {
    @Autowired
    private CodeBenefservice codeBenefservice;
    @PostMapping("/inserer_codebenef")
    public String inserercodebenef(@RequestBody Codebenef codeBenef){
        codeBenefservice.inserercodebenef(codeBenef);
        return "nouveau codebenef";
    }
    @GetMapping("/liste_codebenef")
    public List<Codebenef> listecodebenef(){
        return codeBenefservice.listecodebenef();
    }
}
