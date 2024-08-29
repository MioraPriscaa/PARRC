package com.example.ppab.Service;

import com.example.ppab.Model.CodeG;
import com.example.ppab.Repository.CodeGrepo;
import com.example.ppab.Service.CodeGservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeGserviceimpl implements CodeGservice {
    @Autowired
    private CodeGrepo codeGrepo;

    @Override
    public CodeG insererCodeG(CodeG CodeG) {
        return codeGrepo.save(CodeG);
    }

    @Override
    public List<CodeG> listeCodeG() {
        return codeGrepo.findAll();
    }
}
