import java.util.Scanner;

public class Test {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int option;
        System.out.println("\t Welcome to Residence Maintenence\n");
        System.out.println("Press 1 for a House.");
        System.out.println("Press 2 for an Apartment");
        System.out.println("Press 3 for Exit.");
        System.out.print("\nEnter your option: ");
        option = input.nextInt();
        while (option != 3) {
            switch (option) {
                case 1:

                    break;
                case 2:

                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

    }

    public static int Menu() {

        return input.nextInt();
    }

}
