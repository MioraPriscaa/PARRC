package com.example.ppab.Service;

import com.example.ppab.Model.A2modeexecution;
import com.example.ppab.Repository.A2modeexecutionrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class A2modeexecutionserviceimpl implements A2modeexecutionservice{
    @Autowired
    private A2modeexecutionrepo a2modeexecutionrepo;

    @Override
    public A2modeexecution insererA2modeexecution(A2modeexecution a2modeexecution) {
        return a2modeexecutionrepo.save(a2modeexecution);
    }

    @Override
    public List<A2modeexecution> listeA2modeexecution() {
        return a2modeexecutionrepo.findAll();
    }


}
