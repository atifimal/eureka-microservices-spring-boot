package com.atifimal.microservices.basic.currencyservice.service;

import com.atifimal.microservices.basic.currencyservice.entity.CurrencyRate;
import com.atifimal.microservices.basic.currencyservice.repository.CurrencyRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CurrencyRateService_Impl implements CurrencyRateService{

    @Autowired
    CurrencyRateRepository currencyRateRepository;

    @Override
    public CurrencyRate findByFromAndTo(String from, String to) {
        return currencyRateRepository.findByFromAndTo(from, to);
    }

    @Override
    public void save(CurrencyRate currencyRate) {
        currencyRateRepository.save(currencyRate);
    }
}
