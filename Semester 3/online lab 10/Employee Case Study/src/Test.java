import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new SalariedEmployee("Khurram", "Aneeq", 1345, LocalDate.of(2002, 11, 14), 600));
        employees.add(new HourlyEmployee("Murshad", "Aneeq", 3546, LocalDate.of(2001, 12, 14), 150, 100));
        employees.add(new CommissionEmployee("Ustaad", "Aneeq", 156, LocalDate.of(2004, 9, 14), 5, 500));
        employees.add(new BasePlusEmployee("Don", "Aneeq", 79897, LocalDate.of(1999, 8, 14), 5, 500, 600));
        employees.add(new PieceWorker("Bhai", "Aneeq", 54648, LocalDate.of(1990, 7, 14), 10, 40));

        for (Employee employee : employees) {
            System.out.println(employee.toString());

            System.out.println("Old PayRoll");
            System.out.println("\n" + employee.getPayRoll());

            if ((employee instanceof BasePlusEmployee)
                    || employee.getBirthDate().getMonth() == LocalDate.now().getMonth()) {

                employee.setPayRoll(100);

            }
            System.out.println("New PayRoll");
            System.out.println("\n" + employee.getPayRoll() + "\n");

        }
    }
}
