package chap11.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinStack = new Stack<Coin>();
        coinStack.push(new Coin(500));
        coinStack.push(new Coin(100));
        coinStack.push(new Coin(50));
        coinStack.push(new Coin(10));
        coinStack.push(new Coin(5));

// peek는 값을 제거하지 않으므로 가장 위의 값만 반복됨 (5)
        System.out.println(coinStack.peek());
        System.out.println(coinStack.peek());
        System.out.println(coinStack.peek());
        System.out.println(coinStack.peek());
        System.out.println(coinStack.peek());

// 가장 윗 값을 부터 하나씩 반환한 후 삭제 => 5, 10, 50, 100
        System.out.println(coinStack.pop());
        System.out.println(coinStack.pop());
        System.out.println(coinStack.pop());
        System.out.println(coinStack.pop());
        System.out.println(coinStack.pop());


    }
}
