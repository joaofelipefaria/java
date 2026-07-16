package br.com.jfelipefaria.java_verions;

import br.com.jfelipefaria.java_verions.dto.ExampleDTO;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Released in 2021.
 * Java 17 is a long-term support release that improved performance, sealed classes,
 * pattern matching for switch, and the overall reliability of the platform.
 */
public class Java17 {

    /**
     * Demonstrates a sealed class hierarchy with a finite set of allowed implementations.
     */
    public String describeShape(Shape shape) {
        return switch (shape) {
            case Circle circle -> "Circle with radius " + circle.radius();
            case Rectangle rectangle -> "Rectangle with width " + rectangle.width() + " and height " + rectangle.height();
        };
    }

    /**
     * Demonstrates the use of a record as a compact immutable carrier type.
     */
    public String describeRecord(Point point) {
        return point.x() + ", " + point.y();
    }

    /**
     * Demonstrates the stream API with filtering and collecting results.
     */
    public List<String> filterValues(List<String> values) {
        return values.stream()
                .filter(value -> value != null && !value.isBlank())
                .collect(Collectors.toList());
    }

    /**
     * Demonstrates how a DTO can be created with Java 17-style clarity and structure.
     */
    public ExampleDTO createExampleDtoFromValues(String id, String name) {
        ExampleDTO dto = new ExampleDTO();
        dto.setId(id);
        dto.setName(name);
        dto.setAge(17);
        dto.setActive(true);
        return dto;
    }

    public sealed interface Shape permits Circle, Rectangle {
    }

    public record Circle(double radius) implements Shape {
    }

    public record Rectangle(double width, double height) implements Shape {
    }

    public record Point(int x, int y) {
    }
}
