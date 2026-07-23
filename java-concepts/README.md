# Java Concepts

A Spring Boot demo application whose sole purpose is to hold small, self-contained, runnable examples ("samples") of core Java language and API concepts — one class per topic.

## What it does

`java-concepts` is not a business application. It's a reference/demo project: each class under `samples/` demonstrates one area of the language in isolation, so it can be read top-to-bottom or run to see the output in the console.

## Samples included

| Class | Topic |
|---|---|
| `CollectionSamples` | Collections API (List, Set, Map, etc.) |
| `DateTimeSamples` | `java.time` API |
| `EnumSamples` | Enums |
| `ExceptionSamples` | Exception handling |
| `FlowSamples` | Control flow |
| `IOSamples` | Classic I/O |
| `LambdaSamples` | Lambda expressions / functional interfaces |
| `LocaleSamples` | Localization / `Locale` |
| `NIOSamples` | NIO (New I/O) |
| `OOSamples` | Object-oriented programming |
| `OperatorsSamples` | Operators |
| `OptionalSamples` | `Optional` |
| `ReflectionSamples` | Reflection API |
| `StreamSamples` | Streams API |
| `StringSamples` | String handling |
| `TypeSamples` | Type system |

## Technologies used

- Java 17
- Spring Boot 3.3.4 (used here mainly as an application bootstrap/runner, not for web endpoints)
- Maven

## How to run

Since this is a plain Spring Boot jar with no web layer exposed, the simplest ways to run it are:

**Option 1 — run the application entry point:**
```bash
cd java-concepts
mvn spring-boot:run
```

**Option 2 — run/inspect an individual sample:**
Open any class under `src/main/java/br/com/joaofelipefaria/java/concepts/samples/` in your IDE and run its `main` method (or call it from `Application.java`) to see the output for that specific topic.

**Build a jar:**
```bash
mvn clean package
java -jar target/java-concepts-0.0.1-SNAPSHOT.jar
```
