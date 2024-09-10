package chap08.inherit;

public class InterfaceInheritExample {
    public static void main(String[] args) {
        InterfaceC interfaceC = new ImplementsC();
        interfaceC.methodA();
        interfaceC.methodB();
        interfaceC.methodC();
    }
}
