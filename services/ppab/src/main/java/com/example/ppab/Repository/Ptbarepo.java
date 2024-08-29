package com.example.ppab.Repository;

import com.example.ppab.Model.Ptba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Ptbarepo extends JpaRepository<Ptba,Integer> {
    @Query("SELECT p FROM Ptba p WHERE p.annee = :annee")
    List<Ptba> findptba(@Param("annee") int annee);
}
