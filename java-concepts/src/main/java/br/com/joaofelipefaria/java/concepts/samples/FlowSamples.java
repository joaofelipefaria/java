package br.com.joaofelipefaria.java.concepts.samples;

/**
 * Sample class for FlowSamples.
 */
public class FlowSamples {

    /**
     * Prints sample output for FlowSamples.
     */
    public static void print() {
        System.out.println("-- FlowSamples --");
        ifElseSamples();
        switchSamples();
        loopSamples();
        breakContinueSamples();
    }

    private static void ifElseSamples() {
        int value = 7;
        if (value > 10) {
            System.out.println("value > 10");
        } else if (value > 5) {
            System.out.println("value > 5");
        } else {
            System.out.println("value <= 5");
        }

        boolean condition = value > 0;
        String result = condition ? "positive" : "non-positive";
        System.out.println("ternary in ifElseSamples: " + result);
    }

    private static void switchSamples() {
        int month = 6;
        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 6 -> System.out.println("June");
            default -> System.out.println("Other month");
        }

        String input = "B";
        switch (input) {
            case "A", "B" -> System.out.println("Letter A or B");
            case "C" -> System.out.println("Letter C");
            default -> System.out.println("Other letter");
        }
    }

    private static void loopSamples() {
        for (int i = 0; i < 3; i++) {
            System.out.println("for i=" + i);
        }

        int j = 0;
        while (j < 3) {
            System.out.println("while j=" + j);
            j++;
        }

        int k = 0;
        do {
            System.out.println("do-while k=" + k);
            k++;
        } while (k < 3);
    }

    private static void breakContinueSamples() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("break at i=" + i);
                break;
            }
        }

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("continue at i=" + i);
                continue;
            }
            System.out.println("loop i=" + i);
        }
    }
}
