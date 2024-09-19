package chap10.wildcard;

public class Course <T>{
    private String name;
    private T[] students;

    public String getName() {
        return name;
    }

    public void add(T t) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = t;
                break;
            }
        }
    }
}
