package br.com.joaofelipefaria.java.concepts.samples;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Sample class for ReflectionSamples.
 */
public class ReflectionSamples {

    /**
     * Prints sample output for ReflectionSamples.
     */
    public static void print() {
        System.out.println("-- ReflectionSamples --");
        inspectStringClass();
    }

    private static void inspectStringClass() {
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            System.out.println("class name=" + clazz.getName());
            for (Method method : clazz.getDeclaredMethods()) {
                if (Modifier.isPublic(method.getModifiers()) && method.getName().startsWith("to")) {
                    System.out.println("method=" + method.getName());
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Reflection error=" + ex.getMessage());
        }
    }
}
