package com.example.ppab.Repository;

import com.example.ppab.Model.Planfinaciere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Planfinaciererepo extends JpaRepository<Planfinaciere,Integer> {
    @Query(value = "WITH TotalAmount AS ( " +
            "SELECT SUM(montant) AS total " +
            "FROM Planfinaciere ) " +
            "SELECT d.codecompo, " +
            "d.montant AS montant, " +
            "(d.montant * 100.0 / ta.total) AS pourcentage " +
            "FROM Planfinaciere AS d, TotalAmount AS ta",
            nativeQuery = true)
    List<Object[]> tauxcomposante();
}
