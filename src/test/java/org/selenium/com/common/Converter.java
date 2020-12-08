package org.selenium.com.common;

public class Converter {
    public static String convertOperator(String operator) {
        switch (operator) {
            case "+":
                return "ADDITION";
            case "-":
                return "SUBTRACTION";
            case "*":
                return "MULTIPLICATION";
            case "/":
                return "DIVISION";
            case "%":
                return "MODULO";
            default:
                return "";
        }
    }
}
