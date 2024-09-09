package chap07.overloading;

public class Laborer {
    public static void main(String[] args) {
        Employee alice = new FullTimeEmployee(
                "Alice", 4000);
        Employee bob = new PartTimeEmployee(
                "Bob", 1000, 4);

        System.out.println(alice.name + "'s " + "Salary: " + alice.calculateSalary());
        System.out.println(bob.name + "'s " + "Salary: " + bob.calculateSalary());
    }
}
