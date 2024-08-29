package com.example.ppab.Controller;

import com.example.ppab.Model.CodeA1;
import com.example.ppab.Model.CodeA2;
import com.example.ppab.Service.CodeA1service;
import com.example.ppab.Service.CodeA2service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CodeAAcontroller {
    @Autowired
    private CodeA2service codeA2service;

    @Autowired
    private CodeA1service codeA1service;

    @PostMapping("/inserer_codea1")
    public String inserercodea1(@RequestBody CodeA1 codeA1){
        codeA1service.insererCodeA1(codeA1);
        return "nouveau codeA1";
    }
    @GetMapping("/liste_codea1")
    public List<CodeA1> listecodea1(){
        return codeA1service.listeCodeA1();
    }

    @PostMapping("/inserer_codea2")
    public String inserercodea2(@RequestBody CodeA2 codeA2){
        codeA2service.insererCodeA2(codeA2);
        return "nouveau codeA2";
    }
    @GetMapping("/liste_codea2")
    public List<CodeA2> listecodea2(){
        return codeA2service.listeCodeA2();
    }

}
