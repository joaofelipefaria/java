package br.com.joaofelipefaira.java.calculator.services;

public class CalculatorFirst {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {

        if (b == 0) {
            throw new ArithmeticException("Division by zero.");
        }

        return a / b;
    }

}