package chap01;

public class Sample {
    public static void main(String[] args) {
        System.out.println("hello world!");
    }

    public int getResult() {
        int result = 11;
        return result;
    }

    public int getCnt() {
        int cnt = 20;
//        return result + cnt;
//        위 주석 코드가 에러나는 이유 => 전역변수를 가져와서 사용하려 했기 때문
        return cnt;
    }

}
