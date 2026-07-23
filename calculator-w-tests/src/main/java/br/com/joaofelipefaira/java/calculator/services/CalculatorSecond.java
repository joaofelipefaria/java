package br.com.joaofelipefaira.java.calculator.services;

import org.apache.commons.math3.complex.Complex;

public class CalculatorSecond {

    public Complex[] solve(double a, double b, double c) {

        if (a == 0) {
            throw new IllegalArgumentException("Coefficient 'a' cannot be zero.");
        }

        Complex delta = new Complex(b * b - 4 * a * c, 0);

        Complex sqrt = delta.sqrt();

        Complex minusB = new Complex(-b, 0);

        Complex divisor = new Complex(2 * a, 0);

        Complex x1 = minusB.add(sqrt).divide(divisor);
        Complex x2 = minusB.subtract(sqrt).divide(divisor);

        return new Complex[]{x1, x2};
    }

}