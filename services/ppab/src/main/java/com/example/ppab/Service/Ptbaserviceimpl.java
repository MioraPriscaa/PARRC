package com.example.ppab.Service;

import com.example.ppab.Model.Ptba;
import com.example.ppab.Repository.Ptbarepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Ptbaserviceimpl implements Ptbaservice{
    @Autowired
    private Ptbarepo ptbarepo;

    @Override
    public List<Ptba> find(int annee) {
        return ptbarepo.findptba(annee);
    }

//    @Override
//    public List<Ptba> finds() {
//        return ptbarepo.findAll();
//    }
}
