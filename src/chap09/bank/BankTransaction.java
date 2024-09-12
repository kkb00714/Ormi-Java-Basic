package chap09.bank;

public class BankTransaction {
    public static void main(String[] args) {
        // A, B 계좌 생성
        Account a = new Account(50000);
        Account b = new Account(0);

        // A -> B 10만원 송금
        int money = 100_000;
        try {
            // A 계좌 출금에 실패했을 때, B 계좌에 입금된 금액 차감 (롤백)
            b.deposit(money); // B 계좌 입금
            a.withdraw(money); // A 계좌 출금 (예외 발생)
        } catch (BalanceInsufficientException e) {
            // 만약 잔액보다 큰 금액을 송금 시도할 경우 트랜잭션 처리
            System.out.println(b.balance);
            b.depositRollback(money);
            System.out.println("송금 실패");
        }
        System.out.println("송금 성공");
        System.out.println(b.balance);

    }
}
