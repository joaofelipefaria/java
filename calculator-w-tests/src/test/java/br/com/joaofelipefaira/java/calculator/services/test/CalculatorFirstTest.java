package br.com.joaofelipefaira.java.calculator.services.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.joaofelipefaira.java.calculator.services.CalculatorFirst;

public class CalculatorFirstTest {

    private final CalculatorFirst calculator = new CalculatorFirst();

    @Test
    void shouldAdd() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    void shouldSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void shouldMultiply() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    void shouldDivide() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    void shouldThrowDivisionByZero() {

        assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );
    }

}