package org.selenium.com.cucumberDemo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "com.epam.reportportal.cucumber.StepReporter", "html:target/cucumber-report"},
        features = {"classpath:features/calculator"},
        glue = {
                "org/selenium/com/cucumberDemo/steps/calculatorSteps",
                "org/selenium/com/reporting"
        },
        strict = true
)
public class CucumberRunnerByJUnit {
}
