package chap08.test;

public class Fish extends Creature{
    public Fish(String name, String species) {
        super(name, species);
    }

    @Override
    public void live() {
        System.out.println("해양동물");
    }
}
