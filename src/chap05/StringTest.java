package chap05;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "aaaabbccd";
        int cnt = 0;
        StringBuilder result = new StringBuilder(str1.length());
        char a = str1.charAt(0);

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == a) {
                cnt++;
            } else {
                result.append(a);
                result.append(cnt);
                a = str1.charAt(i);
                cnt = 1;
            }
        }

        result.append(a);
        result.append(cnt);
        System.out.println(result);
    }
}
