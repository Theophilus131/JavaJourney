package Composition;

public class Date {
    private int month;
    private int day;
    private int year;

    private static final int [] daysPerMonth = {
            0, 31,28,31,30,31,30,31,31,30,31,30,31};
    public Date(int month, int day, int year) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("Invalid month");
        }

        if (day <= 0 || day > daysPerMonth[month] && !(month == 2 && day == 29)) {
            throw new IllegalArgumentException("Invalid day");
        }
        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("date object constructor for date %s%n ", this);
    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);

    }
}
