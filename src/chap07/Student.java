package chap07;

public class Student extends Person {
    int studentNo;

    Student(String name, int ssn, int studentNo) {
        super(name, ssn);
        // 부모 클래스 생성자의 호출은 항상 자식 클래스 생성자의 맨 위로 올려야 오류가 안 남
        this.studentNo = studentNo;

        // super(name, ssn) 을 없애면 기본 생성자를 호출하기 떄문에 >> super();
        // 저 코드를 없애면 에러가 남.
    }

}
    // 생성자가 매칭이 안 되는데, parameter가 부족하기 때문
    // => 디폴트 생성자에서 부모의 생성자를 호출하는데,
    // 이미 개발자가 생성자를 선언해놨기 때문에 자동적으로 default Construtor가 없기 때문.

    // 그래서 Person(매개변수1, 매개변수2) 가 호출됨.
    // => 아무런 파라미터를 입력하지 않아서 오류가 발생
