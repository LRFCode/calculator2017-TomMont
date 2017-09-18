package com.arkansascodingacademy;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInput
{
    //Ex 2.18 + 4.56
    public BigDecimal firstNumber;
    private BigDecimal secondNumber;
    private String operator;
    private boolean exit;

    public boolean exit()
    {
        return exit;
    }

    public BigDecimal getFirstNumber()
    {
        return firstNumber;
    }

    public BigDecimal getSecondNumber()
    {
        return secondNumber;
    }

    public String getOperator()
    {
        return operator;
    }

    public void scan()
    {
        System.out.println("Please enter your calculation:");
        Scanner scanner = new Scanner(System.in);

        String input[] = scanner.nextLine().split(" ");

        if (input[0].equalsIgnoreCase("exit"))
        {
            exit = true;
        } else
        {
            firstNumber = new BigDecimal(input[0]);
            operator = input[1];
            secondNumber = new BigDecimal(input[2]);
        }

    }

}