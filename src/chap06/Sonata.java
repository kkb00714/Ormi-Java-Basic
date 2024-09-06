package chap06;

public class Sonata {
    private int speed;
    private boolean stop;

    void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }

    public static void main(String[] args) {
        Sonata sonata = new Sonata();

        // 잘못된 속도 변경
        sonata.setSpeed(-50);
        System.out.println("현재 속도: " + sonata.getSpeed());

        // 올바른 속도 변경
        sonata.setSpeed(60);
        System.out.println("변경 후 속도: " + sonata.getSpeed());

        // 멈춤
        if (!sonata.isStop()) {
            sonata.setStop(true);
//            sonata.setSpeed(0);
        }

        System.out.println("멈춤 후 속도: " + sonata.getSpeed());
    }
}