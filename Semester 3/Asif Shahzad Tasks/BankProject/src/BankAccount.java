import java.util.*;

public class BankAccount {
    String name;
    double balance;
    double amount;
    Scanner input = new Scanner(System.in);
    int countDep = 0, countWith = 0;

    void deposit() {
        if (balance >= 100000) {
            balance += amount + (0.01 * amount);
        } else {
            balance += amount;
        }
    }

    void withdraw() {
        if (balance <= 50000) {
            int choice;
            System.out.println("Are you sure you want to withdraw");
            System.out.print("Press 1 to continue and 0 to abort : ");
            choice = input.nextInt();
            if (choice == 1) {

                balance -= amount - (0.02 * balance);
            }
        }
        balance -= amount;
    }

    void mainDisplay() {
        System.out.println("Prss 1: To Deposit an amount.");
        System.out.println("Prss 2: To Withdraw an amount.");
        System.out.println("Prss 3: To View the current balance.");
        System.out.println("Prss 4: To Close this program.");
        int choice;
        // double amount;
        choice = input.nextInt();
        while (choice != 0) {

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount you want to deposit in your account > ");
                    amount = input.nextDouble();
                    deposit();
                    countDep++;
                    break;
                case 2:
                    System.out.print("Enter the amount you want to withdraw in your account > ");
                    amount = input.nextDouble();
                    withdraw();
                    countWith++;
                    break;
                case 3:
                    System.out.println("Your account Details: ");
                    System.out.println("Your Name is : " + name);
                    System.out.println("Your current balance is : " + balance);
                    break;
                case 4:
                    accountTrans();
                    System.exit(0);
                    break;

                default:
                    System.out.println("You entered the wrong choice");
                    break;
            }
            mainDisplay();
            choice = input.nextInt();

        }

    }

    void accountTrans() {
        System.out.println("Account Title is : " + name);
        System.out.println("Total deposits : " + countDep);
        System.out.println("Total withdraws : " + countWith);
        System.out.println("Balance : " + balance);
    }
}
