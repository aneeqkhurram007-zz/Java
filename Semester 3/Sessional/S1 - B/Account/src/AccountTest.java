public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account("Account 2", 10000);

        System.out.println("\tBefore modifying Yealy Interest Rate: " + Account.yearlyInterestRate);
        System.out.println("Monthly Insterest for Both Savers");
        for (int i = 1; i <= 12; i++) {
            System.out.println("Month " + i);
            System.out.println("Account 1");
            acc1.calculateMonthlyInterest();
            System.out.println("Account name: " + acc1.getName() + " Balance: " + acc1.getBalance());

            System.out.println("MyAccount 2");
            acc2.calculateMonthlyInterest();
            System.out.println("Account name: " + acc2.getName() + " Balance: " + acc2.getBalance());

        }

        acc1.deposit(1000);
        acc2.withDraw(10000);

        Account.modofyYearlyInterestRate(0.1);

        System.out.println("\n\tAfter modifying Yealy Interest Rate: " + Account.yearlyInterestRate);
        System.out.println("Monthly Insterest for Both Savers");
        for (int i = 1; i <= 12; i++) {
            System.out.println("Month " + i);
            System.out.println("Account 1");
            acc1.calculateMonthlyInterest();
            System.out.println("Account name: " + acc1.getName() + " Balance: " + acc1.getBalance());

            System.out.println("Account 2");
            acc2.calculateMonthlyInterest();
            System.out.println("Account name: " + acc2.getName() + " Balance: " + acc2.getBalance());

        }
    }

    static {
        Account.yearlyInterestRate = 0.05;
    }
}
