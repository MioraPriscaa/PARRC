package com.example.ppab.Service;

import com.example.ppab.Model.Codetype;
import com.example.ppab.Model.Responsable;

import java.util.List;

public interface Responsableservice {
    public Responsable insererresponsable(Responsable responsable);

    public List<Responsable> listeresponsable();
}
