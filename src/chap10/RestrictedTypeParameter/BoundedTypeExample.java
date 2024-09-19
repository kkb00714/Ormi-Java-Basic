package chap10.RestrictedTypeParameter;

public class BoundedTypeExample {
    public static void main(String[] args) {
        int v1 = Util.compare(4, 6);
        System.out.println(v1);

        int v2 = Util.compare(3.5, 3.5);
        System.out.println(v2);

        int v3 = Util.compare(2.1, 1);
        System.out.println(v3);
    }
}
