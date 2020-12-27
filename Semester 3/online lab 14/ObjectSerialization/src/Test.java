import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
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

        try {
            while (true) {
                Employee employee = (Employee) fin.readObject();
                System.out.println(employee);

            }
        } catch (EOFException e) {
            System.out.println("No more records");
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
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
        Random random = new Random();
        Employee employee = new Employee("Aneeq", random.nextInt(5), random.nextDouble());

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
