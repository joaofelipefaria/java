package br.com.joaofelipefaira.java.calculator.services.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.joaofelipefaira.java.calculator.services.CalculatorBinary;

public class CalculatorBinaryTest {

    private final CalculatorBinary calculator = new CalculatorBinary();

    @Test
    void shouldAnd() {
        assertEquals("1000", calculator.and("1010", "1100"));
    }

    @Test
    void shouldOr() {
        assertEquals("1110", calculator.or("1010", "1100"));
    }

    @Test
    void shouldNot() {
        assertEquals("11111111111111111111111111110101", calculator.not("1010"));
    }

    @Test
    void shouldXor() {
        assertEquals("110", calculator.xor("1010", "1100"));
    }

    @Test
    void shouldShiftLeft() {
        assertEquals("101000", calculator.shiftLeft("1010", 2));
    }

    @Test
    void shouldShiftRight() {
        assertEquals("10", calculator.shiftRight("1010", 2));
    }

}