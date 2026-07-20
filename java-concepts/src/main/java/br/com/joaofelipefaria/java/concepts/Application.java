package br.com.joaofelipefaria.java.concepts;

import br.com.joaofelipefaria.java.concepts.samples.CollectionSamples;
import br.com.joaofelipefaria.java.concepts.samples.DateTimeSamples;
import br.com.joaofelipefaria.java.concepts.samples.EnumSamples;
import br.com.joaofelipefaria.java.concepts.samples.ExceptionSamples;
import br.com.joaofelipefaria.java.concepts.samples.FlowSamples;
import br.com.joaofelipefaria.java.concepts.samples.IOSamples;
import br.com.joaofelipefaria.java.concepts.samples.LambdaSamples;
import br.com.joaofelipefaria.java.concepts.samples.LocaleSamples;
import br.com.joaofelipefaria.java.concepts.samples.NIOSamples;
import br.com.joaofelipefaria.java.concepts.samples.OptionalSamples;
import br.com.joaofelipefaria.java.concepts.samples.OOSamples;
import br.com.joaofelipefaria.java.concepts.samples.OperatorsSamples;
import br.com.joaofelipefaria.java.concepts.samples.ReflectionSamples;
import br.com.joaofelipefaria.java.concepts.samples.StreamSamples;
import br.com.joaofelipefaria.java.concepts.samples.StringSamples;
import br.com.joaofelipefaria.java.concepts.samples.TypeSamples;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring Boot application that executes sample Java concept classes.
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("=== Java Concepts Samples ===");
        TypeSamples.print();
        StringSamples.print();
        DateTimeSamples.print();
        LocaleSamples.print();
        OperatorsSamples.print();
        FlowSamples.print();
        ExceptionSamples.print();
        CollectionSamples.print();
        StreamSamples.print();
        LambdaSamples.print();
        IOSamples.print();
        NIOSamples.print();
        OOSamples.print();
        OptionalSamples.print();
        ReflectionSamples.print();
        EnumSamples.print();
        System.out.println("=== Finished Java Concepts Samples ===");
    }
}
