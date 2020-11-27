import java.util.*;

public class MainTest {
    // static ArrayList<SeatPlan> seatPlans = new ArrayList<>();

    public static void main(String[] args) {
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

    /*
     * public static ArrayList<SeatPlan> SeatPlans() { for (int i = 0; i < 10; i++)
     * { seatPlans.add(new SeatPlan(person(i), i + 1));
     * System.out.print(seatPlans.get(i).getNum() + "\t"); for (Person person :
     * person(i)) { System.out.print(person.getId().charAt(1) + " "); }
     * System.out.println(); }
     * 
     * return seatPlans; }
     * 
     * public static ArrayList<Person> person(int v) { String Id = null;
     * ArrayList<Person> person = new ArrayList<>(); for (int i = 0; i < 4; i++) {
     * 
     * switch (i) { case 0: Id = "A"; break; case 1: Id = "B";
     * 
     * break; case 2: Id = "C";
     * 
     * break; case 3: Id = "D";
     * 
     * break;
     * 
     * default: break; } person.add(new Person("Aneeq", "35201", (Integer.toString(v
     * + 1) + Id))); }
     * 
     * return person; }
     */
}
