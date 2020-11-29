import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String lastName, String firstName, Integer ssn, LocalDate birthdate, double weeklySalary) {
        super(lastName, firstName, ssn, birthdate);
        setWeeklySalary(weeklySalary);
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary * 4;
    }

    @Override
    public String toString() {
        return "Salaried" + super.toString() + "\nWeekly Salary = " + getWeeklySalary();
    }

}
