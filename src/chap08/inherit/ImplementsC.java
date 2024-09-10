package chap08.inherit;

public class ImplementsC implements InterfaceC{

    // ImplementC의 추상 메서드
    @Override
    public void methodC() {
        System.out.println("ImplementsC.methodC");
    }

    // ImplementA의 추상 메서드
    @Override
    public void methodA() {
        System.out.println("ImplementsC.methodA");
    }

    // ImplementB의 추상 메서드
    @Override
    public void methodB() {
        System.out.println("ImplementsC.methodB");
    }
}
