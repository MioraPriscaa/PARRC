package com.example.ppab.Service;


import com.example.ppab.Model.TauxChange;

import java.sql.Date;
import java.util.Optional;

public interface TauxchangeService {

    Optional<TauxChange> findtcbydate(Date dte);

    TauxChange inserertc(TauxChange tc,Date dte);
}
