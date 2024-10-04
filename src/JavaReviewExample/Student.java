package JavaReviewExample;

import java.util.ArrayList;


public class Student {
    int id;
    String name;
    ArrayList<Subject> subjectList;

    public Student (int id, String name) {
        this.id = id;
        this.name = name;
        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setSubjectName(name);
        subject.setScore(score);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        int subjectCount = subjectList.size();  // 과목 수
        for (Subject s : subjectList) {
            total += s.getScore();
            System.out.println(name + "의 " + s.getSubjectName()+ " 과목 성적은 " + s.getScore() + "입니다.");
        }

        if (subjectCount > 0) {
            System.out.println(name + "의 평균은 "+ (total / subjectCount) + " 입니다.");
        } else {
            System.out.println(name + "의 평균을 계산할 수 없습니다. (과목이 없음)");
        }
    }
}
