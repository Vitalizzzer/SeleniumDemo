package org.selenium.com.testNgDemo;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.selenium.com.common.CalculatorPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.selenium.com.common.Converter.convertOperator;

public class FirstTest extends WebDriverSettings {

    @Test
    @Parameters({"firstNum", "secondNum", "operator", "expectedResult"})
    public void firstTest(String firstNum, String secondNum, String operator, String expectedResult) throws InterruptedException {
        WebDriver driver = getDriver();
        CalculatorPage calcPage = new CalculatorPage(driver);
        String url = "https://juliemr.github.io/protractor-demo/";
        getDriver().get(url);

        calcPage.enterFirstNum(firstNum);
        calcPage.enterSecondNum(secondNum);
        calcPage.chooseOperator(convertOperator(operator));
        calcPage.clickGoBtn();
        String actualResult = calcPage.getResult();

        Assert.assertEquals(expectedResult, actualResult);
    }

}
