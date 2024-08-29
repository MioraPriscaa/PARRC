package com.example.ppab.Controller;

import com.example.ppab.Model.A1responsable;
import com.example.ppab.Model.A2benef;
import com.example.ppab.Model.A2budget;
import com.example.ppab.Model.A2modeexecution;
import com.example.ppab.Service.A1responsableservice;
import com.example.ppab.Service.A2benefservice;
import com.example.ppab.Service.A2budgetservice;
import com.example.ppab.Service.A2modeexecutionservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/associative")
public class Assocativecontroller {
    @Autowired
    private A1responsableservice a1responsableservice;

    @Autowired
    private A2benefservice a2benefservice;

    @Autowired
    private A2modeexecutionservice a2modeexecutionservice;

    @Autowired
    private A2budgetservice a2budgetservice;


    @PostMapping("/inserer_a1responsable")
    public String inserera1responsable(@RequestBody A1responsable a1responsable){
        a1responsableservice.insererA1responsable(a1responsable);
        return "nouveau a1responsable";
    }
    @GetMapping("/liste_a1responsable")
    public List<A1responsable> listea1responsable(){
        return a1responsableservice.listeA1responsable();
    }

    @PostMapping("/inserer_a2benef")
    public String inserera2benef(@RequestBody A2benef a2benef){
        a2benefservice.insererA2benef(a2benef);
        return "nouveau a2benef";
    }
    @GetMapping("/liste_a2benef")
    public List<A2benef> listea2benef(){
        return a2benefservice.listeA2benef();
    }

    @PostMapping("/inserer_A2modeexecution")
    public String insererA2modeexecution(@RequestBody A2modeexecution a2modeexecution){
        a2modeexecutionservice.insererA2modeexecution(a2modeexecution);
        return "nouveau A2modeexecution";
    }
    @GetMapping("/liste_A2modeexecution")
    public List<A2modeexecution> listeA2modeexecution(){
        return a2modeexecutionservice.listeA2modeexecution();
    }

    @PostMapping("/inserer_A2budget")
    public String insererA2budget(@RequestBody A2budget a2budget){
        a2budgetservice.insererA2budget(a2budget);
        return "nouveau A2budget";
    }
    @GetMapping("/liste_A2budget")
    public List<A2budget> listeA2budget(){
        return a2budgetservice.listeA2budget();
    }

    @PatchMapping("/{ida2budget}/valider")
    public ResponseEntity<String> updatevalidation(@PathVariable("ida2budget") int ida2budget,@RequestParam(value = "newEtat", defaultValue = "10") int newEtat){
        a2budgetservice.updateEtat(ida2budget,newEtat);
        return ResponseEntity.ok("ecriture valide");
    }

    @PatchMapping("/{ida2budget}/supprimer")
    public ResponseEntity<String> supprimer(@PathVariable("ida2budget") int ida2budget,@RequestParam(value = "newEtat", defaultValue = "0") int newEtat){
        a2budgetservice.updateEtat(ida2budget,newEtat);
        return ResponseEntity.ok("ecriture valide");
    }


}
