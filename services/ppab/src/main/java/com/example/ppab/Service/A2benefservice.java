package com.example.ppab.Service;

import com.example.ppab.Model.A1responsable;
import com.example.ppab.Model.A2benef;

import java.util.List;

public interface A2benefservice {
    public A2benef insererA2benef(A2benef a2benef);

    public List<A2benef> listeA2benef();
}
