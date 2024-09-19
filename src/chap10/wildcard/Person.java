package chap10.wildcard;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {      // Object라는 부모클래스에서 물려받은 toString 메서드
        return name;
    }
}
