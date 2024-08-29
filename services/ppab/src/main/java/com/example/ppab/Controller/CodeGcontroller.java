package com.example.ppab.Controller;

import com.example.ppab.Model.CodeG;
import com.example.ppab.Service.CodeGservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/codeG")
public class CodeGcontroller {
    @Autowired
    private CodeGservice codeGservice;

    @PostMapping("/inserer_codeg")
    public String inserercodebenef(@RequestBody CodeG codeG){
        codeGservice.insererCodeG(codeG);
        return "nouveau codebenef";
    }
    @GetMapping("/liste_codeg")
    public List<CodeG> listecodebenef(){
        return codeGservice.listeCodeG();
    }
}
