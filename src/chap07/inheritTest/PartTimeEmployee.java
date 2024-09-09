package chap07.inheritTest;

public class PartTimeEmployee extends Employee{
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee (String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // 메서드 재정의 (Override)
    double calculateSalary() {
        return hourlyRate * hoursWorked * 20;
    }

}
