package chap07.overloading;

public abstract class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return this.name;
    }

    abstract double calculateSalary();

}
