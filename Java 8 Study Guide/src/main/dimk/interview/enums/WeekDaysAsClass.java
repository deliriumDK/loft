package main.dimk.interview.enums;

/**
 *
 */
public class WeekDaysAsClass {

    public static final int MON = 0;
    public static final int TUE = 1;
    public static final int WEN = 2;
    public static final int THU = 3;
    public static final int FRI = 4;
    public static final int SUT = 5;
    public static final int SUN = 6;

    private String msg = null;

    public WeekDaysAsClass(String msg) {
        this.msg = msg;
    }

    public WeekDaysAsClass() {
        this("_");
        someFunc();
    }

    public void someFunc() {

    }
}
