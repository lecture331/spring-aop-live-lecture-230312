package com.example.springaoplivelecture230312.calculatoraop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorAopTest {

    @Qualifier("aop")
    @Autowired
    private Calculator calculator;

    @Test
    public void testAddition() {
        double result = calculator.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        double result = calculator.subtract(10, 5);
        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() {
        double result = calculator.multiply(10, 5);
        assertEquals(50, result);
    }

    @Test
    public void testDivision() {
        double result = calculator.divide(10, 5);
        assertEquals(2, result);
    }
}
