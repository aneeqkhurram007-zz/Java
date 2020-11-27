import java.io.IOException;
import java.util.*;

public class MainTest {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner input = new Scanner(System.in);
        char restart;
        char choice;

        SeatPlan.SeatPlans();

        do {
            display();
            System.out.print("Enter your choice: ");
            choice = input.nextLine().charAt(0);

            switch (choice) {
                case 'a':
                    SeatPlan.showSeatPlan();
                    break;
                case 'b':

                    System.out.print("Enter seat number for reservation: ");
                    SeatPlan.seatReservation(input.nextLine());
                    break;
                case 'c':

                    System.out.print("Enter seat number for cancellation: ");
                    SeatPlan.seatCancellation(input.nextLine());
                    break;
                case 'd':
                    System.out.println("Available Seats: ");
                    SeatPlan.availableSeats();

                    break;
                case 'e':
                    System.out.println("Reserved Seats: ");
                    SeatPlan.reservedSeats();

                    break;
                case 'f':

                    System.out.print("Search for Reservation: ");
                    SeatPlan.searchReservation(input.nextLine());

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
