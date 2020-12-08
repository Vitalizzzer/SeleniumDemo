package org.selenium.com.cucumberDemo.steps.calculatorParallelSteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium.com.common.CalculatorPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class CucumberParallelDemoSteps {
    private static final Logger LOGGER = LoggerFactory.getLogger(CucumberParallelDemoSteps.class);
    CalculatorPage calcPage;
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Apps\\chromedriver_win32_86\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    @Given("a step from {string} in {string} feature file")
    public void step(String scenario, String file) throws InterruptedException {

        System.out.format("Thread ID – %2d – %s from %s feature file.\n",
                Thread.currentThread().getId(), scenario, file);
        Thread.sleep(3000);
    }
}
