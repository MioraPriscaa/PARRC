package com.example.ppab.Service;

import com.example.ppab.Model.CodeA2;
import com.example.ppab.Repository.CodeA1repo;
import com.example.ppab.Repository.CodeA2repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CodeA2serviceimpl implements CodeA2service{
    @Autowired
    private CodeA2repo codeA2repo;

    @Override
    public CodeA2 insererCodeA2(CodeA2 codeA2) {
        return codeA2repo.save(codeA2);
    }

    @Override
    public List<CodeA2> listeCodeA2() {
        return codeA2repo.findAll();
    }
}
