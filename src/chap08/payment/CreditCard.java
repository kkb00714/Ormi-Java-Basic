package chap08.payment;

public class CreditCard implements Payment{
    public String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount){
        //todo amount 결제 로직
        System.out.println("Processing PayPal payment of $" + amount + " using card number: " + cardNumber);
    }
}
