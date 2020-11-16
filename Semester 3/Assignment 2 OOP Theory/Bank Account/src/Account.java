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
        setAccountTitle("AneeqKhurram");
        setCnic("35201");
        this.accountNumber = 12345;
        setBalance(500);

        ++count;
    }

    public void details() {
        System.out.println("Account Details");
        System.out.println("Name: " + getAccountTitle());
        System.out.println("Cnic: " + getCnic());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
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
        this.cnic = cnic;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountTitle() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = (balance > 0) ? (this.balance = balance) : (this.balance);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Account.count = count;
    }
}
