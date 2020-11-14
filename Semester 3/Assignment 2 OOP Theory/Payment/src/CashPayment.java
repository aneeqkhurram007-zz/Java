public class CashPayment extends Payment {
    public CashPayment(double payment) {
        setPayment(payment);
    }

    @Override
    public void paymentDetails() {
        System.out.println("Payment is in Cash = " + getPayment());
    }
}
