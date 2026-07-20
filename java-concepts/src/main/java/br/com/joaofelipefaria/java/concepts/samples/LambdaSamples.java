package br.com.joaofelipefaria.java.concepts.samples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Sample class for LambdaSamples.
 */
public class LambdaSamples {

    /**
     * Prints sample output for LambdaSamples.
     */
    public static void print() {
        System.out.println("-- LambdaSamples --");
        runnableLambda();
        listSortLambda();
        streamLambda();
    }

    private static void runnableLambda() {
        Runnable runnable = () -> System.out.println("running lambda");
        runnable.run();
    }

    private static void listSortLambda() {
        List<String> list = Arrays.asList("banana", "apple", "orange");
        list.stream().sorted(Comparator.naturalOrder()).forEach(item -> System.out.println("sorted item=" + item));
    }

    private static void streamLambda() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int total = numbers.stream().mapToInt(n -> n * 2).sum();
        System.out.println("stream lambda total=" + total);
    }
}
