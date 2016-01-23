package main.dimk.interview.enums;

/**
 *
 */
public enum WeekDays {

    MON("My mon"),
    TUE,
    WEN,
    THU,
    FRI,
    SUT,
    SUN,
    s123;

    private String msg = null; // "_"

    WeekDays(String msg) {
        this.msg = msg;
    }

    WeekDays() {
        // вызов перегруженного конструктора с помощью ключевого слова this
        this("_");
        someFunc();
    }

    public void someFunc() {

    }

    public String getMsg() {
        return msg;
    }
}
