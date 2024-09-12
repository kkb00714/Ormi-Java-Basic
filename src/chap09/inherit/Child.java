package chap09.inherit;

import java.io.FileNotFoundException;

public class Child extends Parent{
    // 자식 클래스에서 어떤 Exception까지 커버가 될까?
//    @Override
//    void method() throws FileNotFoundException{
//        // void main() throws IOException // 오류 => 부모 클래스에 정의된 예외보다 상의 예외를 사용했기 때문
//        throw new FileNotFoundException();
//    }

    @Override
    void method() throws NumberFormatException {
        System.out.println("NumberFormatException 입니다.");
    }

    @Override
    void method2() throws NumberFormatException {
        System.out.println("NumberFormatException 입니다.");
    }

}
