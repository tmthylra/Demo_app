package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeminiPrice {
    private String bid;
    private String ask;

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    @Override
    public String toString() {
        return "GeminiPrice{" +
                "bid='" + bid + '\'' +
                ", ask='" + ask + '\'' +
                '}';
    }
}
