package br.com.joaofelipefaria.java.concepts.samples;

/**
 * Sample class for OperatorsSamples.
 */
public class OperatorsSamples {

    /**
     * Prints sample output for OperatorsSamples.
     */
    public static void print() {
        System.out.println("-- OperatorsSamples --");
        arithmeticOperators();
        relationalOperators();
        logicalOperators();
        assignmentOperators();
        unaryOperators();
        ternaryOperator();
        bitwiseOperators();
    }

    private static void arithmeticOperators() {
        int a = 5;
        int b = 2;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }

    private static void relationalOperators() {
        int a = 5;
        int b = 2;
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
    }

    private static void logicalOperators() {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + (!a));
    }

    private static void assignmentOperators() {
        int x = 10;
        x += 5;
        System.out.println("x += 5 => " + x);
        x -= 3;
        System.out.println("x -= 3 => " + x);
        x *= 2;
        System.out.println("x *= 2 => " + x);
        x /= 3;
        System.out.println("x /= 3 => " + x);
        x %= 4;
        System.out.println("x %= 4 => " + x);
    }

    private static void unaryOperators() {
        int x = 1;
        System.out.println("++x = " + (++x));
        System.out.println("x++ = " + (x++));
        System.out.println("--x = " + (--x));
        System.out.println("x-- = " + (x--));
        System.out.println("-x = " + (-x));
        System.out.println("+x = " + (+x));
        boolean isTrue = true;
        System.out.println("!isTrue = " + (!isTrue));
    }

    private static void ternaryOperator() {
        int value = 5;
        String result = value > 0 ? "positive" : "non-positive";
        System.out.println("ternary result = " + result);
    }

    private static void bitwiseOperators() {
        int a = 5;
        int b = 3;
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >>> 1 = " + (a >>> 1));
    }
}
