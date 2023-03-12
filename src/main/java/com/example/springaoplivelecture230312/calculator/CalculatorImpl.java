package com.example.springaoplivelecture230312.calculator;

import org.springframework.stereotype.Service;

@Service
class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}