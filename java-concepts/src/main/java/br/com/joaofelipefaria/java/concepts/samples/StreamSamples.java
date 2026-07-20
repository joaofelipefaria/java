package br.com.joaofelipefaria.java.concepts.samples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Sample class for StreamSamples.
 */
public class StreamSamples {

    /**
     * Prints sample output for StreamSamples.
     */
    public static void print() {
        System.out.println("-- StreamSamples --");
        filterAndMap();
        reduceAndCollect();
        primitiveStream();
    }

    private static void filterAndMap() {
        List<String> data = Arrays.asList("java", "spring", "boot", "stream");
        List<String> result = data.stream()
                .filter(s -> s.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("filterAndMap result=" + result);
    }

    private static void reduceAndCollect() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        Map<Integer, List<Integer>> grouped = numbers.stream().collect(Collectors.groupingBy(n -> n % 2));

        System.out.println("sum=" + sum);
        System.out.println("product=" + product);
        System.out.println("grouped=" + grouped);
    }

    private static void primitiveStream() {
        double average = Arrays.stream(new int[]{2, 4, 6, 8})
                .filter(n -> n > 3)
                .map(n -> n * 2)
                .average().orElse(0);
        System.out.println("primitive average=" + average);
    }
}
