import java.util.Scanner;

public class Test {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int choice;
        while ((choice = Menu()) != 3) {
            switch (choice) {
                case 1:
                    House h = new House();
                    System.out.println("House#  ResidentName  Month  PaidStatus  HouseType");
                    h.input(input.next(), input.next(), input.nextInt(), input.nextBoolean(), input.next());
                    switch (subMenu()) {
                        case 1:
                            h.saveInformation(h);
                            break;
                        case 2:
                            System.out.println("Enter house number. ");

                            h.searchInformation(input.next(), h);
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                    break;
                case 2:
                    Apartment a = new Apartment();
                    System.out.println("With lift or without lift True/False");
                    Boolean lift = input.nextBoolean();

                    System.out.println("House#  ResidentName  Month  PaidStatus  HouseType");

                    a.input(input.next(), input.next(), input.nextInt(), input.nextBoolean(), input.next());
                    switch (subMenu()) {
                        case 1:
                            a.saveInformation(a);
                            break;
                        case 2:
                            System.out.println("Enter house number. ");

                            a.searchInformation(input.next(), a);
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }

    }

    public static int Menu() {

        System.out.println("\t Welcome to Residence Maintenence\n");
        System.out.println("Press 1 for a House.");
        System.out.println("Press 2 for an Apartment");
        System.out.println("Press 3 for Exit.");
        System.out.print("\nEnter your choice: ");
        return input.nextInt();
    }

    public static int subMenu() {
        System.out.println("Press 1 for adding data");
        System.out.println("Press 2 for searching data");
        System.out.println("\nEnter your choice: ");
        return input.nextInt();
    }
}
