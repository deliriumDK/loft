package main.dimk.interview.enums;

/**
 *
 */
public class MainUsageWeekDays {

    private WeekDays myInterviewDay;
    private WeekDays myFirstWorkDay;

    private int myInterviewDayFromClass;
    private int myFirstWorkDayFromClass;

    public MainUsageWeekDays(WeekDays myInterviewDay, WeekDays myFirstWorkDay) {
        this.myInterviewDay = myInterviewDay;
        this.myFirstWorkDay = myFirstWorkDay;
    }

    public MainUsageWeekDays(int myInterviewDayFromClass, int myFirstWorkDayFromClass) {
        if ( myInterviewDayFromClass > 6 ) {
            this.myInterviewDayFromClass = 0;
        } else {
            this.myInterviewDayFromClass = myInterviewDayFromClass;
        }
        this.myFirstWorkDayFromClass = myFirstWorkDayFromClass;
    }

    @Override
    public String toString() {
        return "MainUsageWeekDays{" +
                "myInterviewDay=" + myInterviewDay +
                ", myFirstWorkDay=" + myFirstWorkDay +
                ", myInterviewDayFromClass=" + myInterviewDayFromClass +
                ", myFirstWorkDayFromClass=" + myFirstWorkDayFromClass +
                '}';
    }

    public static void main(String[] args) {
        // с enum
        MainUsageWeekDays myImportantDaysForThisWeek = new MainUsageWeekDays(WeekDays.MON, WeekDays.FRI);
        System.out.println(myImportantDaysForThisWeek);
        System.out.println(WeekDays.FRI.getMsg());
        System.out.println(WeekDays.valueOf("FRI").ordinal());

        // с классом
        MainUsageWeekDays classDays = new MainUsageWeekDays(100_000, WeekDaysAsClass.FRI);
        System.out.println(classDays);

        System.out.println("ALL WEEK DAYS:");
        for(WeekDays myday : WeekDays.values()) {
            System.out.println(myday);
        }
    }
}
