package br.com.jfelipefaria.java_verions;

import br.com.jfelipefaria.java_verions.dto.ExampleDTO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Released in 1998.
 * Java 1.2 introduced the Java 2 platform, the Collections Framework,
 * the Swing UI library, and a more structured API model for enterprise development.
 */
public class Java1Dot2 {

    /**
     * Demonstrates the use of the Collections Framework to create a list and sort it.
     */
    public List<String> createAndSortCollection() {
        List<String> values = new ArrayList<>();
        values.add("beta");
        values.add("alpha");
        values.add("gamma");
        Collections.sort(values);
        return values;
    }

    /**
     * Demonstrates the use of a synchronized collection wrapper for thread-safe access.
     */
    public List<String> createSynchronizedList(List<String> input) {
        return Collections.synchronizedList(input);
    }

    /**
     * Demonstrates the use of a read-only view of a list.
     */
    public List<String> createReadOnlyList(List<String> input) {
        return Collections.unmodifiableList(input);
    }

    /**
     * Demonstrates how a collection result can be mapped into an ExampleDTO object.
     */
    public ExampleDTO createExampleDtoFromCollection(List<String> values) {
        ExampleDTO dto = new ExampleDTO();
        dto.setId("collection-1");
        dto.setName(String.join(", ", values));
        dto.setAge(values.size());
        dto.setActive(!values.isEmpty());
        return dto;
    }
}
