package chap11.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("문자열 1");
        queue.offer("문자열 2");
        queue.offer("문자열 3");
        queue.offer("문자열 4");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        // 마지막 값을 출력될 값이 없기 때문에 null 반환
    }
}
