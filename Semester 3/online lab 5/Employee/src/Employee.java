public class Employee {
    private static double annualTaxRate;
    private static double inflationrate = 0.3;
    private static int count = 0;
    private int id = 0;
    static {
        if (inflationrate > 0.5) {
            annualTaxRate = 0.05;
        } else {
            annualTaxRate = 0.10;
        }

    }
    private String name;
    private double salary;
    private double netMonthlyIncome;

    public double getNetMonthlyIncome() {
        return this.netMonthlyIncome;
    }

    public void setNetMonthlyIncome(double netMonthlyIncome) {
        this.netMonthlyIncome = netMonthlyIncome;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = ++count;
    }

    public Employee(Employee employee) {
        this.name = employee.name;
        this.salary = employee.salary;
        this.id = ++count;

    }

    public double computeAnnualTax() {
        return salary * 12 * annualTaxRate / 100;
    }

    public double computeNetSalary() {
        netMonthlyIncome = salary - computeAnnualTax();
        return netMonthlyIncome;
    }

    public static Employee compare(Employee... employee) {
        if (employee[0].salary > employee[1].salary && employee[0].salary > employee[2].salary) {
            return employee[0];
        } else if (employee[1].salary > employee[0].salary && employee[1].salary > employee[2].salary) {
            return employee[1];
        } else {
            return employee[2];
        }
    }

    public void display() {
        System.out.println("\n\tEmployee " + id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Annual Tax: " + this.computeAnnualTax());
        System.out.println("Net Salary: " + this.computeNetSalary());
    }

}
