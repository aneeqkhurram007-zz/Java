import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class Test {
    static Scanner input = new Scanner(System.in);
    static ObjectOutputStream fos;
    static ObjectInputStream fin;

    public static void main(String[] args) throws Exception {
        int choice;
        fos = new ObjectOutputStream(new FileOutputStream("data.ser"));

        fin = new ObjectInputStream(Files.newInputStream(Paths.get("data.ser")));

        while ((choice = menu()) != 4) {

            switch (choice) {
                case 1:
                    addEmployee();
                    break;

                case 2:
                    searchEmployee();
                    break;
                case 3:
                    readAllEmployeeData();
                    break;

                default:
                    System.out.println("Invalide Choice");
                    break;
            }

        }
        fos.close();

    }

    public static int menu() {
        System.out.println("Press 1 Add Employee Data to File.");
        System.out.println("Press 2 Search Employee.");
        System.out.println("Press 3 Read all data from Employee.");
        System.out.println("Press 4 Exit.");
        int choice = input.nextInt();
        return choice;
    }

    public static void addEmployee() throws IOException {
        System.out.println("Name\tid\tIncome");
        Employee employee = new Employee(input.next(), input.nextInt(), input.nextDouble());

        try {

            fos.writeObject(employee);
            System.out.println(employee);
        } catch (Exception e) {
            System.out.println("Error in addEmployee");
            e.printStackTrace();
        }
    }

    public static void searchEmployee() {

        System.out.print("Enter employee id: ");
        int id = input.nextInt();
        try {

            while (true) {
                Employee employee = (Employee) fin.readObject();
                if (id == employee.empId) {
                    System.out.println(employee);
                }

            }
        } catch (

        EOFException e) {
            System.out.println("No more records");
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        }
    }

    public static void readAllEmployeeData() {
        try {

            while (true) {
                Employee employee = (Employee) fin.readObject();
                System.out.println(employee);
            }

        } catch (EOFException e) {
            System.out.println("No more records");
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IO exception");
            e.printStackTrace();
        }
    }
}
