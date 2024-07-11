public class DayChecker {
    public static String checkDay(DaysOfWeek day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                return day.name();
            case SATURDAY, SUNDAY:
                return "Weekend";
            default:
                throw new IllegalArgumentException("Unknown day " + day);
        }
    }
}
