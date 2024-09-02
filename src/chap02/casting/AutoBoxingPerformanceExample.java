package chap02.casting;

public class AutoBoxingPerformanceExample {
    public static void main(String[] args) {
        // 성능 측정 (오토박싱 VS 오토박싱x)
        long currentTimeMillis = System.currentTimeMillis();

        Integer sum = 0;
        for (int i = 0; i < 10000000; i++) {
            sum = sum + i;
        }

        System.out.println("오토박싱 실행 시간: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");

        long currentTimeMillis2 = System.currentTimeMillis();

        int sum2 = 0;
        for (int i = 0; i < 10000000; i++) {
            sum2 = sum2 + i;
        }

        System.out.println("Primitive 실행 시간: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");



    }
}
