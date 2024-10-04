package JavaReviewExample;

public class ReviewProject2_TestExample2 {
    public static void main(String[] args) {
        Student s1 = new Student(112, "Police");
        s1.addSubject("영어", 95);
        s1.addSubject("수학", 100);
        s1.addSubject("국어", 87);
        
        Student s2 = new Student(119, "FireFighter");
        s2.addSubject("체육", 100);
        s2.addSubject("과학", 92);
        s2.addSubject("윤리와 사상", 87);

        s1.showStudentInfo();
        System.out.println("===============================");
        s2.showStudentInfo();

    }
}
