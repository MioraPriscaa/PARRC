package com.example.ppab.Service;

import com.example.ppab.Model.Modeexecution;
import com.example.ppab.Repository.ModeexecutionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Modeexecutionserviceimpl implements ModeexecutionService{

    @Autowired
    private ModeexecutionRepo modeexecutionRepo;

    @Override
    public Modeexecution insererME(Modeexecution modeexecution) {
        return modeexecutionRepo.save(modeexecution);
    }

    @Override
    public List<Modeexecution> allME() {
        return modeexecutionRepo.findAll();
    }
}
