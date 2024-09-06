package chap06;

public class Earth {
    // 클래스 변수들이기 때문에 다른 클래스에서도 호출이 가능
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;

    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }

}
