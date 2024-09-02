package chap02.casting;

public class StringConverter {
    public static void main(String[] args) {
        // String -> 숫자 변환 ( parseXXX() ) 메소드를 사용하여 변환
        String str = "12345";

        int primitiveStr = Integer.parseInt(str); // int로 변환 - parerInt
        primitiveStr = primitiveStr + 1;
        System.out.println(primitiveStr); // 12346

        Integer wrapperStr = Integer.valueOf(str); // Integer 객체 생성 - valueOf
        System.out.println(wrapperStr); // 12345

        /////////////////////////////////////////////////////////////////////////
        float floatStr = Float.parseFloat(str); // float로 변환 - parseFloat
        System.out.println(floatStr + 0.13); // 12345.13

        Float floatStr2 = Float.valueOf(str); // Float 객체 생성 - valueOf
        System.out.println(floatStr2 + 0.26); // 12345.26

        /////////////////////////////////////////////////////////////////////////
        double doubleStr = Double.parseDouble(str); // double로 변환 - parseDouble
        System.out.println(doubleStr + 0.1); // 12345.1

        Double doubleStr2 = Double.valueOf(str); // Double 객체 생성 - valueOf
        System.out.println(doubleStr2 + 0.2); // 12345.2

        int a1 = 10;
        String strA1;
        strA1 = String.valueOf(a1);
        System.out.println(strA1);

        strA1 = Integer.toString(a1);
        System.out.println(strA1);

        strA1 = "" + a1; // 정수값에 빈 문자열을 더해 문자열 합치기
        System.out.println(strA1);
        
        Object nullStr = null;
        String stringStr;

        stringStr = nullStr.toString(); // NPE 발생
        System.out.println(stringStr);

        stringStr = String.valueOf(nullStr); // 문자열 " null " 로 변환됨
        System.out.println(stringStr);
    }
}
