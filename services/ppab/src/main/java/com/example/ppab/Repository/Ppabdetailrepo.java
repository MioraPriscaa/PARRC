package com.example.ppab.Repository;

import com.example.ppab.Model.Ppab_detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface Ppabdetailrepo extends JpaRepository<Ppab_detail,Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM Ppab_detail")
    List<Ppab_detail> findppab();

    @Query(value = "SELECT * " +
            "FROM ppab_detail " +
            "WHERE 1=1 " +
            "AND (:codeA1 IS NULL OR \"codeA1\" = :codeA1) " +
            "AND (:actionActivites IS NULL OR \"Actions/Activites\" ILIKE '%' || :actionActivites || '%') " +
            "AND (:libelle IS NULL OR \"Libellé\" ILIKE '%' || :libelle || '%') " +
            "AND (:cible IS NULL OR \"Cible\" ILIKE '%' || :cible || '%') " +
            "AND (:typeAction IS NULL OR \"Type action\" = :typeAction) " +
            "AND (:modeExecution IS NULL OR \"Mode d'exécution\" ILIKE '%' || :modeExecution || '%') " +
            "AND (:responsable IS NULL OR \"Resp\" ILIKE '%' || :responsable || '%') " +
            "AND (:beneficiaires IS NULL OR \"Bénéficiaires\" ILIKE '%' || :beneficiaires || '%') " +
            "AND (:budgetMin IS NULL OR \"Budget (en euros)\" >= :budgetMin) " +
            "AND (:budgetMax IS NULL OR \"Budget (en euros)\" <= :budgetMax) " +
            "AND (:budget2023Min IS NULL OR \"Budget 2023 (en euros)\" >= :budget2023Min) " +
            "AND (:budget2023Max IS NULL OR \"Budget 2023 (en euros)\" <= :budget2023Max) " +
            "AND (:budget2024Min IS NULL OR \"Budget 2024 (en euros)\" >= :budget2024Min) " +
            "AND (:budget2024Max IS NULL OR \"Budget 2024 (en euros)\" <= :budget2024Max) " +
            "AND (:budget2025Min IS NULL OR \"Budget 2025 (en euros)\" >= :budget2025Min) " +
            "AND (:budget2025Max IS NULL OR \"Budget 2025 (en euros)\" <= :budget2025Max) " +
            "AND (:budget2026Min IS NULL OR \"Budget 2026 (en euros)\" >= :budget2026Min) " +
            "AND (:budget2026Max IS NULL OR \"Budget 2026 (en euros)\" <= :budget2026Max) " +
            "AND (:budget2027Min IS NULL OR \"Budget 2027 (en euros)\" >= :budget2027Min) " +
            "AND (:budget2027Max IS NULL OR \"Budget 2027 (en euros)\" <= :budget2027Max)",
            nativeQuery = true)
    List<Ppab_detail> findByMultipleCriteria(
            @Param("codeA1") Integer codeA1,
            @Param("actionActivites") String actionActivites,
            @Param("libelle") String libelle,
            @Param("cible") String cible,
            @Param("typeAction") String typeAction,
            @Param("modeExecution") String modeExecution,
            @Param("responsable") String responsable,
            @Param("beneficiaires") String beneficiaires,
            @Param("budgetMin") BigDecimal budgetMin,
            @Param("budgetMax") BigDecimal budgetMax,
            @Param("budget2023Min") BigDecimal budget2023Min,
            @Param("budget2023Max") BigDecimal budget2023Max,
            @Param("budget2024Min") BigDecimal budget2024Min,
            @Param("budget2024Max") BigDecimal budget2024Max,
            @Param("budget2025Min") BigDecimal budget2025Min,
            @Param("budget2025Max") BigDecimal budget2025Max,
            @Param("budget2026Min") BigDecimal budget2026Min,
            @Param("budget2026Max") BigDecimal budget2026Max,
            @Param("budget2027Min") BigDecimal budget2027Min,
            @Param("budget2027Max") BigDecimal budget2027Max
    );
}
