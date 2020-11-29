import java.time.LocalDate;

public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String lastName, String firstName, Integer ssn, LocalDate birthdate,
            double commissionRate, double grossSales) {
        super(lastName, firstName, ssn, birthdate);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return "Commission" + super.toString() + "\nCommmission Rate = " + getCommissionRate() + "\nGross Sales = "
                + getGrossSales();
    }
}
