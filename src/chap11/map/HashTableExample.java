package chap11.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();
        map.put("spring", "1234");      // 실제로는 암호화 처리를 해야하는 pw 정보
        map.put("summer", "123");
        map.put("fall", "12");
        map.put("winter", "1");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("아이디를 입력하세요 : ");
            String id = scanner.nextLine();

            System.out.printf("패스워드를 입력하세요 : ");
            String pw = scanner.nextLine();

            if (map.containsKey(id)) {
                if (map.get(id).equals(pw)) {
                    // map 에 저장되어 있는 key값의 value와 일치하는 pw를 비교하는 조건문
                    System.out.println("로그인 완료");
                    break;
                } else {
                    System.out.println("패스워드가 일치하지 않습니다.");
                }
            } else {
                System.out.println("아이디가 일치하지 않습니다.");
            }
        }
    }
}
