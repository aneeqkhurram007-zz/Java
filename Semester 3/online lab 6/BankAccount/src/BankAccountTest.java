public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Aneeq");
        BankAccount account2 = new BankAccount("Sheikh", 1000.0);

        account1.transacAmount.add(4.0);
        account1.transacAmount.add(5.0);
        account1.transacAmount.add(6.0);
        account1.transacAmount.add(-4.0);
        account1.transacAmount.add(-5.0);
        account1.transacAmount.add(-6.0);

        for (int i = 0; i < args.length; i++) {
            for (Double string : account2.transacAmount) {

            }
        }
    }
}
