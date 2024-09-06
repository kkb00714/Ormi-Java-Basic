package chap06.car.example;

import chap06.car.Car;

public class SportsCar extends Car {
    public static void main(String[] args) {
        // Car에서 company 클래스가 protected 이므로
        // 상속받은 SportsCar에서는 접근이 가능
        SportsCar car1 = new SportsCar();
        System.out.println(car1.company);
        car1.company = "모루카";
        System.out.println(car1.company);
        
//        car1.model = ""; // private 이므로 접근 불가
    }

}
