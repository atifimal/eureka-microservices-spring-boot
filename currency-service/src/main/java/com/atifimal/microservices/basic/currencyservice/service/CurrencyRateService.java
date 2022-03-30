package com.atifimal.microservices.basic.currencyservice.service;

import com.atifimal.microservices.basic.currencyservice.entity.CurrencyRate;
import org.springframework.stereotype.Service;

@Service
public interface CurrencyRateService {
    CurrencyRate findByFromAndTo(String from, String to);
    void save(CurrencyRate currencyRate);
}
