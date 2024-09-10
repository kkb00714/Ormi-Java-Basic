package chap08.test;

public abstract class Animal extends Creature {
    // 모든 객체는 클래스의 생성자를 호출해야 하므로..
    public Animal(String name, String species) {
        super(name, species);
    }

    @Override
    public void live() {
        System.out.println("육지동물");
    }
}
