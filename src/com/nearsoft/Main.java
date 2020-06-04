package com.nearsoft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

import com.nearsoft.factories.CurrencyFactory;
import com.nearsoft.interfaces.Currency;

public class Main {

    public static void main(String[] args) {
        CurrencyFactory factory = new CurrencyFactory();
        float amount = 0;
        String currencyName = "";
        Currency currentCurrency;

        while(true) {
            System.out.println("Insert the type of currency to perform the conversion (DOLLAR, EURO, YEN)");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                currencyName = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            currentCurrency = factory.obtainCurrency(currencyName);

            System.out.println("Insert the amount of money");
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
            try {
                amount = Float.parseFloat(br2.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }

            DecimalFormat df = new DecimalFormat("$#.00");

            System.out.println("$"+amount+" MXN "+"converted to "+currencyName+" " +
                    "are: "+ df.format(currentCurrency.convert(amount))+"\n");
        }
    }
}