package br.com.joaofelipefaira.java.calculator.services.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.commons.math3.complex.Complex;
import org.junit.jupiter.api.Test;

import br.com.joaofelipefaira.java.calculator.services.CalculatorSecond;

public class CalculatorSecondTest {

    private final CalculatorSecond calculator = new CalculatorSecond();

    @Test
    void shouldSolveQuadraticEquation() {

        Complex[] roots = calculator.solve(1, -3, 2);

        assertEquals(2.0, roots[0].getReal(), 0.0001);
        assertEquals(1.0, roots[1].getReal(), 0.0001);

    }
    
    @Test
    void shouldThrowExceptionWhenAIsZero() {

        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.solve(0, 1, 2)
        );
    }

}