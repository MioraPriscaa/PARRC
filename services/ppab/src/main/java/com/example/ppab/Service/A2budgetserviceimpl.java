package com.example.ppab.Service;

import com.example.ppab.Model.A2budget;
import com.example.ppab.Repository.A2budgetrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class A2budgetserviceimpl implements A2budgetservice {
    @Autowired
    private A2budgetrepo a2budgetrepo;

    @Override
    public A2budget insererA2budget(A2budget a2budget) {
        return a2budgetrepo.save(a2budget);
    }

    @Override
    public List<A2budget> listeA2budget() {
        return a2budgetrepo.findAll();
    }

    @Transactional
    public void updateEtat(int ida2budget, int newEtat) {
        a2budgetrepo.updateetat(ida2budget, newEtat);
    }
}
