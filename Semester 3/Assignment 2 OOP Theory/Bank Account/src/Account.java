import java.util.*;

public class Account {
    private String cnic;
    private long accountNumber;
    private String accountTitle;
    private double balance;
    private static int count = 0;
    protected static Scanner input = new Scanner(System.in);

    public void addAccount(String cnic, String accountTitle, double balance) {

        setAccountTitle(accountTitle);
        setCnic(cnic);
        setBalance(balance);
    }

    public Account() {
        System.out.println("Basic Account Credentials");
        setAccountTitle("AneeqKhurram");
        setCnic("35201");
        setAccountNumber(123);
        setBalance(500);

        ++count;
    }

    public Account(String cnic, long accountNumber, String accountTitle, double balance) {
        System.out.println("Basic Account Credentials");
        setAccountTitle(accountTitle);
        setCnic(cnic);
        setAccountNumber(accountNumber);
        setBalance(balance);
        ++count;
    }

    public void deposit(double amount) {
        this.balance = (amount >= 0) ? (this.balance += amount) : (this.balance);
    }

    public void withdraw(double amount) {
        this.balance = (amount >= 0) ? (this.balance -= amount) : (this.balance);
    }

    public int totalAccounts() {
        return count;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        do {
            if (checkCnic(cnic) == true) {
                this.cnic = cnic;
                break;
            } else {
                System.out.print("\nTry Again! You entered wrong cnic: ");
                cnic = input.nextLine();

            }
        } while (checkString(cnic) == false);
    }

    public static boolean checkCnic(String cnic) {

        return (cnic.matches("[0-9]+"));
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static boolean checkAccountNumber(long accountNumber) {
        String s = String.valueOf(accountNumber);
        return s.charAt(0) == '1';
    }

    public String getAccountTitle() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        do {
            if (checkString(accountTitle) == true) {
                this.accountTitle = accountTitle;
                break;
            } else {
                System.out.print(
                        "\nTry Again! You entered wrong account Title\nFirst letter should be capital\nThere should be no numbers in the name: ");
                accountTitle = input.nextLine();

            }
        } while (checkString(accountTitle) == false);
    }

    public static boolean checkString(String accountTitle) {

        return ((accountTitle != null) && (accountTitle.charAt(0) != 32) && (accountTitle.matches("^[a-zA-Z]*$"))
                && (accountTitle.charAt(0) >= 65 && accountTitle.charAt(0) <= 90));
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        do {
            if (balance > 0) {
                this.balance = balance;
                break;
            } else {
                System.out.print("\nYou entered invalid balance amount. Try Again: ");
                balance = input.nextDouble();
            }
        } while (true);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Account.count = count;
    }
}
