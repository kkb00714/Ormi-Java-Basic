package chap10.Inherit;

// 제네릭 클래스 상속 Test
public class InheritgenericExample {
    public static void main(String[] args) {
        // <> 안에는 타입을 넣어주어야 함. (개발자가 정의한 클래스도 타입이 될 수 있다.)
        ChildProduct<Tv, Integer, String> childProduct =
                new ChildProduct(new Tv(), 1234-5678, "Samsung");

        System.out.println(childProduct.getCompany());
    }
}
