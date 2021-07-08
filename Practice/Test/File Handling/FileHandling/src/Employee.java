import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private String name;
    private String address;
    private double salary;
    private Date hireDate;

    public Employee(String name, String address, double salary, Date hireDate) {
        setName(name);
        setAddress(address);
        setSalary(salary);
        setHireDate(hireDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = (salary > 0) ? salary : 1;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee [address=" + address + ", hireDate=" + hireDate + ", name=" + name + ", salary=" + salary
                + "]";
    }

}
