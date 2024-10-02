package JavaReviewExample;

import java.util.ArrayList;
import java.util.List;

public class ReviewProject_2 {
    public static void main(String[] args) {
        // ArrayList

        List<String> iam = new ArrayList<>(); // 기본적으로 크기가 10인 배열 생성
        iam.add("요소1");
        iam.add("요소3");
        iam.add("요소2");
        iam.add("요소4");
        iam.add("요소1");

        System.out.println(iam);
        // ArrayList는 그냥 print해도 나온다.
        // 순서가 있고 중복제거는 되지 않는다.

        // 문제 1 - 학생 성적 구하기 (ReviewProject2_TestExample에 풀이)

    }
}
