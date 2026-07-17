# Java Versions — overview and examples

This repository contains examples and snippets demonstrating key features from several Java versions. Below is a concise summary per version and a small usage example for each highlighted feature.

## Java 8 (2014)
- Highlights: lambda expressions, Streams API, `java.time`, and the `java.util.function` package (e.g., `Predicate`).
- Example (using `Predicate` with Streams):

```java
// filter strings with length > 3 using a Predicate
List<String> filtered = values.stream()
	.filter(s -> s.length() > 3)
	.collect(Collectors.toList());

// or using the helper in Java8.java
// Java8 java8 = new Java8();
// List<String> filtered = java8.filterWithPredicate(values, s -> s.length() > 3);
```

## Java 9 (2017)
- Highlights: module system (JPMS), JShell (REPL), and various API improvements.
- Example (`module-info.java`):

```java
module com.example.app {
	requires java.sql;
	exports com.example.app.api;
}
```

## Java 11 (2018, LTS)
- Highlights: standard HTTP client (`java.net.http.HttpClient`), removal of deprecated APIs, and JVM improvements.
- Example (simple HTTP request):

```java
HttpClient client = HttpClient.newHttpClient();
HttpRequest req = HttpRequest.newBuilder(URI.create("https://example.com")).GET().build();
HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString());
System.out.println(resp.body());
```

## Java 14 (2020)
- Highlights: `records` (preview), pattern matching for `instanceof` (preview earlier), and language refinements.
- Example (`record`):

```java
public record Person(String name, int age) {}

Person p = new Person("Ana", 30);
System.out.println(p.name());
```

## Java 17 (2021, LTS)
- Highlights: `sealed` classes, stabilized `records`, pattern matching and API improvements.
- Example (sealed interface):

```java
public sealed interface Shape permits Circle, Rectangle {}

public final class Circle implements Shape { /* ... */ }
```

## Java 21 (2023, LTS)
- Highlights: advances from Project Loom (virtual threads), I/O improvements, and concurrency ergonomics.
- Example (virtual thread):

```java
Thread v = Thread.ofVirtual().unstarted(() -> System.out.println("Hello, virtual thread"));
v.start();
```
