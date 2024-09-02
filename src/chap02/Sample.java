package chap02;

public class Sample {
    public static void main(String[] args) {
        // String, 참조 자료형 : new 예약어를 사용해서 변수를 초기화.
        // String은 예외
        String drink1 = "Mountain Dew"; // 리터럴 값으로 초기화
        String drink2 = new String("Pepsi Zero - Lime Flavor");
        String drink3 = ""; // null => 자칫하면 NullPointException(NPE) 이 발생 => 어디에서 오류가 발생했는지 알 수가 없음 ㄷㄷㄷ
        String drink4 = "Mountain Dew";
        String drink5 = new String("Pepsi Zero - Lime Flavor");
        String drink6 = "Pepsi Zero - Lime Flavor";
        // 따라서 문자열을 초기화 할 때 리터럴에 null 로 초기화 하면 안 됨...

        // 그러나 String은 참조 자료형임에도 불구하고 new 예약어를 사용하지 않아도 됨.
//        System.out.println(drink1);
//        System.out.println(drink2);

        // 값 자체만을 비교하려면 equals 사용
        System.out.println(drink1 == drink2); // false
        System.out.println(drink5.equals(drink6)); // true

        System.out.println(drink1 == drink4); // true ( 같은 주솟값을 가리키므로 )
        System.out.println(drink2 == drink5); // false ( 서로 다른 주솟값에 새로 생성되므로 )
    }
}

