$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/calculator/CucumberDemo.feature");
formatter.feature({
  "name": "Test calculator web application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CucumberTest"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Test operations",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "first number \u0027\u003cFirstNumber\u003e\u0027",
  "keyword": "Given "
});
formatter.step({
  "name": "second number \u0027\u003cSecondNumber\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "chosen operator \u0027\u003cOperator\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "click go button",
  "keyword": "When "
});
formatter.step({
  "name": "result is \u0027\u003cResult\u003e\u0027",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FirstNumber",
        "SecondNumber",
        "Operator",
        "Result"
      ]
    },
    {
      "cells": [
        "5",
        "2",
        "*",
        "10"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "driver configuration",
  "keyword": "Given "
});
formatter.match({
  "location": "org.selenium.com.cucumberDemo.steps.calculatorSteps.CucumberDemoSteps.driver_configuration()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.selenium.com.cucumberDemo.steps.calculatorSteps.CucumberDemoSteps.driver_configuration(CucumberDemoSteps.java:71)\r\n\tat ✽.driver configuration(classpath:features/calculator/CucumberDemo.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Test operations",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CucumberTest"
    }
  ]
});
formatter.step({
  "name": "first number \u00275\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "org.selenium.com.cucumberDemo.steps.calculatorSteps.CucumberDemoSteps.first_number(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "second number \u00272\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "org.selenium.com.cucumberDemo.steps.calculatorSteps.CucumberDemoSteps.second_number(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "chosen operator \u0027*\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "org.selenium.com.cucumberDemo.steps.calculatorSteps.CucumberDemoSteps.chosen_operator(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click go button",
  "keyword": "When "
});
formatter.match({
  "location": "org.selenium.com.cucumberDemo.steps.calculatorSteps.CucumberDemoSteps.click_go_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "result is \u002710\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "org.selenium.com.cucumberDemo.steps.calculatorSteps.CucumberDemoSteps.result_is(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException\r\n\tat org.selenium.com.cucumberDemo.steps.calculatorSteps.CucumberDemoSteps.closeBrowser(CucumberDemoSteps.java:63)\r\n",
  "status": "failed"
});
});