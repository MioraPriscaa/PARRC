package com.example.ppab.Controller;

import com.example.ppab.Model.Ppab_detail;
import com.example.ppab.Service.Ppabservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/ppab")
public class Ppabcontroller {
    @Autowired
    private Ppabservice ppabservice;
    @GetMapping("/ab")
    public List<Ppab_detail> listeppab(){
        return ppabservice.findppab();
    }


    @GetMapping("/search")
    public List<Ppab_detail> getPpabDetails(
            @RequestParam(value = "codeA1", required = false) Integer codeA1,
            @RequestParam(value = "actionActivites", required = false) String actionActivites,
            @RequestParam(value = "libelle", required = false) String libelle,
            @RequestParam(value = "cible", required = false) String cible,
            @RequestParam(value = "typeAction", required = false) String typeAction,
            @RequestParam(value = "modeExecution", required = false) String modeExecution,
            @RequestParam(value = "responsable", required = false) String responsable,
            @RequestParam(value = "beneficiaires", required = false) String beneficiaires,
            @RequestParam(value = "budgetMin", required = false) BigDecimal budgetMin,
            @RequestParam(value = "budgetMax", required = false) BigDecimal budgetMax,
            @RequestParam(value = "budget2023Min", required = false) BigDecimal budget2023Min,
            @RequestParam(value = "budget2023Max", required = false) BigDecimal budget2023Max,
            @RequestParam(value = "budget2024Min", required = false) BigDecimal budget2024Min,
            @RequestParam(value = "budget2024Max", required = false) BigDecimal budget2024Max,
            @RequestParam(value = "budget2025Min", required = false) BigDecimal budget2025Min,
            @RequestParam(value = "budget2025Max", required = false) BigDecimal budget2025Max,
            @RequestParam(value = "budget2026Min", required = false) BigDecimal budget2026Min,
            @RequestParam(value = "budget2026Max", required = false) BigDecimal budget2026Max,
            @RequestParam(value = "budget2027Min", required = false) BigDecimal budget2027Min,
            @RequestParam(value = "budget2027Max", required = false) BigDecimal budget2027Max
    ) {
        return ppabservice.searchPpabDetails(
                codeA1, actionActivites, libelle, cible, typeAction,
                modeExecution, responsable, beneficiaires, budgetMin,
                budgetMax, budget2023Min, budget2023Max, budget2024Min,
                budget2024Max, budget2025Min, budget2025Max, budget2026Min,
                budget2026Max, budget2027Min, budget2027Max
        );
    }


}
