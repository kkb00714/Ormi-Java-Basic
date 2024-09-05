package chap05;

public class OutterClass {
    public static void main(String[] args) {
        // ClassInstanceVariable의 클래스 변수 접근 - ClassInstanceVariable.index
        System.out.println(ClassInstanceVariable.index);

        // " 의 인스턴스 변수 접근 - 객체 선언 후 접근
//        System.out.println(ClassInstanceVariable.index2); // 에러
        // => 객체(변수)로 선언해서 접근해야 하기 때문
        ClassInstanceVariable object = new ClassInstanceVariable();
        System.out.println(object.index2);
        // stack 영역에 object라는 변수명으로 선언되어 있고, heap 메모리의 값을 가리킴
    }
}
