package br.com.joaofelipefaira.java.calculator.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import br.com.joaofelipefaira.java.calculator.services.test.CalculatorBinaryTest;
import br.com.joaofelipefaira.java.calculator.services.test.CalculatorCalculusTest;
import br.com.joaofelipefaira.java.calculator.services.test.CalculatorFirstTest;
import br.com.joaofelipefaira.java.calculator.services.test.CalculatorSecondTest;
@Suite
@SelectClasses({
        CalculatorFirstTest.class,
        CalculatorBinaryTest.class,
        CalculatorSecondTest.class,
        CalculatorCalculusTest.class
})
public class CalculatorTestSuite {
}