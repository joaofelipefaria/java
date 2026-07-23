package br.com.joaofelipefaira.java.calculator.services;

import org.matheclipse.core.eval.ExprEvaluator;

public class CalculatorCalculus {

    private final ExprEvaluator evaluator = new ExprEvaluator();

    /**
     * Exemplo:
     *
     * Solve(x^3 - 6*x^2 + 11*x - 6 == 0, x)
     *
     * ou
     *
     * Solve(x^5 + x^2 - 10 == 0, x)
     */
    public String solve(String equation) {

        equation = equation.replace("==", "=");

        if (equation.endsWith("=0")) {
            equation = equation.substring(0, equation.length() - 2);
        }

        String command = "Solve(" + equation + "==0,x)";
        return evaluator.eval(command).toString();
    }

}