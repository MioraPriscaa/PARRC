package com.example.ppab.Repository;

import com.example.ppab.Model.TauxChange;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

public interface Tauxchangerepo extends JpaRepository<TauxChange,Integer> {
    Optional<TauxChange> findByDate(Date date);
}
