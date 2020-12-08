package org.selenium.com.cucumberDemo.steps.calculatorSteps;

import com.epam.reportportal.annotations.attribute.Attribute;
import com.epam.reportportal.annotations.attribute.Attributes;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.selenium.com.common.CalculatorPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.selenium.com.common.Converter.convertOperator;

public class CucumberDemoSteps {
    private static final Logger LOGGER = LoggerFactory.getLogger(CucumberDemoSteps.class);
    CalculatorPage calcPage;
    WebDriver driver;

//    @Before
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "D:\\Apps\\chromedriver_win32_86\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.setCapability(ChromeOptions.CAPABILITY, options);
        options.setCapability("browserName", "chrome");
        options.setCapability("acceptSslCerts", "true");
        options.setCapability("javascriptEnabled", "true");
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        options.merge(cap);

        try{
            driver = new RemoteWebDriver(new URL("http://192.168.134.225:22627/wd/hub"), options);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    @Given("driver configuration")
    public void driver_configuration() {
        calcPage = new CalculatorPage(driver);
        String url = "https://juliemr.github.io/protractor-demo/";
        LOGGER.info("Going to open URL: {}", url);
        driver.get(url);
    }


    @Given("first number {string}")
    public void first_number(String firstNum) {
        calcPage.enterFirstNum(firstNum);
        LOGGER.info("RP_MESSAGE#FILE#{}#{}", ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), "snapshot");
    }

    @And("second number {string}")
    public void second_number(String secondNum) {
        calcPage.enterSecondNum(secondNum);
        LOGGER.info("RP_MESSAGE#FILE#{}#{}", ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), "snapshot");
    }

    @And("chosen operator {string}")
    public void chosen_operator(String operator) {
        calcPage.chooseOperator(convertOperator(operator));
        LOGGER.info("RP_MESSAGE#FILE#{}#{}", ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), "snapshot");
    }

    @When("click go button")
    public void click_go_button() {
        calcPage.clickGoBtn();
    }

    @Attributes(attributes = {@Attribute(key = "key1", value = "value1"),
            @Attribute(key = "key2", value = "value2")})
    @Given("result is {string}")
    public void result_is(String expectedResult) throws InterruptedException {
        String actualResult = calcPage.getResult();
        LOGGER.info("RP_MESSAGE#FILE#{}#{}", ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), "snapshot");
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Given("a step from {string} in {string} feature file")
    public void step(String scenario, String file) throws InterruptedException {

        System.out.format("Thread ID – %2d – %s from %s feature file.\n",
                Thread.currentThread().getId(), scenario, file);
        Thread.sleep(3000);
    }
}
