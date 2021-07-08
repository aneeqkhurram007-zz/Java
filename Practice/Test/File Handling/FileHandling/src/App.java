import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        Employee e1 = new Employee("Aneeq", "Lahore", 3300, date);
        System.out.println(e1);
        String fileName = "input.ser";

        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(e1);

            out.close();
            file.close();
        } catch (Exception e) {

            System.out.println(e);
        }

        try {

            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            Employee e2 = (Employee) in.readObject();

            System.out.println(e2);

            in.close();
            file.close();

        } catch (Exception e) {

            System.out.println(e);
        }

    }
}
