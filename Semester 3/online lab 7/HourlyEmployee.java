
import java.util.*;

public class HourlyEmployee extends Employee {

    private int totalHours;
    private double hourlyIncome;
    private Scanner input = new Scanner(System.in);

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public double getHourlyIncome() {
        return hourlyIncome;
    }

    public void setHourlyIncome(double hourlyIncome) {
        this.hourlyIncome = hourlyIncome;
    }

    public HourlyEmployee(int id, String name, double hourlyIncome) {
        super(name, id);
        setHourlyIncome(hourlyIncome);
        System.out.println("Enter total Hours: ");
        this.totalHours = input.nextInt();
    }

    public double caclculateHourly() {
        return hourlyIncome * totalHours;
    }

    public String toString() {
        return String.format("Employee: %s (ID: %d)\nThis month salary = %d * %.0f = %.0f ", getName(), getId(),
                getTotalHours(), getHourlyIncome(), caclculateHourly());
    }
}
