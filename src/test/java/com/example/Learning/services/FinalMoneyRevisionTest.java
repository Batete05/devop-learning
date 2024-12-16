package com.example.Learning.services;

import static org.junit.jupiter.api.Assertions.*;

public class FinalMoneyRevisionTest {
    public void constructorShouldSetAmountAndCurrency(){
        FinalMoneyRevision moneyRevision=new FinalMoneyRevision(10,"usd");

        assertEquals(moneyRevision.getAmount(),10);
        assertEquals(moneyRevision.getCurrency(),"usd");

        moneyRevision=new FinalMoneyRevision(20,"eur");

        assertEquals(moneyRevision.getCurrency(),"eur");
        assertEquals(moneyRevision.getAmount(),20);
    }

}