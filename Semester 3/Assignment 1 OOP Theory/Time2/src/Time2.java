public class Time2 {
    private int hours;
    private int minutes;
    private int seconds;
    private static int count;

    static {
        count = 0;
    }

    public static void setCount(int countMain) {
        count = countMain;
    }

    public static int getCount() {
        return count;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = (hours > 0 && hours <= 23) ? (this.hours = hours) : (this.hours = 0);
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = (minutes > 0 && minutes <= 59) ? (this.minutes = minutes) : (this.minutes = 0);
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = (seconds > 0 && seconds <= 59) ? (this.seconds = seconds) : (this.seconds = 0);
    }

    public Time2() {
        this(0, 0, 0);
    }

    public Time2(int hours) {
        this(hours, 0, 0);
    }

    public Time2(int hours, int minutes) {
        this(hours, minutes, 0);

    }

    public Time2(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
        count++;
    }

    public Time2(Time2 time2) {
        this(time2.hours, time2.minutes, time2.seconds);
    }

    public void tick() {
        System.out.print("Incremented Seconds: ");
        if (this.seconds == 59) {
            System.out.println(0);
        } else {
            System.out.printf("%d\n", seconds + 1);
        }
    }

    public void incrementMinute() {
        System.out.print("Incremented Minutes: ");
        if (this.seconds == 59) {
            System.out.println(0);
        } else {
            System.out.printf("%d\n", minutes + 1);
        }
    }

    public void incrementHour() {
        System.out.print("Incremented Hours: ");
        if (this.seconds == 23) {
            System.out.println(0);
        } else {
            System.out.printf("%d\n", hours + 1);
        }
    }

    public void display() {
        System.out.println("\tTime");
        System.out.println("Hours = " + hours);
        System.out.println("Minutes = " + minutes);
        System.out.println("Seconds = " + seconds);
    }
}
