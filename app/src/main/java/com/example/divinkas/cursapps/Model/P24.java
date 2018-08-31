package com.example.divinkas.cursapps.Model;

import java.util.List;

public class P24 {
    public String date;
    public String bank;
    public int bSaseCurrency;
    public String baseCurrencyLit;
    public List<ExchangeRate> exchangeRate;

    public P24(){}
    public P24(String date, String bank, int bSaseCurrency, String baseCurrencyLit, List<ExchangeRate> exchangeRate) {
        this.date = date;
        this.bank = bank;
        this.bSaseCurrency = bSaseCurrency;
        this.baseCurrencyLit = baseCurrencyLit;
        this.exchangeRate = exchangeRate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getbSaseCurrency() {
        return bSaseCurrency;
    }

    public void setbSaseCurrency(int bSaseCurrency) {
        this.bSaseCurrency = bSaseCurrency;
    }

    public String getBaseCurrencyLit() {
        return baseCurrencyLit;
    }

    public void setBaseCurrencyLit(String baseCurrencyLit) {
        this.baseCurrencyLit = baseCurrencyLit;
    }

    public List<ExchangeRate> getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(List<ExchangeRate> exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
