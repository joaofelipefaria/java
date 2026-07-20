package br.com.joaofelipefaria.java.concepts.samples;

/**
 * Sample class for EnumSamples.
 */
public class EnumSamples {

    /**
     * Prints sample output for EnumSamples.
     */
    public static void print() {
        System.out.println("-- EnumSamples --");
        enumBasic();
        enumSwitch();
        enumMethods();
    }

    private static void enumBasic() {
        Day day = Day.MONDAY;
        System.out.println("day=" + day);
        System.out.println("ordinal=" + day.ordinal());
    }

    private static void enumSwitch() {
        Day day = Day.FRIDAY;
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("weekday");
            case SATURDAY, SUNDAY -> System.out.println("weekend");
        }
    }

    private static void enumMethods() {
        for (Day day : Day.values()) {
            System.out.println(day.name() + " -> " + day.isWeekend());
        }
    }

    enum Day {
        MONDAY(false), TUESDAY(false), WEDNESDAY(false), THURSDAY(false), FRIDAY(false), SATURDAY(true), SUNDAY(true);

        private final boolean weekend;

        Day(boolean weekend) {
            this.weekend = weekend;
        }

        public boolean isWeekend() {
            return weekend;
        }
    }
}
