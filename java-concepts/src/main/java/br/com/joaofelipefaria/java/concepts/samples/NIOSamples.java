package br.com.joaofelipefaria.java.concepts.samples;

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
