package com.example.ppab.Service;

import com.example.ppab.Model.Codebenef;

import java.util.List;

public interface CodeBenefservice {
    public Codebenef inserercodebenef(Codebenef codeBenef);

    public List<Codebenef> listecodebenef();
}
