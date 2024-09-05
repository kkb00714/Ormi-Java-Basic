package chap05;

public class StringMethod2 {
    public static void main(String[] args) {
        String str1 = "aaaabbccd";
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }

        String str2 = "Hello Welcome Java";
        String result = "";
        for (int j = str2.length() - 1; j >= 0; j--) {
            result += str2.charAt(j);
        }
        System.out.println(result);

        String str3 = "    Hello Welcome Java   ";
        System.out.println(str3.replace(" ", ""));
    }

}
