package be.intecbrussel.enums;

public enum Day {

    SUNDAY(false), MONDAY(true),
    TUESDAY(true), WEDNESDAY(true),
    THURSDAY(true), FRIDAY(true),
    SATURDAY(false);

    private boolean weekday = true;

    private Day(){

    }
    private Day(boolean weekday){
        this.weekday = weekday;
    }

    public boolean getWeekday(){
        return weekday;
    }

    @Override
    public String toString() {
        return "Day{" + name() +
                "weekday=" + weekday +
                "} ";
    }
}
