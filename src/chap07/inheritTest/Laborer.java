package chap07.inheritTest;

public class Laborer {
    public static void main(String[] args) {
        FullTimeEmployee alice = new FullTimeEmployee(
                "Alice", 4000);
        PartTimeEmployee bob = new PartTimeEmployee(
                "Bob", 1000, 4);

        System.out.println(alice.name + "'s " + "Salary: " + alice.calculateSalary());
        System.out.println(bob.name + "'s " + "Salary: " + bob.calculateSalary());
    }
}
