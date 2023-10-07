package employee.version6;

/**
 *
 * @author NewtskieTzy
 */
public class Date {
    private int day = 1;
    private int month = 1;
    private int year = 2023;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day > 0 && day <= 31 ? day : 1;
        this.month = month > 0 && month <= 12 ? month : 1;
        this.year = year > 0 ? year : 2023;
    }

    public void setDay(int day) {
        this.day = day > 31 || month < 0 ? 1 : day;
    }

    public void setMonth(int month) {
        this.month = month > 12 || month < 0 ? 1 : month;
    }

    public void setYear(int year) {
        this.year = year < 0 ? 2023 : year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        String[] months = {"JAN", "FEB", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUG", "SEP", "OCT", "NOV", "DEC"};
        String monthName= months[month-1];
        return day + " " + monthName + " " + year;
    }
}
