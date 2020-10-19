import java.util.*;

public class LuckyRacer {
    public static void main(String[] args) {

        AutomaticCar car1 = new AutomaticCar();
        AutomaticCar car2 = new AutomaticCar();
        AutomaticCar car3 = new AutomaticCar();
        AutomaticCar car4 = new AutomaticCar();
        AutomaticCar car5 = new AutomaticCar();

        car1.setModel("Bughatti Chiron");
        car2.setModel("BMW i8");
        car3.setModel("Londo ki Civic");
        car4.setModel("Murshad ka Jihaaz");
        car5.setModel("Legendary Mehran");

        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            System.out.println("\tRound " + i + " After " + i + " hour(s).");
            car1.setSpeed(1 + random.nextInt(500));
            car1.distanceCovered(i, car1.getSpeed());
            car1.display();

            car2.setSpeed(1 + random.nextInt(500));
            car2.distanceCovered(i, car2.getSpeed());
            car2.display();

            car3.setSpeed(1 + random.nextInt(500));
            car3.distanceCovered(i, car3.getSpeed());
            car3.display();

            car4.setSpeed(1 + random.nextInt(500));
            car4.distanceCovered(i, car4.getSpeed());
            car4.display();

            car5.setSpeed(1 + random.nextInt(500));
            car5.distanceCovered(i, car5.getSpeed());
            car5.display();
        }

        /*
         * System.out .println(AutomaticCar .compare(car1, AutomaticCar.compare(car2,
         * AutomaticCar.compare(car3, AutomaticCar.compare(car4, car5)))) .getModel() +
         * " has won the race");
         */
        System.out.println(car1.compare(car2.compare(car3.compare(car4.compare(car5)))).getModel() + "  won the Race.");

    }

}
