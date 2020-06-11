/**
 * sec
 */
public class sec {

    public static void main(String[] args) {
        // Person james = new Person("James", "Bond", 47);
        // System.out.println(james.getAge());

        Employee employee = new Employee();

        employee.setFirstName("James");
        employee.setLastName("Bond");
        employee.setAge(45);
        employee.setId(8798);
        employee.setAnnualSalary(1000);
        System.out.println(employee.getAnnualSalary());

        Manager manager = new Manager();
        manager.setFirstName("George");
        manager.setLastName("Kale");
        manager.setAge(45);
        manager.setId(4578);
        manager.setAnnualSalary(4500);
        System.out.println(manager);
    }
}
