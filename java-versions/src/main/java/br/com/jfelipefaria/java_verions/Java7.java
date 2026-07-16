package br.com.jfelipefaria.java_verions;

import br.com.jfelipefaria.java_verions.dto.ExampleDTO;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Released in 2011.
 * Java 7 introduced try-with-resources, diamond operator, and switch on strings,
 * making resource handling and everyday code simpler.
 */
public class Java7 {

    /**
     * Demonstrates try-with-resources to safely handle file readers.
     */
    public String readFirstLine(Path path) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            return reader.readLine();
        }
    }

    /**
     * Demonstrates switch support for String values.
     */
    public String describeText(String value) {
        switch (value) {
            case "open":
                return "The resource is open";
            case "closed":
                return "The resource is closed";
            default:
                return "Unknown state";
        }
    }

    /**
     * Demonstrates the diamond operator for inferring generic types.
     */
    public List<String> createDiamondList() {
        List<String> values = new ArrayList<>();
        values.add("diamond");
        return values;
    }

    /**
     * Demonstrates how a DTO can be created with Java 7-style diamond inference.
     */
    public ExampleDTO createExampleDtoFromValues(String id, String name) {
        ExampleDTO dto = new ExampleDTO();
        dto.setId(id);
        dto.setName(name);
        dto.setAge(7);
        dto.setActive(true);
        return dto;
    }
}
