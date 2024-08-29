package com.example.ppab.Service;

import com.example.ppab.Model.Ppab_detail;

import java.math.BigDecimal;
import java.util.List;

public interface Ppabservice {
    public List<Ppab_detail> findppab();

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
    );
}
