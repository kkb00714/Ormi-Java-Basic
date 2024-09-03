package chap03;

public class Operator4 {
    public static void main(String[] args) {
        int score = 95;
        char grade = (score > 90) ? 'A' : 'B';
        System.out.println(grade); // true이면 앞의 피연산자를, false라면 뒤의 피연산자를 선택
    }
}
