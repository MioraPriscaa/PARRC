package com.example.ppab.Controller;

import com.example.ppab.Model.Ptba;
import com.example.ppab.Service.Ptbaservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Ptbacontroller {
    @Autowired
    private Ptbaservice ptbaservice;
    @GetMapping("/ptba")
    public List<Ptba> listeptba(@RequestParam("annee") int annee){
        return ptbaservice.find(annee);
    }

//    @GetMapping("/ptbas")
//    public List<Ptba> listeptbas(){
//        return ptbaservice.finds();
//    }
}
