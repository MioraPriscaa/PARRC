package com.example.ppab.Controller;

import com.example.ppab.Model.Codebenef;
import com.example.ppab.Service.CodeBenefservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/codeBenef")
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
