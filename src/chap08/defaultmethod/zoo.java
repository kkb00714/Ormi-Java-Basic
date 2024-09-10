package chap08.defaultmethod;

public class zoo {
    public static void main(String[] args) {
        Zookeeper me = new Zookeeper();

        Lion lion = new Lion();
        // Preadator lion = new Lion(); 으로도 선언 가능 (호랑이도 마찬가지)
        me.feed(lion);

        Tiger tiger = new Tiger();
        me.feed(tiger);
    }
}
