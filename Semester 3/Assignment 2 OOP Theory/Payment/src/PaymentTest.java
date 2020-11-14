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

        System.out.println("Enter First Credit Card Info\nName/Card Number/Date(yyyy/mm/dd)): ");
        CreditCardPayment card1 = new CreditCardPayment("Aneeq", 12345, LocalDate.of(2011, 04, 15));

        System.out.println("Enter Second Credit Card Info\nName/Card Number/Date(yyyy/mm/dd)): ");
        CreditCardPayment card2 = new CreditCardPayment("Murshad", 6789, LocalDate.of(2013, 05, 16));

        System.out.println("\nOutputs");
        cash1.paymentDetails();
        cash2.paymentDetails();

        card1.paymentDetails();
        card2.paymentDetails();

        input.close();
    }
}
