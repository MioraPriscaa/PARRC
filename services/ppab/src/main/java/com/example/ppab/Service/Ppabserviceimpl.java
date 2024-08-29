package com.example.ppab.Service;

import com.example.ppab.Model.Ppab_detail;
import com.example.ppab.Repository.Ppabdetailrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class Ppabserviceimpl implements Ppabservice{
    @Autowired
    private Ppabdetailrepo ppabdetailrepo;

    @Override
    public List<Ppab_detail> findppab() {
        return ppabdetailrepo.findppab();
    }

    public List<Ppab_detail> searchPpabDetails(
            Integer codeA1,
            String actionActivites,
            String libelle,
            String cible,
            String typeAction,
            String modeExecution,
            String responsable,
            String beneficiaires,
            BigDecimal budgetMin,
            BigDecimal budgetMax,
            BigDecimal budget2023Min,
            BigDecimal budget2023Max,
            BigDecimal budget2024Min,
            BigDecimal budget2024Max,
            BigDecimal budget2025Min,
            BigDecimal budget2025Max,
            BigDecimal budget2026Min,
            BigDecimal budget2026Max,
            BigDecimal budget2027Min,
            BigDecimal budget2027Max
    ) {
        return ppabdetailrepo.findByMultipleCriteria(
                codeA1, actionActivites, libelle, cible, typeAction,
                modeExecution, responsable, beneficiaires, budgetMin,
                budgetMax, budget2023Min, budget2023Max, budget2024Min,
                budget2024Max, budget2025Min, budget2025Max, budget2026Min,
                budget2026Max, budget2027Min, budget2027Max
        );
    }
}
