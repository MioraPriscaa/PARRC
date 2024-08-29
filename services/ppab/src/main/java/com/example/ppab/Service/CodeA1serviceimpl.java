package com.example.ppab.Service;

import com.example.ppab.Model.CodeA1;
import com.example.ppab.Repository.CodeA1repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeA1serviceimpl implements CodeA1service {
    @Autowired
    private CodeA1repo codeA1repo;

    @Override
    public CodeA1 insererCodeA1(CodeA1 codeA1) {
        return codeA1repo.save(codeA1);
    }

    @Override
    public List<CodeA1> listeCodeA1() {
        return codeA1repo.findAll();
    }
}
