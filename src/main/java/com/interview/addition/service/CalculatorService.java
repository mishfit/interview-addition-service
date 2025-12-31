package com.interview.addition.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    private static final Logger logger = LoggerFactory.getLogger(CalculatorService.class);

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
            logger.info("Adding number1: " + number1 + " and number2: " + number2);
            return number1 + number2;
        }

        catch (ArithmeticException ae)
        {
            logger.error("ArithmeticException :- "+ae.getMessage());
            throw new ArithmeticException(ae.getMessage());
        }
    }
}
