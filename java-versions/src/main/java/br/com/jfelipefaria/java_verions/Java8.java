package br.com.jfelipefaria.java_verions;

import br.com.jfelipefaria.java_verions.dto.ExampleDTO;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Released in 2014.
 * Java 8 introduced lambda expressions, the Streams API, and the new java.time package,
 * enabling functional-style programming and clearer date handling.
 */
public class Java8 {

    /**
     * Demonstrates lambda expressions for sorting a list of strings.
     */
    public List<String> sortWithLambda(List<String> values) {
        values.sort((first, second) -> first.compareTo(second));
        return values;
    }

    /**
     * Demonstrates the Streams API for filtering and collecting values.
     */
    public List<String> filterEvenNumbers(List<Integer> values) {
        return values.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    /**
     * Demonstrates use of java.util.function.Predicate with Streams.
     */
    public List<String> filterWithPredicate(List<String> values, Predicate<String> predicate) {
        return values.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    /**
     * Demonstrates the new java.time API for formatting date-time values.
     */
    public String formatDateTime(LocalDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }

    /**
     * Demonstrates a default method inside a nested interface.
     */
    public String greetWithDefaultMethod(String name) {
        return new GreetingService() {}.greet(name);
    }

    /**
     * Demonstrates how a DTO can be transformed with a lambda expression.
     */
    public ExampleDTO transformExampleDtoWithLambda(ExampleDTO dto) {
        dto.setName(dto.getName().toUpperCase());
        dto.setAge(dto.getAge() + 1);
        return dto;
    }

    private interface GreetingService {
        default String greet(String name) {
            return "Hello, " + name;
        }
    }
}
