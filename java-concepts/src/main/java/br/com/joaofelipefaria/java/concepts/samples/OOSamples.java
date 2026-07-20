package br.com.joaofelipefaria.java.concepts.samples;

/**
 * Sample class for OOSamples.
 */
public class OOSamples {

    /**
     * Prints sample output for OOSamples.
     */
    public static void print() {
        System.out.println("-- OOSamples --");
        inheritanceSample();
        polymorphismSample();
        encapsulationSample();
    }

    private static void inheritanceSample() {
        Animal animal = new Animal("generic");
        Dog dog = new Dog("Buddy");
        System.out.println(animal.describe());
        System.out.println(dog.describe());
        System.out.println(dog.sound());
    }

    private static void polymorphismSample() {
        Animal animal = new Dog("Rex");
        System.out.println("polymorphic describe=" + animal.describe());
    }

    private static void encapsulationSample() {
        Person person = new Person("Joao", 30);
        person.setAge(31);
        System.out.println(person.getName() + " is " + person.getAge());
    }

    static class Animal {
        private final String type;

        Animal(String type) {
            this.type = type;
        }

        String describe() {
            return "Animal type=" + type;
        }
    }

    static class Dog extends Animal {
        private final String name;

        Dog(String name) {
            super("dog");
            this.name = name;
        }

        @Override
        String describe() {
            return "Dog name=" + name;
        }

        String sound() {
            return "Woof";
        }
    }

    static class Person {
        private final String name;
        private int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String getName() {
            return name;
        }

        int getAge() {
            return age;
        }

        void setAge(int age) {
            if (age > 0) {
                this.age = age;
            }
        }
    }
}
