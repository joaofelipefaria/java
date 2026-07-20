package br.com.joaofelipefaria.java.concepts.samples;

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
