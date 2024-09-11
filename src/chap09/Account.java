package chap09;

public class Account {
    long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    public void deposit(int money) {
        this.balance += money;
    }

    // 호출 측에서 이 예외에 대해 알아서 처리하라고 넘긴 것
    public void withdraw(int money) throws BalanceInsufficientException {
        if (balance < money) { // 출금 불가!
            throw new BalanceInsufficientException("잔액이 부족합니다. " + (balance - money) + "원 부족");
        }
        balance -= money;
    }
}
