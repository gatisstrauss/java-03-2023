package io.codelex.currencyconverter;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.Scanner;


public class CurrencyConverter {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        RatesResponse resp = mapper.readValue(new URL("https://api.exchangerate.host/latest"), RatesResponse.class);

        Scanner scanner = new Scanner(System.in);
        System.out.println("All currencies");
        resp.displayCurrencies();

        System.out.print("Enter the amount in EUR: ");
        BigDecimal amountEUR = scanner.nextBigDecimal();

        System.out.print("Enter the desired currency: ");
        String currency = scanner.next().toUpperCase();

        if (resp.getRates().containsKey(currency)) {
            BigDecimal conversionRate = resp.getRates().get(currency);

            BigDecimal amountConverted = amountEUR.multiply(conversionRate);

            amountConverted = amountConverted.setScale(2, RoundingMode.UP);

            System.out.println("Converted amount: " + amountConverted + " " + currency);
        } else {
            System.out.println("Invalid currency code entered.");
        }
    }
}
