package com.example.ppab.Controller;

import com.example.ppab.Model.Codeos;
import com.example.ppab.Service.CodeOsservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CodeOscontroller {
    @Autowired
    private CodeOsservice codeOsservice;
    @PostMapping("/inserer_codeOs")
    public String inserercodeOs(@RequestBody Codeos codeOs){
        codeOsservice.inserercodeOs(codeOs);
        return "nouveau codebenef";
    }
    @GetMapping("/liste_codeOs")
    public List<Codeos> listecodeOs(){
        return codeOsservice.listecodeOs();
    }
}
