package br.com.jfelipefaria.java_verions;

import br.com.jfelipefaria.java_verions.dto.ExampleDTO;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Released in 2002.
 * Java 1.4 introduced assertions, regular expressions, logging APIs, XML support,
 * and improved I/O capabilities that made applications more robust and maintainable.
 */
public class Java1Dot4 {

    /**
     * Demonstrates the use of assertions to validate an internal condition.
     */
    public String validatePositiveNumber(int value) {
        assert value > 0 : "Value must be positive";
        return "Value is valid";
    }

    /**
     * Demonstrates regular expression matching with the Pattern and Matcher APIs.
     */
    public boolean matchesEmailPattern(String input) {
        Pattern pattern = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    /**
     * Demonstrates the use of a simple XML parser entry point through the standard API.
     */
    public String describeXmlSupport() {
        return "Java 1.4 added XML processing support through the standard library";
    }

    /**
     * Demonstrates how a DTO can be enriched with additional validation-derived values.
     */
    public ExampleDTO enrichExampleDto(ExampleDTO dto) {
        dto.setName(dto.getName().toUpperCase());
        dto.setActive(dto.getAge() >= 18);
        return dto;
    }
}
