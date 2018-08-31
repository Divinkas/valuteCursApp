package com.example.divinkas.cursapps.Model;

public class ExchangeRate {
    public String baseCurrency;
    public double saleRateNB;
    public double purchaseRateNB;
    public String currency;
    public double saleRate;
    public double purchaseRate;

    public ExchangeRate(){}

    public ExchangeRate(String baseCurrency, double saleRateNB, double purchaseRateNB,
                        String currency, double saleRate, double purchaseRate) {
        this.baseCurrency = baseCurrency;
        this.saleRateNB = saleRateNB;
        this.purchaseRateNB = purchaseRateNB;
        this.currency = currency;
        this.saleRate = saleRate;
        this.purchaseRate = purchaseRate;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public double getSaleRateNB() {
        return saleRateNB;
    }

    public void setSaleRateNB(double saleRateNB) {
        this.saleRateNB = saleRateNB;
    }

    public double getPurchaseRateNB() {
        return purchaseRateNB;
    }

    public void setPurchaseRateNB(double purchaseRateNB) {
        this.purchaseRateNB = purchaseRateNB;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getSaleRate() {
        return saleRate;
    }

    public void setSaleRate(double saleRate) {
        this.saleRate = saleRate;
    }

    public double getPurchaseRate() {
        return purchaseRate;
    }

    public void setPurchaseRate(double purchaseRate) {
        this.purchaseRate = purchaseRate;
    }
}
