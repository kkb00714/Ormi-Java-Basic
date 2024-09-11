package chap09;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account(77000);
        account.deposit(770);

        try {
            account.withdraw(100000);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
        }
    }
}
