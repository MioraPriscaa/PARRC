package com.example.ppab.Service;

import com.example.ppab.Model.Responsable;
import com.example.ppab.Repository.Responsablerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Responsableserviceimpl implements Responsableservice {
    @Autowired
    private Responsablerepo responsablerepo;

    @Override
    public List<Responsable> listeresponsable() {
        return responsablerepo.findAll();
    }

    @Override
    public Responsable insererresponsable(Responsable responsable) {
        return responsablerepo.save(responsable);
    }
}
