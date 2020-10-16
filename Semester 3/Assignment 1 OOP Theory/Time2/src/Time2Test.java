public class Time2Test {
    public static void main(String[] args) {
        Time2 time0 = new Time2();
        Time2 time1 = new Time2(16);
        Time2 time2 = new Time2(15, 14);
        Time2 time3 = new Time2(14, 13, 12);
        Time2 time4 = new Time2(time3);
        time4.display();
        time4.incrementHour();
        time4.incrementMinute();
        time4.tick();

        time4.display();

    }
}
