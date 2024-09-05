package chap05;

public class CompareReferenceType {
    public static void main(String[] args) {
        OutterClass outter = new OutterClass();
        OutterClass outter2 = new OutterClass();

        System.out.println(outter == outter2); // false

        String str1 = new String("문자1");
        String str2 = new String("문자1");

        System.out.println(str1 == str2);

        String str3 = "문자1";
        System.out.println(str1 == str3);

        String str4 = "문자1";
        System.out.println(str3 == str4);
    }
}
