package com.calculator;

public class Calculator {
    private double numberA;
    private double numberB;

    public Calculator(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public double subtraction() {
        return numberB - numberA;
    }

    public double addition() {
        return numberA + numberB;
    }
}
