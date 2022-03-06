package be.intecbrussel.enums;

public class DayApp {
    public static void main(String[] args) {
        Day day1 = Day.SUNDAY;
       Day day2 = Day.MONDAY;
       Day day3 = Day.TUESDAY;
       Day day4 = Day.WEDNESDAY;
       Day day5 = Day.THURSDAY;
       Day day6 = Day.FRIDAY;
       Day day7 = Day.SATURDAY;
        Day[] days = Day.values();
        for (int i = 0; i <= days.length; i++) {
            printDay(days[i]);
        }
        printDay(day1);
        printDay(day2);
        printDay(day3);
        printDay(day4);
        printDay(day5);
        printDay(day6);
        printDay(day7);
    }


    public static void printDay(Day day) {

            System.out.println(day.name());

            System.out.println(day.ordinal());
            System.out.println(day.getWeekday());
            System.out.println(day);

    }
}
