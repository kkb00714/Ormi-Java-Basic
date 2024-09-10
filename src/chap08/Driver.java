package chap08;

public class Driver {
    void drive(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            System.out.println("This is Bus.");
        } else if (vehicle instanceof Taxi) {
            System.out.println("This is Taxi.");
        }
        vehicle.run();

        // switch-case문 - 위의 코드와 동일하게 작동
        switch (vehicle) {
            case Bus bus -> System.out.println("Bus");
            case Taxi taxi -> System.out.println("Taxi");
            default -> System.out.println("");
        }
    }
}
