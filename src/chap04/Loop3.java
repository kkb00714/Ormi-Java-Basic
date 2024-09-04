package chap04;

public class Loop3 {
    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {  // i = 0, 1, 2
//            for (int j = 0; j < 4; j++) {  // j = 0, 1, 2, 3
//                System.out.println("i = " + i + ", j = " + j);
//            }
//        }

        // 세로 배치
        for (int a = 2; a < 10; a++) {
            System.out.println("\n+++< " + a + " 단 >+++");
            for (int b = 1; b < 10; b++) {
                System.out.println(a + " x " + b + " = " + a * b);
            }
        }

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
