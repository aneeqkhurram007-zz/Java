import java.util.*;

public class BankAccountTest {
    public static void main(String[] args) throws Exception {
        BankAccount bankAccount = new BankAccount();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        bankAccount.name = input.nextLine();
        System.out.println("Enter amount you want to add: ");
        bankAccount.balance = input.nextDouble();
        bankAccount.mainDisplay();
        // int choice, countDep = 0, countWith = 0;
        // //double amount;
        // choice = input.nextInt();
        // while (choice != 0) {

        // switch (choice) {
        // case 1:
        // System.out.print("Enter the amount you want to deposit in your account > ");
        // amount = input.nextDouble();
        // bankAccount.deposit();
        // countDep++;
        // break;
        // case 2:
        // System.out.print("Enter the amount you want to withdraw in your account > ");
        // amount = input.nextDouble();
        // bankAccount.withdraw();
        // countWith++;
        // break;
        // case 3:
        // System.out.println("Your account Details: ");
        // System.out.println("Your Name is : " + bankAccount.name);
        // System.out.println("Your current balance is : " + bankAccount.balance);
        // break;
        // case 4:
        // bankAccount.accountTrans(countDep, countWith);
        // System.exit(0);
        // break;

        // default:
        // System.out.println("You entered the wrong choice");
        // break;
        // }
        // bankAccount.mainDisplay();
        // choice = input.nextInt();

        // }
        input.close();

    }
}
