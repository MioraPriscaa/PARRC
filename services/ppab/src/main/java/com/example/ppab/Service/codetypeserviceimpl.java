package com.example.ppab.Service;

import com.example.ppab.Model.Codetype;
import com.example.ppab.Repository.Codetyperepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class codetypeserviceimpl implements  codetypeservice{
    @Autowired
    private Codetyperepo codetyperepo;

    @Override
    public Codetype inserercodetype(Codetype codetype) {
        return codetyperepo.save(codetype);
    }

    @Override
    public List<Codetype> listecodetype() {
        return codetyperepo.findAll();
    }
}
