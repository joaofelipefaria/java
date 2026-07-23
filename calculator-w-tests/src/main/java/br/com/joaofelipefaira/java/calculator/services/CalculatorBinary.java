package br.com.joaofelipefaira.java.calculator.services;

public class CalculatorBinary {

    public String and(String a, String b) {
        return Integer.toBinaryString(
                Integer.parseInt(a, 2) &
                Integer.parseInt(b, 2));
    }

    public String or(String a, String b) {
        return Integer.toBinaryString(
                Integer.parseInt(a, 2) |
                Integer.parseInt(b, 2));
    }

    public String xor(String a, String b) {
        return Integer.toBinaryString(
                Integer.parseInt(a, 2) ^
                Integer.parseInt(b, 2));
    }

    public String not(String a) {
        return Integer.toBinaryString(
                ~Integer.parseInt(a, 2));
    }

    public String shiftLeft(String a, int positions) {
        return Integer.toBinaryString(
                Integer.parseInt(a, 2) << positions);
    }

    public String shiftRight(String a, int positions) {
        return Integer.toBinaryString(
                Integer.parseInt(a, 2) >> positions);
    }

}