package chap07;

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("파워 에이드",123456, 1);
        System.out.println(student.name);
        System.out.println(student.ssn);
        System.out.println(student.studentNo);
    }
}
