package chap09.bank;

/*
* 사용자 정의 예외 (Checked Exception)
* */

public class BalanceInsufficientException extends Exception{
    public BalanceInsufficientException() {

    }

    public BalanceInsufficientException(String message) {
        super(message);
    }
}
