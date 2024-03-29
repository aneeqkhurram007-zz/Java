import java.time.LocalDate;
import java.util.*;

public class PaymentTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n\tCash Payment:");

        System.out.print("\nEnter First Payment amount: ");
        CashPayment cash1 = new CashPayment(input.nextDouble());

        System.out.print("Enter Second Payment amount: ");
        CashPayment cash2 = new CashPayment(input.nextDouble());

        System.out.println("\n\tCredit Card Payment");

        System.out.println("Enter First Credit Card Info: ");
        System.out.println("Enter your name: ");
        input.nextLine();
        String name = input.nextLine();

        System.out.println("Enter your card number: ");
        long cardNumber = input.nextLong();

        System.out.println("Enter expiry date: ");
        LocalDate date = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());

        CreditCardPayment card1 = new CreditCardPayment(name, cardNumber, date);

        System.out.println("Enter Second Credit Card Info: ");
        System.out.println("Enter your name: ");
        input.nextLine();
        name = input.nextLine();

        System.out.println("Enter your card number: ");
        cardNumber = input.nextLong();

        System.out.println("Enter expiry date: ");
        date = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());

        CreditCardPayment card2 = new CreditCardPayment(name, cardNumber, date);

        System.out.println("\nOutputs");
        cash1.paymentDetails();
        cash2.paymentDetails();

        card1.paymentDetails();
        card2.paymentDetails();

        input.close();
    }
}
