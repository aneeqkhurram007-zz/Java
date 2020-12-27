import java.io.Serializable;

public class Employee implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String name;
    int empId;
    double hourlyIncome;

    public Employee() {
        name = "Aneeq Khurram";
        empId = 1;
        hourlyIncome = 9000;
    }

    public Employee(String name, int empId, double hourlyIncome) {
        this.name = name;
        this.empId = empId;
        this.hourlyIncome = hourlyIncome;
    }

    @Override
    public String toString() {
        return "Employee: " + name + " (ID: " + empId + " ), Income: " + hourlyIncome;
    }
}
