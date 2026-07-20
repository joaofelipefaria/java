package br.com.joaofelipefaria.java.concepts.samples;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Sample class for TypeSamples.
 */
public class TypeSamples {

    /**
     * Prints sample output for TypeSamples.
     */
    public static void print() {
        System.out.println("-- TypeSamples --");
        primitiveTypes();
        boxingUnboxing();
        numericOperations();
    }

    private static void primitiveTypes() {
        byte b = 10;
        short s = 20;
        int i = 100;
        long l = 1_000_000L;
        float f = 3.14F;
        double d = 2.71828;
        char c = 'A';
        boolean bool = true;

        System.out.println("byte=" + b + ", short=" + s + ", int=" + i + ", long=" + l);
        System.out.println("float=" + f + ", double=" + d + ", char=" + c + ", boolean=" + bool);
    }

    private static void boxingUnboxing() {
        Integer boxedInt = Integer.valueOf(42);
        int unboxedInt = boxedInt;
        Double boxedDouble = 3.14;
        double unboxedDouble = boxedDouble;

        System.out.println("boxedInt=" + boxedInt + ", unboxedInt=" + unboxedInt);
        System.out.println("boxedDouble=" + boxedDouble + ", unboxedDouble=" + unboxedDouble);

        Integer autoBoxed = 100;
        int autoUnboxed = autoBoxed;
        System.out.println("autoBoxed=" + autoBoxed + ", autoUnboxed=" + autoUnboxed);
    }

    private static void numericOperations() {
        int a = 10;
        int b = 3;
        System.out.println("add=" + (a + b));
        System.out.println("sub=" + (a - b));
        System.out.println("mul=" + (a * b));
        System.out.println("div=" + (a / b));
        System.out.println("mod=" + (a % b));

        double x = 10.0;
        double y = 0.0;
        System.out.println("doubleDiv=" + (x / 2.0));
        System.out.println("doubleZeroDiv=" + (x / y));
        System.out.println("doubleZeroMod=" + (x % y));

        try {
            System.out.println("intZeroDiv=" + (a / 0));
        } catch (ArithmeticException ex) {
            System.out.println("intZeroDiv caught: " + ex.getMessage());
        }

        BigDecimal bd = BigDecimal.valueOf(10, 0);
        BigDecimal bd2 = BigDecimal.valueOf(3, 0);
        System.out.println("bigDecimalDiv=" + bd.divide(bd2, 10, RoundingMode.HALF_UP));
    }
}
