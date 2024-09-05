package chap05;

public class StringMethod {
    public static void main(String[] args) {
        // indexOf, charAt
        String hi = "Hello Java";
        System.out.println(hi.indexOf('J')); // 6

        int index = hi.indexOf('J');
        char character = hi.charAt(index);
        System.out.println(character); // J

        // replaceAll(), replace("기존 문자열", "대체할 문자열")
        String hi2 = "Hello Java Java Java World";
        String replaceStr = hi2.replaceAll("Java", "Spring");
        System.out.println(replaceStr); // Hello Spring Spring Spring World

        // substring(시작 위치, 끝 위치), 끝 위치는 포함되지 않음
        String hi3 = "Hello World!";
        System.out.println(hi3.substring(2, 6)); // llo (2, 3, 4, 5 까지만 출력)
        System.out.println(hi3.substring(4)); // 4번부터 끝까지 출력

        // toUpperCase - 전부 대문자로 출력,
        // toLowerCase - 전부 소문자로 출력
        String hi4 = "Madeca ToNInG EsSence TREATment";
        System.out.println(hi4.toUpperCase());
        System.out.println(hi4.toLowerCase());

        // 문자열.concat("합치고자 하는 문자열")
        String hi5 = "     BioHazard - Resident Evil 4";
        System.out.println(hi5.concat(" : Leon S Kennedy"));

        // trim() - 문자열의 앞 뒤 공백 제거 (가운데 공백은 남아있음)
        System.out.println("hi5.trim() : " + hi5.trim());
    }
}
