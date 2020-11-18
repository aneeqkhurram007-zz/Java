public class PermanentEmployee extends Employee {

    public PermanentEmployee(String name, int empId, double hourlyIncome) {
        super(name, empId, hourlyIncome);
        System.out.println("Permanent Employee");
    }

    @Override
    public double earnings() {
        return getHourlyIncome() * 180;
    }
}
