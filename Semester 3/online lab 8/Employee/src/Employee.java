public class Employee {
    private String name;
    private int empId;
    private double hourlyIncome;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getHourlyIncome() {
        return hourlyIncome;
    }

    public void setHourlyIncome(double hourlyIncome) {
        this.hourlyIncome = hourlyIncome;
    }

    public Employee(String name, int empId, double hourlyIncome) {
        setName(name);
        setEmpId(empId);
        setHourlyIncome(hourlyIncome);
    }

    public Employee() {
    }

    public double earnings() {
        return getHourlyIncome();
    }

    public String toString() {
        return "Employee: " + getName() + " (ID: " + getEmpId() + "), Income: " + earnings();
    }

}
