package br.com.jfelipefaria.java_verions;

import br.com.jfelipefaria.java_verions.dto.ExampleDTO;
import java.util.ArrayList;
import java.util.List;

/**
 * Released in 2018.
 * Java 10 focused on local variable type inference with var, reducing boilerplate and
 * making short-lived variables easier to read.
 */
public class Java10 {

    /**
     * Demonstrates local variable type inference with var.
     */
    public String buildGreeting(String name) {
        var greeting = "Hello, " + name;
        return greeting;
    }

    /**
     * Demonstrates var with a collection initialization.
     */
    public List<String> createNames(List<String> input) {
        var names = new ArrayList<String>();
        for (String name : input) {
            names.add(name.toUpperCase());
        }
        return names;
    }

    /**
     * Demonstrates local variable type inference when constructing an ExampleDTO.
     */
    public ExampleDTO createExampleDtoWithVar(String id, String name, int age) {
        var dto = new ExampleDTO();
        dto.setId(id);
        dto.setName(name);
        dto.setAge(age);
        dto.setActive(age > 0);
        return dto;
    }
}
