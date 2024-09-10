package chap08.payment;

public class PaymentProcess {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("5678-1234");
        creditCard.processPayment(67000);

        Paypal paypal = new Paypal("email@gmail.com");
        paypal.processPayment(67000);

        Payment card1 = new CreditCard("1234-9876");
        Payment card2 = new Paypal("22@aws.com");
    }
}
