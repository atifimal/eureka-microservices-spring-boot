package com.atifimal.microservices.basic.currencyservice.controller;

import com.atifimal.microservices.basic.currencyservice.entity.CurrencyRate;
import com.atifimal.microservices.basic.currencyservice.service.CurrencyRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Objects;

@RestController
public class CurrencyController {

    @Autowired
    CurrencyRateService currencyRateService;

    @Autowired
    private Environment environment;

    @GetMapping("/exchange/{from}/{to}")
    public CurrencyRate retrieveExchangeValue (@PathVariable String from, @PathVariable String to) {
        CurrencyRate exchangeValue = currencyRateService.findByFromAndTo(from, to);
        exchangeValue.setPort(Integer.parseInt(Objects.requireNonNull(environment.getProperty("local.server.port"))));
        return exchangeValue;
    }

    @GetMapping("/testdata")
    public void addData() {
        currencyRateService.save(new CurrencyRate(1001L,"usd","try", BigDecimal.valueOf(14.85)));
    }
}
