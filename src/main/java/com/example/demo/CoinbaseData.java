package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoinbaseData {

    private String base;
    private String currency;
    private String amount;

    public CoinbaseData(){
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CoinbaseData{" +
                "base='" + base + '\'' +
                ", currency='" + currency + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
