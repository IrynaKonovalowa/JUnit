package org.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyTest {
    static Currency currency;

    @BeforeAll
    static void initCurrency() {
        currency = new Currency();
    }

    @AfterEach
    void clearCurrency() {
        currency.setCurrency("null");
        System.out.println("After Each called");
    }
    @Test
    void usd_ShouldReturnExchangedAmount_WhenCalled() {
        Currency currency = new Currency();
        currency.setCurrency("USD");
        double expected = 4210;
        double actual = currency.getHryvniaFromCurrency(100);
        assertEquals(expected,actual,0.1, "print  exchange 100 USD -> 4210");
   }

    @Test
    void eur_ShouldReturnExchangedAmount_WhenCalled() {
        Currency currency = new Currency();
        currency.setCurrency("EUR");
        double expected = 4547;
        double actual = currency.getHryvniaFromCurrency(100);
        assertEquals(expected,actual, 0.1,"print  exchange 100 EUR  -> 4547");
    }

    @Test
    void gbp_ShouldReturnExchangedAmount_WhenCalled() {
        Currency currency = new Currency();
        currency.setCurrency("GBP");
        double expected = 5395;
        double actual = currency.getHryvniaFromCurrency(100);
        assertEquals(expected,actual, 0.1,"print  exchange 100 EUR  -> 4547");
    }
    @Test
    void yen_ShouldReturnExchangedAmount_WhenCalled() {
        Currency currency = new Currency();
        currency.setCurrency("YEN");
        double expected = 29;
        double actual = currency.getHryvniaFromCurrency(100);
        assertEquals(expected,actual, 0.1, "print  exchange 100 GBP -> 29");
     }



}
