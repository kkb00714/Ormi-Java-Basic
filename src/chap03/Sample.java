package chap03;

public class Sample {
    public static void main(String[] args) {
        // 삼항 연산자 연습
        int num = 25;
        String result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(result);

        // 삼항 연산자 연습
        int a = 10;
        int b = 20;
        int result2 = (a < b) ? a : b;
        System.out.println(result2);

        // 삼항 연산자 연습
        int score = 77;
        String result3 = (score >= 60) ? "합격" : "불합격";
        System.out.println(result3);
    }
}
