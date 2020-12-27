import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test {
    static Scanner input = new Scanner(System.in);
    static ObjectOutputStream fos;
    static ObjectInputStream fin;

    public static void main(String[] args) throws Exception {
        int choice;
        fos = new ObjectOutputStream(new FileOutputStream("data.ser"));
        fin = new ObjectInputStream(new FileInputStream("data.ser"));

        while ((choice = menu()) != 3) {

            switch (choice) {
                case 1:
                    addEmployee();
                    break;

                case 2:
                    searchEmployee();
                    break;

                default:
                    System.out.println("Invalide Choice");
                    break;
            }

        }
        fos.close();

        while (true) {
            Employee employee = (Employee) fin.readObject();
            System.out.println(employee.name + "\t" + employee.empId);
        }

    }

    public static int menu() {
        System.out.println("Press 1 Add Employee Data to File.");
        System.out.println("Press 2 Searc Employee.");
        System.out.println("Press 3 Exit.");
        int choice = input.nextInt();
        return choice;
    }

    public static void addEmployee() {
        Employee employee = new Employee();
        try {
            fos.writeObject(employee);
        } catch (Exception e) {
            System.out.println("Error in addEmployee");
            e.printStackTrace();
        }
    }

    public static void searchEmployee() {

    }
}
