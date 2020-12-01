import  java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char option;
        String option1;


        do {
            System.out.println("Press a for seat plan");
            System.out.println("Press b for seat reservation");
            System.out.println("Press c for seat cancellation");
            System.out.println("Press d for available seats");
            System.out.println("Press e for reserved seats");
            System.out.println("Press f for search seat");
            System.out.println("Enter your option: ");
            option = scanner.nextLine().charAt(0);

            if (option == 'a') {
                seatClass.seatPlan();
            } else if (option == 'b') {
                seatClass.seatReserve();
            } else if (option == 'c') {
                seatClass.seatCancellation();
            } else if (option == 'd') {
                seatClass.seatsAvailable();
            } else if (option == 'e') {
                seatClass.seatsReserved();
            } else if (option == 'f') {
                seatClass.searchSeat();
            }

            System.out.println("\nDo you want to continue: ");
            option1 = scanner.nextLine();

        } while (option1.equals("y"));

        scanner.close();
    }

}
