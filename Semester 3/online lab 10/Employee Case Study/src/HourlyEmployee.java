import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private int hours;
    private double hourlyWage;

    public HourlyEmployee(String lastName, String firstName, Integer ssn, LocalDate birthdate, int hours,
            double hourlyWage) {
        super(lastName, firstName, ssn, birthdate);
        setHours(hours);
        setHourlyWage(hourlyWage);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public String toString() {
        return "Hourly" + super.toString() + "\nHours Worked = " + getHours() + "\nHourly Wage = " + getHourlyWage();
    }

    @Override
    public double earnings() {
        if (getHours() <= 40) {
            return getHourlyWage() * getHours();
        } else {
            return (40 * getHourlyWage()) + (getHours() - 40) * (getHourlyWage() * 1.5);
        }
    }

}
