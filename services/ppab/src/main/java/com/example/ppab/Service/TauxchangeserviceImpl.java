package com.example.ppab.Service;

import com.example.ppab.Model.TauxChange;
import com.example.ppab.Repository.Tauxchangerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Optional;

@Service
public class TauxchangeserviceImpl implements TauxchangeService{
    @Autowired
    private Tauxchangerepo tauxchangerepo;

    @Override
    public Optional<TauxChange> findtcbydate(Date dte) {
        return tauxchangerepo.findByDate(dte);
    }

    @Override
    public TauxChange inserertc(TauxChange tc,Date dte) {
        return findtcbydate(dte)
                .orElse(tauxchangerepo.save(tc));
    }

}
