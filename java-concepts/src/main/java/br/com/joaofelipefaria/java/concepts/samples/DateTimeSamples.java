package br.com.joaofelipefaria.java.concepts.samples;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Sample class for DateTimeSamples.
 */
public class DateTimeSamples {

    /**
     * Prints sample output for DateTimeSamples.
     */
    public static void print() {
        System.out.println("-- DateTimeSamples --");
        localDateTimeSamples();
        instantAndDurationSamples();
        zoneAndFormatterSamples();
    }

    private static void localDateTimeSamples() {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(today, now);
        LocalDate birthday = LocalDate.of(1990, Month.JUNE, 15);

        System.out.println("today=" + today);
        System.out.println("now=" + now);
        System.out.println("dateTime=" + dateTime);
        System.out.println("birthday plus 1 year=" + birthday.plusYears(1));
        System.out.println("birthday until today=" + Period.between(birthday, today));
    }

    private static void instantAndDurationSamples() {
        Instant start = Instant.now();
        Instant end = start.plusSeconds(3600);
        Duration duration = Duration.between(start, end);

        System.out.println("start=" + start);
        System.out.println("end=" + end);
        System.out.println("duration seconds=" + duration.getSeconds());
    }

    private static void zoneAndFormatterSamples() {
        ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("zoned=" + zoned);
        System.out.println("formatted=" + zoned.format(formatter));
    }
}
