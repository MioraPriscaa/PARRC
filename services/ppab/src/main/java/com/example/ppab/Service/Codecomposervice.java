package com.example.ppab.Service;

import com.example.ppab.Model.Codecompo;
import com.example.ppab.Model.Planfinaciere;

import java.util.List;

public interface Codecomposervice {
    public Codecompo insererCodecompo(Codecompo Codecompo);

    public List<Codecompo> listeCodecompo();

    public Planfinaciere insererplanfinaciere(Planfinaciere planfinaciere);

    public List<Object[]> tauxcomposante();
}
