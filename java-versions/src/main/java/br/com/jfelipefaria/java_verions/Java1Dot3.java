package br.com.jfelipefaria.java_verions;

import br.com.jfelipefaria.java_verions.dto.ExampleDTO;
import java.util.logging.Logger;

/**
 * Released in 2000.
 * Java 1.3 focused on improved performance, stability, and better support for networking,
 * diagnostics, and server-side application development.
 */
public class Java1Dot3 {

    private static final Logger LOGGER = Logger.getLogger(Java1Dot3.class.getName());

    /**
     * Demonstrates logging with the standard Java logging API to record an informational message.
     */
    public void logInfoMessage(String message) {
        LOGGER.info(message);
    }

    /**
     * Demonstrates how to create a simple string representation of a value using the toString method.
     */
    public String describeValue(Object value) {
        return String.valueOf(value);
    }

    /**
     * Demonstrates a basic pattern for handling an exception with a checked context.
     */
    public String handleExceptionExample(String message) {
        try {
            Integer.parseInt(message);
            return "Parsed successfully";
        } catch (NumberFormatException exception) {
            LOGGER.warning("Invalid numeric input");
            return "Invalid input";
        }
    }

    /**
     * Demonstrates how a simple DTO can be created from basic input values.
     */
    public ExampleDTO createExampleDtoFromValues(String id, String name, int age) {
        return new ExampleDTO(id, name, age, true);
    }
}
