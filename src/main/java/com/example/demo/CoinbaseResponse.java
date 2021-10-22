package com.example.demo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoinbaseResponse {
    public CoinbaseData data;

    public CoinbaseResponse(){
    }

    public CoinbaseData getData() {
        return data;
    }

    public void setData(CoinbaseData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CoinbaseResponse{" +
                "data=" + data +
                '}';
    }
}
