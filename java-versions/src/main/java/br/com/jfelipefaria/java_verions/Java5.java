package br.com.jfelipefaria.java_verions;

import br.com.jfelipefaria.java_verions.dto.ExampleDTO;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/**
 * Released in 2004.
 * Java 5 introduced generics, annotations, enums, varargs, enhanced for loops,
 * and autoboxing, which radically improved code safety and readability.
 */
public class Java5 {

    /**
     * Demonstrates generics by creating a strongly typed list.
     */
    public <T> List<T> createGenericList(T item) {
        List<T> values = new ArrayList<>();
        values.add(item);
        return values;
    }

    /**
     * Demonstrates varargs by composing a message from multiple values.
     */
    public String joinWithVarargs(String... values) {
        return String.join(" ", values);
    }

    /**
     * Demonstrates the enhanced for loop for iterating over a collection.
     */
    public List<String> iterateWithForEach(List<String> values) {
        List<String> result = new ArrayList<>();
        for (String value : values) {
            result.add(value.toUpperCase());
        }
        return result;
    }

    /**
     * Demonstrates autoboxing and unboxing with numeric wrappers.
     */
    public int sumWithAutoBoxing(List<Integer> values) {
        int total = 0;
        for (Integer value : values) {
            total += value;
        }
        return total;
    }

    /**
     * Demonstrates enums as a type-safe way to represent statuses.
     */
    public String describeStatus(OrderStatus status) {
        return status.name();
    }

    /**
     * Demonstrates custom annotations declared and applied in the same class.
     */
    @FeatureAnnotation
    public String demonstrateAnnotation() {
        return "Annotation support";
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface FeatureAnnotation {
    }

    /**
     * Demonstrates how a Java 5 DTO can be created from an enum-based state.
     */
    public ExampleDTO createExampleDtoFromStatus(OrderStatus status) {
        ExampleDTO dto = new ExampleDTO();
        dto.setId(status.name());
        dto.setName("Status-based DTO");
        dto.setAge(status == OrderStatus.APPROVED ? 1 : 0);
        dto.setActive(status != OrderStatus.REJECTED);
        return dto;
    }

    public enum OrderStatus {
        PENDING,
        APPROVED,
        REJECTED
    }
}
