package com.example.ppab.Service;

import com.example.ppab.Model.A2budget;
import com.example.ppab.Model.A2modeexecution;

import java.util.List;

public interface A2budgetservice {
    public A2budget insererA2budget(A2budget a2budget);

    public List<A2budget> listeA2budget();

    void updateEtat(int ida2budget, int newEtat);
}
