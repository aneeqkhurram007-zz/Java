import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee emp1 = new Employee("Aneeq", 20000);
        Employee emp2 = new Employee("Aneeq Khurram", 30000);
        Employee emp3 = new Employee(emp2);
        emp1.display();
        emp2.display();
        emp3.display();
        System.out.println("Update Employee 2 salary: ");
        emp2.setSalary(input.nextDouble());
        emp3.setName("Murshad");
        System.out.print("\tHighest Salary\n");
        Employee.compare(emp1, emp2, emp3).display();

        input.close();
    }
}
