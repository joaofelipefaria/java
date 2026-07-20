from pathlib import Path

root = Path('src/main/java/br/com/joaofelipefaria/java/concepts/samples')
files = {
    'TypeSamples.java': '''package br.com.joaofelipefaria.java.concepts.samples;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Sample class for TypeSamples.
 */
public class TypeSamples {

    /**
     * Prints sample output for TypeSamples.
     */
    public static void print() {
        System.out.println("-- TypeSamples --");
        primitiveTypes();
        boxingUnboxing();
        numericOperations();
    }

    private static void primitiveTypes() {
        byte b = 10;
        short s = 20;
        int i = 100;
        long l = 1_000_000L;
        float f = 3.14F;
        double d = 2.71828;
        char c = 'A';
        boolean bool = true;

        System.out.println("byte=" + b + ", short=" + s + ", int=" + i + ", long=" + l);
        System.out.println("float=" + f + ", double=" + d + ", char=" + c + ", boolean=" + bool);
    }

    private static void boxingUnboxing() {
        Integer boxedInt = Integer.valueOf(42);
        int unboxedInt = boxedInt;
        Double boxedDouble = 3.14;
        double unboxedDouble = boxedDouble;

        System.out.println("boxedInt=" + boxedInt + ", unboxedInt=" + unboxedInt);
        System.out.println("boxedDouble=" + boxedDouble + ", unboxedDouble=" + unboxedDouble);

        Integer autoBoxed = 100;
        int autoUnboxed = autoBoxed;
        System.out.println("autoBoxed=" + autoBoxed + ", autoUnboxed=" + autoUnboxed);
    }

    private static void numericOperations() {
        int a = 10;
        int b = 3;
        System.out.println("add=" + (a + b));
        System.out.println("sub=" + (a - b));
        System.out.println("mul=" + (a * b));
        System.out.println("div=" + (a / b));
        System.out.println("mod=" + (a % b));

        double x = 10.0;
        double y = 0.0;
        System.out.println("doubleDiv=" + (x / 2.0));
        System.out.println("doubleZeroDiv=" + (x / y));
        System.out.println("doubleZeroMod=" + (x % y));

        try {
            System.out.println("intZeroDiv=" + (a / 0));
        } catch (ArithmeticException ex) {
            System.out.println("intZeroDiv caught: " + ex.getMessage());
        }

        BigDecimal bd = BigDecimal.valueOf(10, 0);
        BigDecimal bd2 = BigDecimal.valueOf(3, 0);
        System.out.println("bigDecimalDiv=" + bd.divide(bd2, 10, RoundingMode.HALF_UP));
    }
}
''',
    'StringSamples.java': '''package br.com.joaofelipefaria.java.concepts.samples;

/**
 * Sample class for StringSamples.
 */
public class StringSamples {

    /**
     * Prints sample output for StringSamples.
     */
    public static void print() {
        System.out.println("-- StringSamples --");
        createAndConcatenate();
        searchAndReplace();
        formatting();
        comparison();
        substringAndSplit();
    }

    private static void createAndConcatenate() {
        String literal = "Hello";
        String fromChars = new String(new char[]{'W', 'o', 'r', 'l', 'd'});
        String concat = literal + " " + fromChars;
        String joined = String.join(", ", "Java", "Spring", "Boot");

        System.out.println("literal=" + literal);
        System.out.println("fromChars=" + fromChars);
        System.out.println("concat=" + concat);
        System.out.println("joined=" + joined);
    }

    private static void searchAndReplace() {
        String text = "Java programming language";
        System.out.println("contains 'programming'=" + text.contains("programming"));
        System.out.println("startsWith 'Java'=" + text.startsWith("Java"));
        System.out.println("endsWith 'language'=" + text.endsWith("language"));
        System.out.println("indexOf 'program'=" + text.indexOf("program"));
        System.out.println("replace 'Java' with 'Kotlin'=" + text.replace("Java", "Kotlin"));
        System.out.println("lower=" + text.toLowerCase());
        System.out.println("upper=" + text.toUpperCase());
    }

    private static void formatting() {
        String format = String.format("%s %d %,.2f", "Price", 5, 1234.567);
        System.out.println("format=" + format);
    }

    private static void comparison() {
        String a = "test";
        String b = "test";
        String c = new String("test");

        System.out.println("equals=" + a.equals(b));
        System.out.println("== string literal=" + (a == b));
        System.out.println("== new String=" + (a == c));
        System.out.println("compareTo=" + a.compareTo(c));
    }

    private static void substringAndSplit() {
        String text = "split,this,string";
        String[] parts = text.split(",");
        System.out.println("substring=" + text.substring(6, 10));
        System.out.println("split length=" + parts.length);
        for (String part : parts) {
            System.out.println("part=" + part);
        }
    }
}
''',
    'DateTimeSamples.java': '''package br.com.joaofelipefaria.java.concepts.samples;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Sample class for DateTimeSamples.
 */
public class DateTimeSamples {

    /**
     * Prints sample output for DateTimeSamples.
     */
    public static void print() {
        System.out.println("-- DateTimeSamples --");
        localDateTimeSamples();
        instantAndDurationSamples();
        zoneAndFormatterSamples();
    }

    private static void localDateTimeSamples() {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(today, now);
        LocalDate birthday = LocalDate.of(1990, Month.JUNE, 15);

        System.out.println("today=" + today);
        System.out.println("now=" + now);
        System.out.println("dateTime=" + dateTime);
        System.out.println("birthday plus 1 year=" + birthday.plusYears(1));
        System.out.println("birthday until today=" + Period.between(birthday, today));
    }

    private static void instantAndDurationSamples() {
        Instant start = Instant.now();
        Instant end = start.plusSeconds(3600);
        Duration duration = Duration.between(start, end);

        System.out.println("start=" + start);
        System.out.println("end=" + end);
        System.out.println("duration seconds=" + duration.getSeconds());
    }

    private static void zoneAndFormatterSamples() {
        ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("zoned=" + zoned);
        System.out.println("formatted=" + zoned.format(formatter));
    }
}
''',
    'LocaleSamples.java': '''package br.com.joaofelipefaria.java.concepts.samples;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Sample class for LocaleSamples.
 */
public class LocaleSamples {

    /**
     * Prints sample output for LocaleSamples.
     */
    public static void print() {
        System.out.println("-- LocaleSamples --");
        localeInfo();
        formattingWithLocale();
    }

    private static void localeInfo() {
        Locale brazil = Locale.forLanguageTag("pt-BR");
        Locale us = Locale.US;
        System.out.println("brazil display name=" + brazil.getDisplayName());
        System.out.println("us display name=" + us.getDisplayName());
    }

    private static void formattingWithLocale() {
        double value = 1234567.89;
        NumberFormat brazilFormat = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println("brazil currency=" + brazilFormat.format(value));
        System.out.println("us currency=" + usFormat.format(value));
    }
}
''',
    'OperatorsSamples.java': '''package br.com.joaofelipefaria.java.concepts.samples;

/**
 * Sample class for OperatorsSamples.
 */
public class OperatorsSamples {

    /**
     * Prints sample output for OperatorsSamples.
     */
    public static void print() {
        System.out.println("-- OperatorsSamples --");
        arithmeticOperators();
        relationalOperators();
        logicalOperators();
        assignmentOperators();
        unaryOperators();
        ternaryOperator();
        bitwiseOperators();
    }

    private static void arithmeticOperators() {
        int a = 5;
        int b = 2;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }

    private static void relationalOperators() {
        int a = 5;
        int b = 2;
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
    }

    private static void logicalOperators() {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + (!a));
    }

    private static void assignmentOperators() {
        int x = 10;
        x += 5;
        System.out.println("x += 5 => " + x);
        x -= 3;
        System.out.println("x -= 3 => " + x);
        x *= 2;
        System.out.println("x *= 2 => " + x);
        x /= 3;
        System.out.println("x /= 3 => " + x);
        x %= 4;
        System.out.println("x %= 4 => " + x);
    }

    private static void unaryOperators() {
        int x = 1;
        System.out.println("++x = " + (++x));
        System.out.println("x++ = " + (x++));
        System.out.println("--x = " + (--x));
        System.out.println("x-- = " + (x--));
        System.out.println("-x = " + (-x));
        System.out.println("+x = " + (+x));
        boolean isTrue = true;
        System.out.println("!isTrue = " + (!isTrue));
    }

    private static void ternaryOperator() {
        int value = 5;
        String result = value > 0 ? "positive" : "non-positive";
        System.out.println("ternary result = " + result);
    }

    private static void bitwiseOperators() {
        int a = 5;
        int b = 3;
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >>> 1 = " + (a >>> 1));
    }
}
''',
    'FlowSamples.java': '''package br.com.joaofelipefaria.java.concepts.samples;

/**
 * Sample class for FlowSamples.
 */
public class FlowSamples {

    /**
     * Prints sample output for FlowSamples.
     */
    public static void print() {
        System.out.println("-- FlowSamples --");
        ifElseSamples();
        switchSamples();
        loopSamples();
        breakContinueSamples();
    }

    private static void ifElseSamples() {
        int value = 7;
        if (value > 10) {
            System.out.println("value > 10");
        } else if (value > 5) {
            System.out.println("value > 5");
        } else {
            System.out.println("value <= 5");
        }

        boolean condition = value > 0;
        String result = condition ? "positive" : "non-positive";
        System.out.println("ternary in ifElseSamples: " + result);
    }

    private static void switchSamples() {
        int month = 6;
        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 6 -> System.out.println("June");
            default -> System.out.println("Other month");
        }

        String input = "B";
        switch (input) {
            case "A", "B" -> System.out.println("Letter A or B");
            case "C" -> System.out.println("Letter C");
            default -> System.out.println("Other letter");
        }
    }

    private static void loopSamples() {
        for (int i = 0; i < 3; i++) {
            System.out.println("for i=" + i);
        }

        int j = 0;
        while (j < 3) {
            System.out.println("while j=" + j);
            j++;
        }

        int k = 0;
        do {
            System.out.println("do-while k=" + k);
            k++;
        } while (k < 3);
    }

    private static void breakContinueSamples() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("break at i=" + i);
                break;
            }
        }

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("continue at i=" + i);
                continue;
            }
            System.out.println("loop i=" + i);
        }
    }
}
''',
    'ExceptionSamples.java': '''package br.com.joaofelipefaria.java.concepts.samples;

/**
 * Sample class for ExceptionSamples.
 */
public class ExceptionSamples {

    /**
     * Prints sample output for ExceptionSamples.
     */
    public static void print() {
        System.out.println("-- ExceptionSamples --");
        checkedExceptionSample();
        runtimeExceptionSample();
    }

    private static void checkedExceptionSample() {
        try {
            parseNumber("123a");
        } catch (NumberFormatException ex) {
            System.out.println("Caught parsing exception: " + ex.getMessage());
        }
    }

    private static void runtimeExceptionSample() {
        try {
            String value = null;
            System.out.println(value.length());
        } catch (NullPointerException ex) {
            System.out.println("Caught runtime exception: " + ex.getClass().getSimpleName());
        }

        try {
            Object obj = "string";
            Integer number = (Integer) obj;
            System.out.println(number);
        } catch (ClassCastException ex) {
            System.out.println("Caught runtime exception: " + ex.getClass().getSimpleName());
        }
    }

    private static int parseNumber(String value) {
        if (value == null) {
            throw new IllegalArgumentException("value cannot be null");
        }
        return Integer.parseInt(value);
    }
}
''',
    'CollectionSamples.java': '''package br.com.joaofelipefaria.java.concepts.samples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Sample class for CollectionSamples.
 */
public class CollectionSamples {

    /**
     * Prints sample output for CollectionSamples.
     */
    public static void print() {
        System.out.println("-- CollectionSamples --");
        listSamples();
        setSamples();
        mapSamples();
    }

    private static void listSamples() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add(1, "inserted");

        System.out.println("list size=" + list.size());
        for (String item : list) {
            System.out.println("list item=" + item);
        }
        System.out.println("contains 'two'=" + list.contains("two"));
        System.out.println("indexOf 'three'=" + list.indexOf("three"));
    }

    private static void setSamples() {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("two");
        set.add("three");

        System.out.println("set size=" + set.size());
        for (String item : set) {
            System.out.println("set item=" + item);
        }

        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("first");
        linkedSet.add("second");
        linkedSet.add("first");
        System.out.println("linkedSet size=" + linkedSet.size());
    }

    private static void mapSamples() {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("two", 22);

        System.out.println("map size=" + map.size());
        System.out.println("map get 'two'=" + map.get("two"));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("one", 1);
        linkedMap.put("two", 2);
        System.out.println("linkedMap order= " + linkedMap.keySet());
    }
}
''',
    'StreamSamples.java': '''package br.com.joaofelipefaria.java.concepts.samples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Sample class for StreamSamples.
 */
public class StreamSamples {

    /**
     * Prints sample output for StreamSamples.
     */
    public static void print() {
        System.out.println("-- StreamSamples --");
        filterAndMap();
        reduceAndCollect();
        primitiveStream();
    }

    private static void filterAndMap() {
        List<String> data = Arrays.asList("java", "spring", "boot", "stream");
        List<String> result = data.stream()
                .filter(s -> s.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("filterAndMap result=" + result);
    }

    private static void reduceAndCollect() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        Map<Integer, List<Integer>> grouped = numbers.stream().collect(Collectors.groupingBy(n -> n % 2));

        System.out.println("sum=" + sum);
        System.out.println("product=" + product);
        System.out.println("grouped=" + grouped);
    }

    private static void primitiveStream() {
        int average = Arrays.stream(new int[]{2, 4, 6, 8})
                .filter(n -> n > 3)
                .map(n -> n * 2)
                .average().orElse(0);
        System.out.println("primitive average=" + average);
    }
}
''',
    'LambdaSamples.java': '''package br.com.joaofelipefaria.java.concepts.samples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Sample class for LambdaSamples.
 */
public class LambdaSamples {

    /**
     * Prints sample output for LambdaSamples.
     */
    public static void print() {
        System.out.println("-- LambdaSamples --");
        runnableLambda();
        listSortLambda();
        streamLambda();
    }

    private static void runnableLambda() {
        Runnable runnable = () -> System.out.println("running lambda");
        runnable.run();
    }

    private static void listSortLambda() {
        List<String> list = Arrays.asList("banana", "apple", "orange");
        list.stream().sorted(Comparator.naturalOrder()).forEach(item -> System.out.println("sorted item=" + item));
    }

    private static void streamLambda() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int total = numbers.stream().mapToInt(n -> n * 2).sum();
        System.out.println("stream lambda total=" + total);
    }
}
''',
    'IOSamples.java': '''package br.com.joaofelipefaria.java.concepts.samples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Sample class for IOSamples.
 */
public class IOSamples {

    /**
     * Prints sample output for IOSamples.
     */
    public static void print() {
        System.out.println("-- IOSamples --");
        Path file = Path.of("sample.txt");
        createFile(file);
        readFile(file);
        deleteFile(file);
    }

    private static void createFile(Path file) {
        try {
            Files.writeString(file, "Java IO sample file\nLine 2\n", StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("created file=" + file.toAbsolutePath());
        } catch (IOException ex) {
            System.out.println("createFile error=" + ex.getMessage());
        }
    }

    private static void readFile(Path file) {
        try {
            String content = Files.readString(file);
            System.out.println("file content:\n" + content);
        } catch (IOException ex) {
            System.out.println("readFile error=" + ex.getMessage());
        }
    }

    private static void deleteFile(Path file) {
        try {
            Files.deleteIfExists(file);
            System.out.println("deleted file=" + file.toAbsolutePath());
        } catch (IOException ex) {
            System.out.println("deleteFile error=" + ex.getMessage());
        }
    }
}
''',
    'NIOSamples.java': '''package br.com.joaofelipefaria.java.concepts.samples;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Sample class for NIOSamples.
 */
public class NIOSamples {

    /**
     * Prints sample output for NIOSamples.
     */
    public static void print() {
        System.out.println("-- NIOSamples --");
        Path file = Path.of("nio-sample.txt");
        writeFile(file);
        readFile(file);
        deleteFile(file);
    }

    private static void writeFile(Path file) {
        try {
            Files.write(file, "Java NIO sample file\nLine 2\n".getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("created file=" + file.toAbsolutePath());
        } catch (IOException ex) {
            System.out.println("writeFile error=" + ex.getMessage());
        }
    }

    private static void readFile(Path file) {
        try {
            String content = Files.readString(file, StandardCharsets.UTF_8);
            System.out.println("file content:\n" + content);
        } catch (IOException ex) {
            System.out.println("readFile error=" + ex.getMessage());
        }
    }

    private static void deleteFile(Path file) {
        try {
            Files.deleteIfExists(file);
            System.out.println("deleted file=" + file.toAbsolutePath());
        } catch (IOException ex) {
            System.out.println("deleteFile error=" + ex.getMessage());
        }
    }
}
''',
    'OOSamples.java': '''package br.com.joaofelipefaria.java.concepts.samples;

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
''',
    'OptionalSamples.java': '''package br.com.joaofelipefaria.java.concepts.samples;

import java.util.Optional;

/**
 * Sample class for OptionalSamples.
 */
public class OptionalSamples {

    /**
     * Prints sample output for OptionalSamples.
     */
    public static void print() {
        System.out.println("-- OptionalSamples --");
        optionalCreation();
        optionalOperations();
    }

    private static void optionalCreation() {
        Optional<String> present = Optional.of("value");
        Optional<String> empty = Optional.empty();
        Optional<String> nullable = Optional.ofNullable(null);

        System.out.println("present=" + present);
        System.out.println("empty=" + empty);
        System.out.println("nullable=" + nullable);
    }

    private static void optionalOperations() {
        Optional<String> maybe = Optional.ofNullable("hello");
        maybe.ifPresent(value -> System.out.println("ifPresent=" + value));
        String orElse = maybe.orElse("default");
        String orElseGet = maybe.orElseGet(() -> "fallback");
        Optional<String> mapped = maybe.map(String::toUpperCase);
        Optional<String> filtered = maybe.filter(value -> value.startsWith("h"));

        System.out.println("orElse=" + orElse);
        System.out.println("orElseGet=" + orElseGet);
        System.out.println("mapped=" + mapped);
        System.out.println("filtered=" + filtered);
    }
}
''',
    'ReflectionSamples.java': '''package br.com.joaofelipefaria.java.concepts.samples;

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
''',
    'EnumSamples.java': '''package br.com.joaofelipefaria.java.concepts.samples;

/**
 * Sample class for EnumSamples.
 */
public class EnumSamples {

    /**
     * Prints sample output for EnumSamples.
     */
    public static void print() {
        System.out.println("-- EnumSamples --");
        enumBasic();
        enumSwitch();
        enumMethods();
    }

    private static void enumBasic() {
        Day day = Day.MONDAY;
        System.out.println("day=" + day);
        System.out.println("ordinal=" + day.ordinal());
    }

    private static void enumSwitch() {
        Day day = Day.FRIDAY;
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("weekday");
            case SATURDAY, SUNDAY -> System.out.println("weekend");
        }
    }

    private static void enumMethods() {
        for (Day day : Day.values()) {
            System.out.println(day.name() + " -> " + day.isWeekend());
        }
    }

    enum Day {
        MONDAY(false), TUESDAY(false), WEDNESDAY(false), THURSDAY(false), FRIDAY(false), SATURDAY(true), SUNDAY(true);

        private final boolean weekend;

        Day(boolean weekend) {
            this.weekend = weekend;
        }

        public boolean isWeekend() {
            return weekend;
        }
    }
}
'''
}

for filename, content in files.items():
    path = root / filename
    path.write_text(content, encoding='utf-8')
    print('Wrote', path)
PY