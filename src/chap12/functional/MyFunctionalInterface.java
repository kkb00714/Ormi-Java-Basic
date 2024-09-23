package chap12.functional;

@FunctionalInterface
public interface MyFunctionalInterface {
    void run();
//    int method();     
// 컴파일 에러 (함수형 인터페이스의 경우 추상 메서드는 하나만 가능하기 때문)
}
