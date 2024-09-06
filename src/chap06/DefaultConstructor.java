package chap06;

public class DefaultConstructor {
    String field;

    DefaultConstructor() {
        field = "특정 값으로 초기화";
    }

    DefaultConstructor(String field ) {
        this.field = field;
    }

    public static void main(String[] args) {
        // Default 생성자
        DefaultConstructor constructorTest = new DefaultConstructor("특정값");

        DefaultConstructor c2 = new DefaultConstructor();
    }
}
