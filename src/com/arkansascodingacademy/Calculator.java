package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Calculator
{
    public void run()
    {
        UserInput userInput = new UserInput();
        userInput.scan();

        BigDecimal firstNumber = userInput.getFirstNumber();
        BigDecimal secondNumber = userInput.getSecondNumber();
        String operator = userInput.getOperator();

        BigDecimal result = null;

        switch(operator)
        {
            case "+":
            case "plus":
                System.out.println("Adding " + firstNumber + " to " + secondNumber);
                result = firstNumber.add(secondNumber);
                break;
            case "-":
            case "minus":
                System.out.println("Subtracting " + secondNumber + " from " + firstNumber);
                result = firstNumber.subtract(secondNumber);
                break;
            case "*":
            case "times":
                System.out.println("Multiplying " + secondNumber + " from " + firstNumber);
                result = firstNumber.multiply(secondNumber);
                break;
            case "/":
            case "divide":
                System.out.println("Dividing " + secondNumber + " from " + firstNumber);
                result = firstNumber.divide(secondNumber);
                break;

            default:
                System.out.println("You are confusing me");
                result = new BigDecimal("0");
        }

        System.out.println("The answer is: " + result);

    }
}
