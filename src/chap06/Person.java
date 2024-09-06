package chap06;

public class Person {
    // final 에서 초기값을 삭제하면 에러가 남
    final String nation;
    String name;

    Person(String name) {
        nation = "Korea"; // 이렇게 생성자 안에서 초기화 해주는 것은 ok
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS);
        System.out.println("지구의 표면적 : " + Earth.EARTH_SURFACE_AREA + "km^2");
    }

    
    
}
