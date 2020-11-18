import java.util.*;

public class HourlyEmployee extends Employee {
    public int totalHours;
    private Scanner input = new Scanner(System.in);

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public HourlyEmployee(String name, int empId, double hourlyIncome) {
        super(name, empId, hourlyIncome);
        System.out.println("Hourly Employee");
        System.out.println("Enter total hours: ");
        setTotalHours(input.nextInt());
    }

    @Override
    public double earnings() {
        return getHourlyIncome() * getTotalHours();
    }

}
