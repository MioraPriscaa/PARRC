package com.example.ppab.Service;

import com.example.ppab.Model.Codert;
import com.example.ppab.Repository.CodeRtrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CodeRtserviceimpl implements CodeRtservice {
    @Autowired
    private CodeRtrepo codeRtrepo;

    @Override
    public Codert inserercodert(Codert codeRt) {
        return codeRtrepo.save(codeRt);
    }

    @Override
    public List<Codert> listecodert() {
        return codeRtrepo.findAll();
    }
}
