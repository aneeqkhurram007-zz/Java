import java.util.*;

public class AccountTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] account = new Account[5];
        CurrentAccount[] curreAccount = new CurrentAccount[5];
        SavingAccount[] savingAccount = new SavingAccount[5];

        int i = 0, j = 0, k = 0;

        while (i < 5 && j < 5 && k < 5) {

            System.out.println("\nWelcome to Bank Account Menu\n");
            int choice;
            System.out.println("1. Add Current Account");
            System.out.println("2. Add Saving Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(
                            "\nMake sure: \nCnic must be a number\nName's first letter must be capital and must have only letters \nAccount Number must start with 1\nBalance must be greater than 0");
                    curreAccount[j] = new CurrentAccount();
                    curreAccount[j].addAccount("352198", "David", 700, 1234548, 5);
                    curreAccount[j].details();

                    j++;
                    break;
                case 2:
                    System.out.println(
                            "\nMake sure: \nCnic must be a number\nName's first letter must be capital and must have only letters \nAccount Number must start with 2\nBalance must be greater than 0");

                    savingAccount[k] = new SavingAccount();
                    savingAccount[k].addAccount("3568947", "John", 800, 2354654, 2);
                    savingAccount[k].details();
                    k++;
                    break;
                case 3:

                    account[i] = new Account();
                    System.out.println("Enter the amount you want to deposit: ");
                    account[i].deposit(input.nextDouble());
                    i++;
                    break;
                case 4:

                    account[i] = new Account();
                    System.out.println("Enter the amount you want to withdraw: ");
                    account[i].withdraw(input.nextDouble());
                    i++;
                    break;
                case 5:
                    curreAccount[j] = new CurrentAccount();
                    curreAccount[j].details();
                    savingAccount[j] = new SavingAccount();
                    savingAccount[k].details();
                    j++;
                    k++;

                    break;
                case 6:
                    System.out.println("Have a nice Day :)");
                    System.exit(0);

                default:
                    System.out.println("You entered wrong Choice.");
                    break;

            }
        }
        input.close();

    }

}
