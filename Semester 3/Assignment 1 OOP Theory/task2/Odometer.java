package task2;

public class Odometer {
    private double oldmiles, tmilesdriven, tmilage, gallons;

    public Odometer(double miles, double average) {
        oldmiles = miles;
        tmilesdriven = miles;
        tmilage = average;

    }

    public double addmiles(double newmiles) {
        tmilesdriven = 0;
        tmilesdriven = newmiles;
        return setaverage(tmilesdriven);
    }

    public double reset() {

        tmilesdriven = 0;
        return addmiles(tmilesdriven);
    }

    public double setaverage(double newtrip) {

        gallons = (newtrip / tmilage);
        return gallons;
    }

    public String toString() {

        return "NUMBER OF GALLONS USED ON " + tmilesdriven + " miles trip = " + gallons + "\nTOTAL MILES AFTER TRIP: "
                + (oldmiles + tmilesdriven);
    }

}
