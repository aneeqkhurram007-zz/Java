public class EmployeeTest {
    public static void main(String[] args) {

        HourlyEmployee emp1 = new HourlyEmployee(1, "Aneeq", 500);
        PermanentEmployee emp2 = new PermanentEmployee(2, "Murshad", 400);

        System.out.println(emp1);
        System.out.println(emp2);

    }
}
