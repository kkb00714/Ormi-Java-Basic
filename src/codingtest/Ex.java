package codingtest;

public class Ex {
    public static void main(String[] args) {

        String t = "500220839878";
        String p = "7";
        int cnt = 0;
        int len = p.length();
        long str = Long.parseLong(p);
        String values;
        for (int i = 0; i <= (t.length() - len); i++) {
            values = t.substring(i, i+len);
            if (Long.parseLong(values) <= str) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
