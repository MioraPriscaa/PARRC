package com.example.ppab.Repository;

import com.example.ppab.Model.A2budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface A2budgetrepo extends JpaRepository<A2budget,Integer> {
    @Modifying
    @Query("update A2budget a2b SET etat= :newEtat where a2b.idA2budget = :ida2budget")
    void updateetat(@Param("ida2budget") int ida2budget, @Param("newEtat") int  newEtat);

}
