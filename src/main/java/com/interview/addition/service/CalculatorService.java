package com.interview.addition.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    /**
     * add two numbers
     *
     * @param number1 The first number
     * @param number2 The second number
     * @return The sum of number1 and number2
     */
    public Double add(Double number1, Double number2) {
        try
        {
            return number1 + number2;
        }

        catch (ArithmeticException ae)
        {
            throw new ArithmeticException(ae.getMessage());
        }
    }
}
