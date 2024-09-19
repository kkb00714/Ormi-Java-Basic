package chap10.wildcard;

import java.util.Arrays;

public class CourseTypeExample {
    public static void registerPerson(Course<?> t) { // 모든 과정
        // 전체 타입이 들어올 수 있음
        System.out.println(t.getName() + " : " + Arrays.toString(t.getStudents()));
    }

    public static void registerPerson2(Course<? extends Student> t) { // 학생 과정
        // Student 타입의 상한선 지정
        System.out.println(t.getName() + " : " + Arrays.toString(t.getStudents()));
    }

    public static void registerPerson3(Course<? super Worker> t) { // 직장인과 일반 과정
        // Worker 타입의 하한선 지정
        System.out.println(t.getName() + " : " + Arrays.toString(t.getStudents()));
    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반 과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));
        personCourse.add(new Worker("직장인"));

        ////////////////////////////////////////////

        Course<Worker> workerCourse = new Course<>("직장인 과정", 4);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<>("학생 과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<>("고등학생 과정", 5);
        highStudentCourse.add(new HighStudent("고등학생"));

        ////////////////////////////////////////////

        registerPerson(workerCourse);
        registerPerson(personCourse);
        registerPerson(highStudentCourse);
        registerPerson(studentCourse);
        System.out.println("===========");

        registerPerson2(studentCourse);
        registerPerson2(highStudentCourse);
//        registerPerson2(workerCourse);    // 에러
//        registerPerson2(personCourse);    // 에러
        System.out.println("===========");

        registerPerson3(workerCourse);
        registerPerson3(personCourse);
//        registerPerson3(studentCourse);   // 에러
//        registerPerson3(highStudentCourse);   // 에러
        

    }
}
