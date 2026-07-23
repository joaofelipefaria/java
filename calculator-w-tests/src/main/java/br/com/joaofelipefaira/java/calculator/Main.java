package br.com.joaofelipefaira.java.calculator;

import br.com.joaofelipefaira.java.calculator.services.CalculatorBinary;
import br.com.joaofelipefaira.java.calculator.services.CalculatorCalculus;
import br.com.joaofelipefaira.java.calculator.services.CalculatorFirst;
import br.com.joaofelipefaira.java.calculator.services.CalculatorSecond;

public class Main {

    public static void main(String[] args) {

        CalculatorFirst basic = new CalculatorFirst();

        System.out.println(basic.add(10, 20));
        System.out.println(basic.multiply(5, 8));

        CalculatorBinary binary = new CalculatorBinary();

        System.out.println(binary.and("1010", "1100"));
        System.out.println(binary.or("1010", "1100"));
        System.out.println(binary.not("01"));

        CalculatorSecond second = new CalculatorSecond();

        var roots = second.solve(1, -3, 2);

        System.out.println(roots[0]);
        System.out.println(roots[1]);

        CalculatorCalculus calculus = new CalculatorCalculus();

        System.out.println(
                calculus.solve("Solve(x^5-5*x^4+5*x^3+5*x^2-6*x==0,x)")
        );
    }

}