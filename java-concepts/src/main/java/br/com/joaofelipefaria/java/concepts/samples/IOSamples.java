package br.com.joaofelipefaria.java.concepts.samples;

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
