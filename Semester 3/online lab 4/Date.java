/**
 * Date
 */
public class Date {
    private int month, year, day;

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Date() {
        this.day = 01;
        this.month = 1;
        this.year = 2001;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printDate() {
        System.out.println("Date dd/mm/yyyy : " + day + "/" + month + "/" + year);
    }
}