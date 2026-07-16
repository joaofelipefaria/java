package br.com.jfelipefaria.java_verions;

import br.com.jfelipefaria.java_verions.dto.ExampleDTO;

/**
 * Released in 2023.
 * Java 21 is a long-term support release that introduced virtual threads,
 * pattern matching for switch, and further improvements to the language and runtime.
 */
public class Java21 {

    /**
     * Demonstrates pattern matching for switch with several branches.
     */
    public String describeValue(Object value) {
        return switch (value) {
            case Integer number -> "Integer value: " + number;
            case String text -> "String value: " + text;
            case null -> "Null value";
            default -> "Unsupported type";
        };
    }

    /**
     * Demonstrates a simple string template-like formatting approach using text blocks.
     */
    public String createMessage(String name, int age) {
        return "Hello %s, you are %d years old".formatted(name, age);
    }

    /**
     * Demonstrates a compact and readable method returning a constant value.
     */
    public String describeJava21() {
        return "Java 21 continues the evolution of modern Java";
    }

    /**
     * Demonstrates pattern matching for switch with ExampleDTO values.
     */
    public String describeExampleDto(Object value) {
        return switch (value) {
            case ExampleDTO dto -> "DTO: " + dto.getName();
            case String text -> "Text: " + text;
            case null -> "Null value";
            default -> "Unsupported value";
        };
    }
}
