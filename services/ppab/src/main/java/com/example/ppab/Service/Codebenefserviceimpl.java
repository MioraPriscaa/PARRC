package com.example.ppab.Service;

import com.example.ppab.Model.Codebenef;
import com.example.ppab.Repository.CodeBenefRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Codebenefserviceimpl implements CodeBenefservice{
    @Autowired
    private CodeBenefRepo codeBenefRepo;

    @Override
    public Codebenef inserercodebenef(Codebenef codeBenef) {
        return codeBenefRepo.save(codeBenef);
    }

    @Override
    public List<Codebenef> listecodebenef() {
        return codeBenefRepo.findAll();
    }
}
