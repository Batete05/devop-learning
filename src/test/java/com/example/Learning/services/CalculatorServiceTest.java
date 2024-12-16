package com.example.Learning.services;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class CalculatorServiceTest {

    @DataProvider
    private static final Object[][]getNumbers(){
        return new Object[][]{
                {10, 5},
                {20,20},
                {-4,-45}
        };
    }

    @Test(dataProvider = "getNumbers")
    public void givenCalculatorService_whenAddingNumbers_thenReturnAddition(int num1, int num2) {
        //Arrange
        CalculatorService calculatorService= new CalculatorService();


        //Act
        int actualResult= calculatorService.add(num1,num2);
        int expectedResults=num1+num2;
        //Assult
        Assert.assertEquals(actualResult, expectedResults);
    }

    @Test(dataProvider="getNumbers")
    void givenCalculatorService_whenSubtractingNumbers_thenReturnDifference(int num1, int num2) {
        //Arrange
        CalculatorService calculatorService=new CalculatorService();
        //Act
        int actualResult=calculatorService.sub(num1,num2);
        int expectedResults=num1-num2;
        //Assult
        Assert.assertEquals(expectedResults,actualResult,"this is not working mehnnn");
    }
    @Test
    void givenCalculatorService_whenSubtractingNegativeNumbers_thenReturnDifference() {
        //Arrange
        CalculatorService calculatorService=new CalculatorService();
        int num1=-3;
        int num2=-4;

        //Act
        int actualResult=num1-num2;
        //Assult
        Assert.assertEquals(actualResult,1, "Subtracting 2 negative numbers");
    }

    @Test
    void givenCalculatorService_whenMultiplyingNumbers_thenReturnMultiplication() {
        //Arrange
        CalculatorService calculatorService=new CalculatorService();
        int num1=3;
        int num2=2;

        //Act
        int actualResult=num1*num2;
        //Assult
        Assert.assertEquals(actualResult,6);
    }

    @Test
    void givenCalculator_whenDividingTwoNumbers_thenReturnQuotient() {
        //Arrange

        CalculatorService calculatorService=new CalculatorService();
        int num1=4;
        int num2=2;

        //Act
        int actualResult= num1/num2;
        //Assert
        Assert.assertEquals(actualResult,2,"This is impossible wanna");
    }
}