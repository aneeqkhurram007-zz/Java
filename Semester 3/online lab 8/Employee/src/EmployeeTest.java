public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new HourlyEmployee("Aneeq", 1, 100);
        Employee e2 = new PermanentEmployee("Murshad", 2, 100);

        System.out.println(e1);
        System.out.println(e2);

    }
}
