package chap04;

public class Loop4 {
    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 5) {
//            System.out.println(i);
//            i++;
//        }
//
//        int j = 1;
//        while (j <= 10) {
//            System.out.println("나무를 " + j + "번 찍었습니다.");
//            j++;
//        }
//        System.out.println("넘어간다아아아!!!");

//        int k = 0;
//        while (k <= 60) {
//            k++;
//            if (k % 3 != 0) {
//                continue;
//            }
//            System.out.println(k);
//        }

        int l = 1;
        do {
            // 이 블럭을 먼저 실행시킴
            l++;
            System.out.println(l); // 2, 3, 4, 5
        } while (l < 5);

        int m = 0;
        do {
            m++;
            if (m % 3 == 0) {
                System.out.println("3의 배수 " + m);
            }
        } while (m < 60);
    }
}
