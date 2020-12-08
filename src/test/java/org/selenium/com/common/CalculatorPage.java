package org.selenium.com.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
    private final WebDriver driver;

    @FindBy(xpath = "//input[@ng-model='first']")
    WebElement firstNumTxt;

    @FindBy(xpath = "//input[@ng-model='second']")
    WebElement secondNumTxt;

    @FindBy(id = "gobutton")
    WebElement goBtn;

    @FindBy(xpath = "//h2[@class='ng-binding']")
    WebElement resultLbl;


    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFirstNum(String number) {
        firstNumTxt.sendKeys(number);
    }

    public void enterSecondNum(String number) {
        secondNumTxt.sendKeys(number);
    }

    public void chooseOperator(String convertedOperator) {
        this.driver.findElement(By.xpath("//option[@value='" + convertedOperator + "']")).click();
    }

    public void clickGoBtn() {
        goBtn.click();
    }

    public String getResult() throws InterruptedException {
        int counter = 10;
        String result = resultLbl.getText();

        while (!isNumeric(result)) {
            if (counter <= 0) {
                break;
            }

            Thread.sleep(1000);
            result = resultLbl.getText();
            counter--;
        }

        return result;
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
