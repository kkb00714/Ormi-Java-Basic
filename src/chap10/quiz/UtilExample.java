package chap10.quiz;

public class UtilExample {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("홍길동", 35);
        Integer age = Util.getValue(pair, "홍길동");
        System.out.println(age);

        ChildPair<String, Integer> childPair = new ChildPair<>("삼길동", 20);
        Integer childAge = Util.getValue(pair, "이길동");
        System.out.println(childAge);

        // OtherPair는 Pair를 상속하지 않으므로 예외가 발생해야합니다.
		/* OtherPair<String, Integer> otherPair = new OtherPair<>("삼길동, 20");
		   int otherAge = Util.getValue(otherPair, "삼길동");
		   System.out.println(otherAge); */
    }
}