public class Account {
    private String name;
    private double balance;
    static double yearlyInterestRate;
    private double monthlyInterst;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = (balance > 0) ? (this.balance = balance) : (this.balance = 0);
    }

    public Account() {

        this("MyAccount", 5000.0);
    }

    public Account(String name, double balance) {
        setName(name);
        setBalance(balance);
    }

    public void withDraw(double balance) {

        if (balance > 0) {
            this.balance -= balance;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void deposit(double balance) {

        if (balance > 0) {
            this.balance += balance;
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public double calculateMonthlyInterest() {
        this.monthlyInterst = this.balance * yearlyInterestRate / 12;
        this.balance = this.balance + monthlyInterst;
        return this.monthlyInterst;
    }

    public static void modofyYearlyInterestRate(double yearlyInterest) {
        yearlyInterestRate = yearlyInterest;
    }
}
