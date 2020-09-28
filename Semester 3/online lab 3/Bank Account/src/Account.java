import java.util.*;

public class Account {
    private double balance, amount;
    private String name;
    Scanner input = new Scanner(System.in);

    public Account(String nameArg, double balanceArg) {
        System.out.println("Your current balance is : " + balanceArg);
        name = nameArg;
        balance = balanceArg;
    }

    public void cashDepo() {
        System.out.print("Enter amount to deposit : ");
        amount = input.nextDouble();
        balance += amount;
    }

    public void cashWith() {
        System.out.print("Enter amount to withdraw : ");
        amount = input.nextDouble();
        balance -= amount;
    }

    public void accountInfo() {
        System.out.println("Account Title : " + name);
        System.out.println("Account Balance : " + balance);
    }

    public void display() {
        int choice;
        do {

            System.out.println("Press 1 for Cash Deposit");
            System.out.println("Press 2 for Cash Withdraw");
            System.out.println("Press 3 for Current Balance");
            System.out.println("Press 4 for Exit");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    cashDepo();
                    break;
                case 2:
                    cashWith();
                    break;
                case 3:
                    accountInfo();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.err.println("You entered wrong choice");
                    break;

            }

        } while (true);

    }

}
