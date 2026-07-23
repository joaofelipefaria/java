# Java

Collection of Java projects used to study, demonstrate, and practice core language features, object-oriented/architecture concepts, and backend patterns — from language-level examples to a small multi-module microservices system.

## Projects

| Project | Description | Type |
|---|---|---|
| [`java-versions`](./java-versions) | Standalone snippets showing the key language features introduced from Java 1.2 up to Java 21. | Language reference |
| [`java-concepts`](./java-concepts) | Spring Boot demo application with runnable samples covering collections, streams, lambdas, dates, I/O/NIO, reflection, and more. | Language reference / demo app |
| [`microservices-payment`](./microservices-payment) | Multi-module Spring Boot microservices architecture simulating credit/debit account operations, orchestrated through OpenFeign. | Runnable multi-service system |

## Technologies used across this repository

- **Language:** Java 8 through Java 21
- **Frameworks:** Spring Boot 3, Spring Data JPA
- **Build tool:** Maven
- **Database:** PostgreSQL
- **Infra:** Docker / Docker Compose
- **Inter-service communication:** OpenFeign (declarative REST clients)

## How to explore

- `java-versions` and `java-concepts` are meant to be read and run in isolation — open the class/sample you're interested in and run its `main` method or the corresponding test.
- `microservices-payment` is a runnable system; see its own [README](./microservices-payment/README.md) for the startup steps (database via Docker Compose, then each module via Maven).

## Author

João Felipe D'Assenção Faria — Software Architect / Lead Software Engineer.
