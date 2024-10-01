package JavaReviewExample;

import java.util.Arrays;

public class ReviewProject_1 {
    public static void main(String[] args) {
        // 자바와 친해지길 바래 - 복습1
        // -> 어려웠던 내용들 다시 복습하기 !!
        // 요주의 클래스들 - Array, ArrayList  (1일차 예정)
        // 제네릭, 와일드카드  (2일차 예정)
        // 람다, 스트림  (3일차 예정)

        // 일반 Array(배열)은 두 가지 방법으로 할당이 가능했다.
        // 1. 미리 값을 넣어줘서 크기를 지정하는 방법
        String[] favoriteFood = {"소금빵", "초코케잌", "쿨피스", "디카페인 아아", "딸기라떼 휘핑많이(^^)"};

        // 바로 favoriteFood를 출력하면 주솟값이 나오기 때문에
        // Arrays.toString(배열명) 으로 출력하거나
        // 반복문을 사용해서 출력하는 방법이 있다.
        System.out.println(Arrays.toString(favoriteFood));
        for(String food : favoriteFood) {
            System.out.printf(food + ", ");
        }

        System.out.println("========================");

        // 2. Array(배열)의 크기를 정해두고 추가하는 방법
        // 값이 할당되지 않거나 남아있는 자리는 null 값이 들어감.
        String[] favoriteGame = new String[5];
        favoriteGame[0] = "슈퍼마리오";
        favoriteGame[1] = "포켓몬스터";
        favoriteGame[2] = "바이오하자드";
        favoriteGame[3] = "엘든링";

        System.out.println(Arrays.toString(favoriteGame));

        // 응용 코테 1 - 배열 거꾸로 출력하기!! (프로그래머스 참고 !!)

        int[] num_list = {5, 4, 3, 2, 1};

        int n = num_list.length;
        int[] result = new int[n];
        for (int i = 0; i < num_list.length; i++) {
            result[n - 1 - i] = num_list[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
