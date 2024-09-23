package chap11.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ex {
    public static void main(String[] args) {
        Queue<String> messageQueue = new LinkedList<>();
        messageQueue.offer("메시지1");
        messageQueue.offer("메시지2");
        messageQueue.offer("메시지3");
        messageQueue.offer("메시지4");

        //
        System.out.println(messageQueue.peek());
        System.out.println(messageQueue.peek());
        System.out.println(messageQueue.peek());
        System.out.println(messageQueue.peek());

        System.out.println(messageQueue.poll());
        System.out.println(messageQueue.poll());
        System.out.println(messageQueue.poll());
        System.out.println(messageQueue.poll());
        System.out.println(messageQueue.poll());
    }
}
