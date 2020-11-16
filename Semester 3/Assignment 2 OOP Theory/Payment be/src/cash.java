public class cash extends payment {

    public cash(double payment) {
        this.payment = payment;
    }

    public void paymentDetails() {
        System.out.println("Payment Details");
        System.out.println("You have " + this.payment + " Rs in your account");
    }
}
