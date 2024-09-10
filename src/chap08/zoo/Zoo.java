package chap08.zoo;

public class Zoo {
    public static void main(String[] args) {
        Zookeeper me = new Zookeeper();

        Lion lion = new Lion();
        me.feed(lion);

        Tiger tiger = new Tiger();
        me.feed(tiger);
    }
}
