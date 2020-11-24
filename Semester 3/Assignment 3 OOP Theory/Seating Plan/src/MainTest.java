import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char restart;
        char choice;

        do {
            display();
            System.out.print("Enter your choice: ");
            choice = input.nextLine().charAt(0);

            switch (choice) {
                case 'a':

                    break;
                case 'b':

                    break;
                case 'c':

                    break;
                case 'd':

                    break;
                case 'e':

                    break;
                case 'f':

                    break;
                case 'g':
                    System.out.println("Have a nice day:)");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }

            System.out.print("Do you want to continue (y/n): ");
            restart = input.nextLine().charAt(0);

        } while (restart == 'y' || restart == 'Y');
        input.close();
    }

    public static void display() {
        System.out.println("\n\tSeat Reservation and Management System.\n");
        System.out.println("a. Seat Pattern");
        System.out.println("b. Seat Reservation");
        System.out.println("c. Seat Cancellation");
        System.out.println("d. Available Seats");
        System.out.println("e. Reserved Seats");
        System.out.println("f. Search Reservation");
        System.out.println("g. Exit");
    }
}
