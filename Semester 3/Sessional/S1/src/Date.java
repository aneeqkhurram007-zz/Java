public class Date {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = (day >= 1 && day <= 31) ? (this.day = day) : (this.day = 1);

    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = (month >= 1 && day <= 12) ? (this.month = month) : (this.month = 1);
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = (year >= 1) ? (this.year = year) : (this.year = 1);
    }

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 1;
    }

    public void display() {
        System.out.println(this.day + "-" + this.month + "-" + this.year);
    }
}
