package br.com.joaofelipefaria.java.concepts.samples;

/**
 * Sample class for ExceptionSamples.
 */
public class ExceptionSamples {

    /**
     * Prints sample output for ExceptionSamples.
     */
    public static void print() {
        System.out.println("-- ExceptionSamples --");
        checkedExceptionSample();
        runtimeExceptionSample();
    }

    private static void checkedExceptionSample() {
        try {
            parseNumber("123a");
        } catch (NumberFormatException ex) {
            System.out.println("Caught parsing exception: " + ex.getMessage());
        }
    }

    private static void runtimeExceptionSample() {
        try {
            String value = null;
            System.out.println(value.length());
        } catch (NullPointerException ex) {
            System.out.println("Caught runtime exception: " + ex.getClass().getSimpleName());
        }

        try {
            Object obj = "string";
            Integer number = (Integer) obj;
            System.out.println(number);
        } catch (ClassCastException ex) {
            System.out.println("Caught runtime exception: " + ex.getClass().getSimpleName());
        }
    }

    private static int parseNumber(String value) {
        if (value == null) {
            throw new IllegalArgumentException("value cannot be null");
        }
        return Integer.parseInt(value);
    }
}
