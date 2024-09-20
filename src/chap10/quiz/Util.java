package chap10.quiz;

public class Util {
    // 제네릭 메서드 작성  Util.getValie(pair, "홍길동");
    // Pair<K, V>, K
    // (접근 제한) <타입 파라미터> 리턴타입 메소드명(매개변수...)

    // 타입 파라미터 => 메서드 시그니쳐에서 사용될 타입들을 나열한 것..
    //
    public static <T extends Pair<K, V>, K, V> V getValue(T pair, K key) {
        if (pair.getKey() == key) {
            return pair.getValue();
        } else {
            return null;
        }
    }
}
