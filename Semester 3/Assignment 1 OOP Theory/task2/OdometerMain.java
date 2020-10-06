package task2;

public class OdometerMain {
    public static void main(String[] args) {

        Odometer o1 = new Odometer(53.7, 32.1);
        Odometer o2 = new Odometer(42.9, 15.4);
        Odometer o3 = new Odometer(220, 27);
        Odometer o4 = new Odometer(672.78, 36);
        Odometer o5 = new Odometer(430.9, 27);

        o1.addmiles(61.7);
        o2.addmiles(404.45);
        o3.addmiles(3);
        o4.addmiles(224);
        o5.addmiles(78);

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
        System.out.println(o5);

    }
}
