package br.com.joaofelipefaria.java.concepts.samples;

import java.util.Optional;

/**
 * Sample class for OptionalSamples.
 */
public class OptionalSamples {

    /**
     * Prints sample output for OptionalSamples.
     */
    public static void print() {
        System.out.println("-- OptionalSamples --");
        optionalCreation();
        optionalOperations();
    }

    private static void optionalCreation() {
        Optional<String> present = Optional.of("value");
        Optional<String> empty = Optional.empty();
        Optional<String> nullable = Optional.ofNullable(null);

        System.out.println("present=" + present);
        System.out.println("empty=" + empty);
        System.out.println("nullable=" + nullable);
    }

    private static void optionalOperations() {
        Optional<String> maybe = Optional.ofNullable("hello");
        maybe.ifPresent(value -> System.out.println("ifPresent=" + value));
        String orElse = maybe.orElse("default");
        String orElseGet = maybe.orElseGet(() -> "fallback");
        Optional<String> mapped = maybe.map(String::toUpperCase);
        Optional<String> filtered = maybe.filter(value -> value.startsWith("h"));

        System.out.println("orElse=" + orElse);
        System.out.println("orElseGet=" + orElseGet);
        System.out.println("mapped=" + mapped);
        System.out.println("filtered=" + filtered);
    }
}
