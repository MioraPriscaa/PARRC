package com.example.ppab.Service;

import com.example.ppab.Model.A1responsable;
import com.example.ppab.Repository.A1responsablerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class A1responsableserviceimpl implements A1responsableservice{
    @Autowired
    private A1responsablerepo a1responsablerepo;

    @Override
    public A1responsable insererA1responsable(A1responsable a1responsable) {
        return a1responsablerepo.save(a1responsable);
    }

    @Override
    public List<A1responsable> listeA1responsable() {
        return a1responsablerepo.findAll();
    }
}
