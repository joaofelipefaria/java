package br.com.jfelipefaria.java_verions;

import br.com.jfelipefaria.java_verions.dto.ExampleDTO;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Released in 2006.
 * Java 6 improved scripting support, web services, and the Java platform ecosystem,
 * making it easier to integrate Java with dynamic languages and enterprise services.
 */
public class Java6 {

    /**
     * Demonstrates Java 6 scripting support through the ScriptEngine API.
     */
    public String evaluateScript(String expression) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        return String.valueOf(engine.eval(expression));
    }

    /**
     * Demonstrates Java 6 support for console-based interactions.
     */
    public String buildConsoleMessage(String name) {
        return "Hello, " + name;
    }

    /**
     * Demonstrates the use of a simple service-oriented configuration value.
     */
    public String describePlatformFeature() {
        return "Java 6 improved scripting, web services, and enterprise integration";
    }

    /**
     * Demonstrates how a DTO can be used as a simple configuration payload for scripting scenarios.
     */
    public ExampleDTO createExampleDtoForScripting(String name, int age) {
        ExampleDTO dto = new ExampleDTO();
        dto.setId("scripted");
        dto.setName(name);
        dto.setAge(age);
        dto.setActive(true);
        return dto;
    }
}
