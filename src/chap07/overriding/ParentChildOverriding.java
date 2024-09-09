package chap07.overriding;

public class ParentChildOverriding {
    public static void main(String[] args) {
        Child me = new Child();
        me.method1();
        me.method2();   // 재정의된 메서드가 호출됨
                        // 부모 클래스의 method2는 무시된다.
        me.method3();

        Parent parent = new Parent();
        parent.method1();
        parent.method2();   // Parent 클래스의 method2 호출
        // parent.method3();
        // 에러 이유 : parent 클래스는 아무것도 상속받고 있지 않음.
        // (따라서 method3는 접근 불가능)
    }
}
