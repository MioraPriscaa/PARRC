package com.example.ppab.Controller;

import com.example.ppab.Model.TauxChange;
import com.example.ppab.Service.TauxchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

@RestController
@RequestMapping("/tauxChange")
public class Tauxchangecontroller {
    @Autowired
    private TauxchangeService tauxchangeService;

    @PostMapping("/inserertc")
    public String inserer(@RequestBody TauxChange codeA1, @RequestBody Date dte){
        tauxchangeService.inserertc(codeA1,dte);
        return "nouveau taux de change";
    }
}
