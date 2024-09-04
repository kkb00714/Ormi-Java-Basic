package chap04;

import static java.lang.Long.sum;

public class Quiz {
    public static void main(String[] args) {
        // 실습 1
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = new int[3][3];

        // for문 작성하는 부분
        for (int i = 0; a.length > i; i++) {
            for (int j = 0; j <= 2; j++) {
                b[i][j] = a[i][j];
            }
        }

        // a배열과 b배열 출력
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("a[" + i + "][" + j + "]: " + a[i][j]);
                System.out.println("b[" + i + "][" + j + "]: " + b[i][j]);
            }
        }

        // 실습2
        // for문을 이용하여 배열에 있는 숫자들의 최대값과 평균을 구하세요.
        int[] array = {12, 4, 7, 20, 1};
        int max = 0;
        int avg = 0;

        // 코드 작성하는 부분
        for (int cnt = 0; cnt < array.length; cnt++) {
            if (array[cnt] >= max) {
                max = array[cnt];
            }
            avg += array[cnt];
        }

        // 결과 출력 (최대값: max, 평균: avg)
        System.out.println(max);
        System.out.println(avg / array.length);

         // 실습3
         // 0부터 20까지 짝수만 출력하는 코드를 작성해보세요.

        for (int num = 0; num <= 20; num++) {
            if (num % 2 == 0 && num != 0) {
                System.out.println("짝수 : " + num);
            }
        }


    }
}
