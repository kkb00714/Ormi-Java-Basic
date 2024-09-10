package chap08;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Vehicle vehicle = new Bus();
        driver.drive(vehicle);

        Vehicle vehicle2 = new Taxi();
        driver.drive(vehicle2);
    }
}
