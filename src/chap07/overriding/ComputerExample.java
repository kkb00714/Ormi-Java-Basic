package chap07.overriding;

public class ComputerExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println("★ Computer areCircle: " + computer.areaCircle(3.4)); // 정밀도가 높음

        Calculator calculator = new Calculator();
        System.out.println("☆ Caculator areCircle: " + calculator.areaCircle(3.4)); // 정밀도가 낮음
    }
}
