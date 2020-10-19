public class AutomaticCar {

    private String model;
    private int year;
    private double speed;
    private double odoMeter = 0;
    private int gear;
    private static int count = 0;
    private int id = 0;

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {

        if (speed > 0) {
            this.speed = speed;
        }
        setGear(speed);
    }

    public int getGear() {
        return this.gear;
    }

    private void setGear(double speed) {
        if (speed == 0) {
            this.gear = 0;
        } else if (speed >= 1 && speed <= 100) {
            this.gear = 1;
        } else if (speed > 100 && speed <= 200) {
            this.gear = 2;
        } else if (speed > 200 && speed <= 300) {
            this.gear = 3;
        } else if (speed > 300 && speed <= 400) {
            this.gear = 4;
        } else {
            this.gear = 5;
        }
    }

    public void distanceCovered(int hours, double speed) {
        this.odoMeter += hours * speed;

    }

    public double getOdometer() {
        return this.odoMeter;
    }

    public void display() {
        System.out.print("Car " + id + " ");
        for (int i = 1; i <= odoMeter / 1000; i++) {
            System.out.print("-");
        }
        System.out.println(" : " + odoMeter + " km passed");
    }

    public AutomaticCar() {
        this.id = ++count;
    }

    /*
     * public static AutomaticCar compare(AutomaticCar car1, AutomaticCar car2) { if
     * (car1.odoMeter > car2.odoMeter) { return car1; } else { return car2; }
     * 
     * }
     */

    public AutomaticCar compare(AutomaticCar car2) {
        if (odoMeter > car2.odoMeter) {
            return this;
        } else {
            return car2;
        }
    }
}
