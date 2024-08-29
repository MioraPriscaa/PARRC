package com.example.ppab.Service;

import com.example.ppab.Model.A2benef;
import com.example.ppab.Repository.A2benefrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class A2benefserviceimpl implements A2benefservice{
    @Autowired
    private A2benefrepo a2benefrepo;

    @Override
    public A2benef insererA2benef(A2benef a2benef) {
        return a2benefrepo.save(a2benef);
    }

    @Override
    public List<A2benef> listeA2benef() {
        return a2benefrepo.findAll();
    }
}
