package com.example.Learning.example1;

import com.example.Learning.example1.Money;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class MoneyTest {
    @DataProvider
    private static final Object[][]getMoney(){
        return new Object[][]{
                {10, "USD"},
                {20,"RWF"}
        };
    }

    @Test(dataProvider = "getMoney", dataProviderClass = DataProvider.class)
    public void constructorShouldSetAmountAndCurrency(int amount, String currency) {
        Money money = new Money(amount, currency);

        Assert.assertEquals(money.getAmount(), amount);
        Assert.assertEquals(money.getCurrency(), currency);
    }

    @Test(expectedExceptions = Exception.class)
    public void shouldThrowExceptions(){    }

}
