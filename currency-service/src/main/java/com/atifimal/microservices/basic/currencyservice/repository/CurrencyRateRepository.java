package com.atifimal.microservices.basic.currencyservice.repository;

import com.atifimal.microservices.basic.currencyservice.entity.CurrencyRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRateRepository extends JpaRepository<CurrencyRate, Long> {
    CurrencyRate findByFromAndTo(String from, String to);
}
