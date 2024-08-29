package com.example.ppab.Service;

import com.example.ppab.Model.Codecompo;
import com.example.ppab.Model.Planfinaciere;
import com.example.ppab.Repository.CodeBenefRepo;
import com.example.ppab.Repository.Codecomporepo;
import com.example.ppab.Repository.Planfinaciererepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Codecomposerviceimpl implements Codecomposervice {
    @Autowired
    private Codecomporepo codecomporepo;

    @Autowired
    private Planfinaciererepo planfinaciererepo;

    @Override
    public Codecompo insererCodecompo(Codecompo codecompo) {
        return codecomporepo.save(codecompo);
    }

    @Override
    public List<Codecompo> listeCodecompo() {
        return codecomporepo.findAll();
    }

    @Override
    public Planfinaciere insererplanfinaciere(Planfinaciere planfinaciere) {
        return planfinaciererepo.save(planfinaciere);
    }

    @Override
    public List<Object[]> tauxcomposante() {
        return planfinaciererepo.tauxcomposante();
    }
}
