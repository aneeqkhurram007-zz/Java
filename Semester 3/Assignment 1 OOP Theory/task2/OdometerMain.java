package task2;

public class OdometerMain {
    public static void main(String[] args) {

        Odometer o1 = new Odometer();
        o1.setFuel(15.4);
        o1.setMiles(42.9);
        o1.addMiles(404.45);
        o1.displayInfo();
        Odometer o2 = new Odometer();
        o2.setFuel(10.3);
        o2.setMiles(15.65);
        o2.addMiles(7.32);
        o2.displayInfo();
        Odometer o3 = new Odometer();
        o3.setFuel(34.2);
        o3.setMiles(64.5);
        o3.addMiles(295.45);
        o3.displayInfo();

    }
}
