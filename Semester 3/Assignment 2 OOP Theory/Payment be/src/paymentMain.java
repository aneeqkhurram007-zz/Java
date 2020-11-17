import java.util.*;

public class paymentMain {
    public static void main(String[] args) {

        String Cname = args[0];
        System.out.println(Cname);
        Scanner input = new Scanner(System.in);

        System.out.println("\nCash:");

        System.out.print("Enter Amount 1: ");
        cash cash1 = new cash(input.nextDouble());

        System.out.print("Enter Amount 2: ");
        cash cash2 = new cash(input.nextDouble());

        cash1.paymentDetails();
        cash2.paymentDetails();

        System.out.println("\nCredit Card");

        System.out.println("Enter Credit Card 1: ");
        System.out.println("Enter name: ");
        input.nextLine();
        String name = input.nextLine();

        System.out.println("Enter card number: ");
        int cardNumber = input.nextInt();

        System.out.println("Enter expiry date (YYYY-MM-DD): ");
        input.nextLine();
        String date = input.nextLine();

        creditCard card1 = new creditCard(name, cardNumber, date);

        System.out.println("Enter Credit Card 2: ");
        System.out.println("Enter name: ");
        name = input.nextLine();

        System.out.println("Enter card number: ");
        cardNumber = input.nextInt();

        System.out.println("Enter expiry date (YYYY-MM-DD): ");
        input.nextLine();
        date = input.nextLine();

        creditCard card2 = new creditCard(name, cardNumber, date);

        card1.paymentDetails();
        card2.paymentDetails();

    }
}
