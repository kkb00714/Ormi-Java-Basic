package chap10.wildcard;

import chap04.Array;

public class Course <T>{
    private String name;
    private T[] students;

    public Course(String name, int capacity) {
        this.name = name;
        this.students = (T[]) new Object[capacity]; // 배열의 초기화
        // new T[] 로는 생성자를 만들 수 없기 때문에 Object로 선언.
        // 선언될 타입에 대한 캐스팅을 해줘야 하기 때문에 (T[]) 를 앞에 붙여줘야 함.
    }

    public String getName() {
        return name;
    }

    public T[] getStudents() {
        return students;
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
