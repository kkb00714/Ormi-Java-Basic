package chap04;

public class Loop {
    public static void main(String[] args) {
        // 1~50까지 출력
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }
        System.out.println("--------------------------");

        // 짝수 출력
        for (int j = 2; j <= 20; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }

        // 홀수 출력
        for (int k = 2; k <= 20; k++) {
            if (k % 2 == 1) {
                System.out.println(k);
            }
        }
    }
}
