package chap07.overloading;

public class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    // 메서드 재정의 (Override)
    @Override
    double calculateSalary() {
        return salary;
    }
}
