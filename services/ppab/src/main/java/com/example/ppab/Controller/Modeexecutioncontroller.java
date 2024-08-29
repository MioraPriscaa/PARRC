package com.example.ppab.Controller;

import com.example.ppab.Model.Modeexecution;
import com.example.ppab.Service.ModeexecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modeExecution")
public class Modeexecutioncontroller {
    @Autowired
    private ModeexecutionService modeexecutionService;
    @PostMapping("/inserer_me")
    public String insertionME(@RequestBody Modeexecution modeexecution){
        modeexecutionService.insererME(modeexecution);
        return "Nouveau ME";
    }
    @GetMapping("/liste_me")
    public List<Modeexecution> listeME(){
        return modeexecutionService.allME();
    }

}
