package io.codelex.currencyconverter;

import java.math.BigDecimal;
import java.util.Map;

public class RatesResponse {
    private Map<String, BigDecimal> rates;

    public RatesResponse(Map<String, BigDecimal> rates) {
        this.rates = rates;
    }

    public RatesResponse() {
    }

    public Map<String, BigDecimal> getRates() {
        return rates;
    }

    public void setRates(Map<String, BigDecimal> rates) {
        this.rates = rates;
    }

    public void displayCurrencies() {
        for (Map.Entry<String, BigDecimal> entry : rates.entrySet()) {
            String currencyCode = entry.getKey();
            BigDecimal rate = entry.getValue();
            System.out.println(currencyCode + ": " + rate);
        }
    }
}