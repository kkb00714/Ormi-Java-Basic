package chap04;

public class Condition {
    public static void main(String[] args) {
        // 위의 args를 통해 입력을 받을 수 있음.
//        int score = Integer.parseInt(args[0]); // 문자열을 int로
        int score = 100;
        char grade = ' ';

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println(grade);
    }
}
