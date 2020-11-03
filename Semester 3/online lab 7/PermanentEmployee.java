public class PermanentEmployee extends Employee {

    private double hourlyIncome;

    public double getHourlyIncome() {
        return hourlyIncome;
    }

    public void setHourlyIncome(double hourlyIncome) {
        this.hourlyIncome = hourlyIncome;
    }

    public PermanentEmployee(int id, String name, double hourlyIncome) {
        super(name, id);
        setHourlyIncome(hourlyIncome);
    }

    public double calculateIncome() {
        return hourlyIncome * 180;
    }

    public String toString() {
        return String.format("Employee: %s (ID: %d)\nThis month salary @ %.0f PKR/Hour = %.0f ", getName(), getId(),
                getHourlyIncome(), calculateIncome());
    }

}
