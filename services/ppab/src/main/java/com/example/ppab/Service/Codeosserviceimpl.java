package com.example.ppab.Service;

import com.example.ppab.Model.Codeos;
import com.example.ppab.Repository.CodeOsrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Codeosserviceimpl implements CodeOsservice{
    @Autowired
    private CodeOsrepo codeOsrepo;

    @Override
    public Codeos inserercodeOs(Codeos codeOs) {
        return codeOsrepo.save(codeOs);
    }

    @Override
    public List<Codeos> listecodeOs() {
        return codeOsrepo.findAll();
    }
}
