package JavaReviewExample;

public class ReviewProject3 {
    public static void main(String[] args) {
        System.out.println("try-catch 사용");
        int a = 3;
        int b = 6;

        try {
           int str1 = a + b;
            System.out.println(str1);
            int str2 = a / 0;
            System.out.println(str2);
        } catch (NullPointerException e) {
            System.out.println("NPE" + e);
        } catch (Exception e) {
            System.out.println("Exception" + e);
        } finally {
            System.out.println("Finally");
        }

        // switch-case문 작성
        System.out.println("Switch-Case문 사용");
        int str3 = b / a;
        switch (str3) {
            case 1:
                System.out.println("이건 실행 안 될 문장(실행되면 큰일)");
                break;
            case 2:
                System.out.println("a, b 몫은 2지롱");
            case 3:
                System.out.println("브레이크 없어서 실행됨");
            default:
                System.out.println("이건 디폴트값이라 항상 실행");
        }
    }
    // 정처기땜에 어지러워서 짜본 에러처리문... 
    // switch-case 와 헷갈려서 예외를 case처럼 사용해버렸다.. 난바보다
}
