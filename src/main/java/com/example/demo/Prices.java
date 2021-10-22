package com.example.demo;

public class Prices {

    private String eth1Sell, eth1Buy, btc1Sell, btc1Buy;
    private String eth2Sell, eth2Buy, btc2Buy, btc2Sell;

    public Prices(){
    }

    public String getEth1Sell() {
        return eth1Sell;
    }

    public void setEth1Sell(String eth1Sell) {
        this.eth1Sell = eth1Sell;
    }

    public String getEth1Buy() {
        return eth1Buy;
    }

    public void setEth1Buy(String eth1Buy) {
        this.eth1Buy = eth1Buy;
    }

    public String getBtc1Sell() {
        return btc1Sell;
    }

    public void setBtc1Sell(String btc1Sell) {
        this.btc1Sell = btc1Sell;
    }

    public String getBtc1Buy() {
        return btc1Buy;
    }

    public void setBtc1Buy(String btc1Buy) {
        this.btc1Buy = btc1Buy;
    }

    public String getEth2Sell() {
        return eth2Sell;
    }

    public void setEth2Sell(String eth2Sell) {
        this.eth2Sell = eth2Sell;
    }

    public String getEth2Buy() {
        return eth2Buy;
    }

    public void setEth2Buy(String eth2Buy) {
        this.eth2Buy = eth2Buy;
    }

    public String getBtc2Buy() {
        return btc2Buy;
    }

    public void setBtc2Buy(String btc2Buy) {
        this.btc2Buy = btc2Buy;
    }

    public String getBtc2Sell() {
        return btc2Sell;
    }

    public void setBtc2Sell(String btc2sell) {
        this.btc2Sell = btc2sell;
    }

    @Override
    public String toString() {
        return "Prices{" +
                ", ethCBSell='" + eth1Sell + '\'' +
                ", ethCBBuy='" + eth1Buy + '\'' +
                ", btcCBSell='" + btc1Sell + '\'' +
                ", btcCBBuy='" + btc1Buy + '\'' +
                ", ethGSell='" + eth2Sell + '\'' +
                ", ethGBuy='" + eth2Buy + '\'' +
                ", btcGBuy='" + btc2Buy + '\'' +
                ", btcGSell='" + btc2Sell + '\'' +
                '}';
    }
}
