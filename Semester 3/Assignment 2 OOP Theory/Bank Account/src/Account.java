public class Account {
    private String cnic;
    private long accountNumber;
    private String accountTitle;
    private double balance;
    private static int count = 0;

    public void addAccount(String cnic, String accountTitle, double balance) {
        this.cnic = cnic;
        this.accountNumber = ++count;
        this.accountTitle = accountTitle;
        this.balance = balance;
    }

    public Account() {
        System.out.println("Constructor Created");
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
        this.balance = balance;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Account.count = count;
    }
}
