package com.example.ppab.Repository;

import com.example.ppab.Model.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepo extends JpaRepository<Compte,Integer> {
}
