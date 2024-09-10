package chap08.defaultmethod;

public interface Predator {
    String getFood();

    default void  printFood() {
        System.out.printf("MY food is %s\n",getFood());
    }
}
