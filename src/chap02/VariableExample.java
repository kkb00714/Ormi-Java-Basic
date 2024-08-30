package chap02;

public class VariableExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20;
        long var3 = 1000000000;
        long var4 = 1000000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);

        double floatValue = 1.01234;
        float doubleValue = 1.1234f;

        System.out.println(floatValue);
        System.out.println(doubleValue);

        float floatValue2 = 0.1234567891234567f;
        double doubleValue2 = 0.12345678912367F;

        System.out.println(floatValue2);
        System.out.println(doubleValue2);


        boolean stop = false;
        if (stop) {
            System.out.println("중지합니다!");
        } else {
            System.out.println("시작합니다!");
        }

    }
}
