package task2;

public class Odometer {

    private double fuelEfficiency, milesDriven, oldMiles, totalMiles;
    private static int count = 0;

    public void reset() {

        this.totalMiles = 0.0;
    }

    public void setFuel(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public void setMiles(double milesDriven) {
        this.oldMiles = milesDriven;
    }

    public void addMiles(double milesDriven) {
        this.milesDriven = milesDriven;
        totalMiles = oldMiles + milesDriven;
    }

    public double getGallons() {
        return milesDriven / fuelEfficiency;
    }

    public void displayInfo() {
        count++;
        System.out.println("\n\n\t\tOdometer " + count);
        System.out.println("\n\n\tOld Miles Driven = " + oldMiles);
        System.out.println("\tNew Miles Driven = " + milesDriven);
        System.out.println("\tTotal Miles Driven = " + totalMiles);
        System.out.println("\tFuel Efficieny = " + fuelEfficiency);
        System.out.println("\tGallons Used Since Last Reset = " + getGallons());

    }

}
