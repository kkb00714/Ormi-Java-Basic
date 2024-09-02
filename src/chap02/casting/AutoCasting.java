package chap02.casting;

public class AutoCasting {
    public static void main(String[] args) {
        byte gyeonggi = 31;
        int Gyeonggi = gyeonggi; // 타입 변환 (byte -> int)
        System.out.println(Gyeonggi);

        char charValue = '가';
        int intValue = charValue; // 유니코드로 변환
        System.out.println("'가' 의 유니코드 = " + intValue);

        intValue = 500;
        long longValue = intValue; // 타입 변환 (int -> long)
        System.out.println(longValue);

        intValue = 200;
        double doubleValue = intValue; // 타입 변환 (long -> double)
        System.out.println(doubleValue);

    }
}
