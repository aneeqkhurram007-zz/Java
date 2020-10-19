public class Account {
    private double balance;
    private int accountId = 0;
    private int age;
    private int cnic;
    private String accountName;
    private static int count = 0;

    // Getters and Setters

    public double getBalance() {
        return this.balance;
    }

    private void setBalance(int age) {
        if (age > 35) {
            this.balance = 0;
        } else if (age >= 20 && age <= 25) {
            this.balance = 50000;
        } else if (age > 25 && age <= 30) {
            this.balance = 25000;
        } else if (age > 30 && age <= 35) {
            this.balance = 10000;
        }
    }

    public int getAccountId() {
        return this.accountId;
    }

    public void setAccountId(int cnic, int age) {
        this.accountId = ++count;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
        setBalance(age);
    }

    public int getCnic() {
        return this.cnic;
    }

    public void setCnic(int cnic) {
        this.cnic = cnic;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    // Constructors

    public Account(int cnic, String accountName, int age) {
        this.cnic = cnic;
        this.accountName = accountName;
        this.age = age;
        setAccountId(cnic, age);
        setBalance(age);

    }

    public Account(Account account) {
        this.cnic = account.cnic;

        this.accountName = account.accountName;
        this.age = account.age;
        setBalance(account.age);
        this.accountId = account.accountId;
    }

    // Depost and WithDraw
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }

    }

    public void withDraw(double amount) {
        if (amount > 0) {
            balance -= amount;
        }

    }

    public void display() {
        System.out.println("Your name = " + accountName);
        System.out.println("Your age = " + age);
        System.out.println("Your balance = " + balance);
        System.out.println("Your cnic = " + cnic);
        System.out.println("Your id = " + accountId);
    }
}
