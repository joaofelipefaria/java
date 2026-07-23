package br.com.joaofelipefaira.java.calculator.services.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.joaofelipefaira.java.calculator.services.CalculatorCalculus;

public class CalculatorCalculusTest {

    private final CalculatorCalculus calculator = new CalculatorCalculus();

    @Test
    void shouldSolveThirdDegreeEquation() {

        String result = calculator
                .solve("x^3-6*x^2+11*x-6=0")
                .toString();

        assertTrue(result.contains("1"));
        assertTrue(result.contains("2"));
        assertTrue(result.contains("3"));

    }

    @Test
    void shouldSolveFourthDegreeEquation() {

        String result = calculator
                .solve("x^4-5*x^2+4=0")
                .toString();

        assertTrue(result.contains("-2"));
        assertTrue(result.contains("-1"));
        assertTrue(result.contains("1"));
        assertTrue(result.contains("2"));

    }

}