package JavaReviewExample;

import java.util.ArrayList;


public class Student {
    int id;
    String name;
    ArrayList<String> subjectList;

    public Student (int id, String name) {
        this.id = id;
        this.name = name;
        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int score) {

    }
}
