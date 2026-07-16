package br.com.jfelipefaria.java_verions.dto;

import java.util.Objects;

/**
 * Example DTO used to demonstrate data transfer objects across the Java version examples.
 */
public class ExampleDTO {

    private String id;
    private String name;
    private int age;
    private boolean active;

    public ExampleDTO() {
    }

    public ExampleDTO(String id, String name, int age, boolean active) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExampleDTO that)) {
            return false;
        }
        return age == that.age && active == that.active && Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, active);
    }

    @Override
    public String toString() {
        return "ExampleDTO{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", age=" + age + ", active=" + active + '}';
    }
}
