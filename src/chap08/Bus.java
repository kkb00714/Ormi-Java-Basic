package chap08;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("버스가 달려갑니다.");
    }
}
