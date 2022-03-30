package com.atifimal.microservices.basic.currencyservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "CURRENCY_RATE")
public class CurrencyRate {
    @Id
    private Long id;

    @Column(name="currency_from")
    private String from;

    @Column(name="currency_to")
    private String to;

    private BigDecimal multiplied;
    private int port;

    public CurrencyRate() {

    }


    public CurrencyRate(Long id, String from, String to, BigDecimal multiplied) {
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.multiplied = multiplied;
    }

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getMultiplied() {
        return multiplied;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
