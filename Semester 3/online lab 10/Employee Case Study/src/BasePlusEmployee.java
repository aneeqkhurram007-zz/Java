import java.time.LocalDate;

public class BasePlusEmployee extends CommissionEmployee {

    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasePlusEmployee(String lastName, String firstName, Integer ssn, LocalDate birthdate, double commissionRate,
            double grossSales, double baseSalary) {
        super(lastName, firstName, ssn, birthdate, commissionRate, grossSales);
        setBaseSalary(baseSalary);
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales() + getBaseSalary();
    }

    @Override
    public String toString() {
        return "BasePlus" + super.toString() + "\nBase Salary = " + getBaseSalary();
    }
}
