package br.com.joaofelipefaira.java.calculator.test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

import br.com.joaofelipefaira.java.calculator.Main;

class MainTest {

    @Test
    void shouldExecuteMainWithoutExceptions() {

        assertDoesNotThrow(() ->
            Main.main(new String[] {})
        );

    }

}