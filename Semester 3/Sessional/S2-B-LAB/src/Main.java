import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Race> cars = new ArrayList<>();
        cars.add(new Race("Car1 ", 74));
        cars.add(new Race("Car2 ", 740));
        cars.add(new Race("Car3 ", 150));

        if (cars.get(0).race() > cars.get(1).race() && cars.get(0).race() > cars.get(2).race()) {
            System.out.println("Car 1 is winner");
        } else if (cars.get(1).race() > cars.get(0).race() && cars.get(1).race() > cars.get(2).race()) {
            System.out.println("Car 2 is winner");
        } else if (cars.get(2).race() > cars.get(1).race() && cars.get(2).race() > cars.get(0).race()) {
            System.out.println("Car 3 is winner");
        }
    }
}
