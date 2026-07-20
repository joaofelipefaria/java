package br.com.joaofelipefaria.java.concepts.samples;

/**
 * Sample class for StringSamples.
 */
public class StringSamples {

    /**
     * Prints sample output for StringSamples.
     */
    public static void print() {
        System.out.println("-- StringSamples --");
        createAndConcatenate();
        searchAndReplace();
        formatting();
        comparison();
        substringAndSplit();
    }

    private static void createAndConcatenate() {
        String literal = "Hello";
        String fromChars = new String(new char[]{'W', 'o', 'r', 'l', 'd'});
        String concat = literal + " " + fromChars;
        String joined = String.join(", ", "Java", "Spring", "Boot");

        System.out.println("literal=" + literal);
        System.out.println("fromChars=" + fromChars);
        System.out.println("concat=" + concat);
        System.out.println("joined=" + joined);
    }

    private static void searchAndReplace() {
        String text = "Java programming language";
        System.out.println("contains 'programming'=" + text.contains("programming"));
        System.out.println("startsWith 'Java'=" + text.startsWith("Java"));
        System.out.println("endsWith 'language'=" + text.endsWith("language"));
        System.out.println("indexOf 'program'=" + text.indexOf("program"));
        System.out.println("replace 'Java' with 'Kotlin'=" + text.replace("Java", "Kotlin"));
        System.out.println("lower=" + text.toLowerCase());
        System.out.println("upper=" + text.toUpperCase());
    }

    private static void formatting() {
        String format = String.format("%s %d %,.2f", "Price", 5, 1234.567);
        System.out.println("format=" + format);
    }

    private static void comparison() {
        String a = "test";
        String b = "test";
        String c = new String("test");

        System.out.println("equals=" + a.equals(b));
        System.out.println("== string literal=" + (a == b));
        System.out.println("== new String=" + (a == c));
        System.out.println("compareTo=" + a.compareTo(c));
    }

    private static void substringAndSplit() {
        String text = "split,this,string";
        String[] parts = text.split(",");
        System.out.println("substring=" + text.substring(6, 10));
        System.out.println("split length=" + parts.length);
        for (String part : parts) {
            System.out.println("part=" + part);
        }
    }
}
