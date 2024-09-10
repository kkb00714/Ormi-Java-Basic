package chap08.test;

public class Parrot implements Flyable, Talkable{
    @Override
    public void talk() {
        System.out.println("나는 Parrot, 할 수 있어. 말");
    }

    @Override
    public void fly() {
        System.out.println("나는 Parrot, 난다.");
    }
}
