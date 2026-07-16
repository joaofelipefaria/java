package br.com.jfelipefaria.java_verions;

import br.com.jfelipefaria.java_verions.dto.ExampleDTO;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * Released in 2017.
 * Java 9 introduced the module system, immutable collection factories, and improved optional APIs,
 * making the platform more modular and expressive.
 */
public class Java9 {

    /**
     * Demonstrates the immutable list factory introduced in Java 9.
     */
    public List<String> createImmutableList(String first, String second) {
        return List.of(first, second);
    }

    /**
     * Demonstrates the immutable set factory introduced in Java 9.
     */
    public Set<String> createImmutableSet(String first, String second) {
        return Set.of(first, second);
    }

    /**
     * Demonstrates the immutable map factory introduced in Java 9.
     */
    public Map<String, String> createImmutableMap(String key, String value) {
        return Map.of(key, value);
    }

    /**
     * Demonstrates the Optional.or method introduced in Java 9.
     */
    public String resolveOptionalValue(Optional<String> value) {
        return value.or(() -> Optional.of("fallback value")).orElse("empty");
    }

    /**
     * Demonstrates how an Optional value can be used to initialize a DTO.
     */
    public ExampleDTO createExampleDtoFromOptional(Optional<String> name) {
        ExampleDTO dto = new ExampleDTO();
        dto.setId("optional");
        dto.setName(name.orElse("default"));
        dto.setAge(9);
        dto.setActive(true);
        return dto;
    }
}
