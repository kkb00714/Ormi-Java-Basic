package chap10.wildcard;

public class CourseTypeExample {
    public static void registerPerson(Course<?> t) {
        // 전체 타입이 들어올 수 있음

    }

    public static void registerPerson2(Course<? extends Student> t) {
        // Student 타입의 상한선 지정

    }

    public static void registerPerson3(Course<? super Worker> t) {
        // Worker 타입의 하한선 지정
    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>();
        personCourse.add(new Person("일반인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));
        personCourse.add(new Worker("직장인"));


        Course<Worker> workerCourse = new Course<>();
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<>();
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<>();
        highStudentCourse.add(new HighStudent("고등학생"));

        registerPerson2(studentCourse);
        registerPerson2(highStudentCourse);
//        registerPerson2(workerCourse);    // 에러
//        registerPerson2(personCourse);    // 에러
        
        registerPerson3(workerCourse);
        registerPerson3(personCourse);
//        registerPerson3(studentCourse);   // 에러
//        registerPerson3(highStudentCourse);   // 에러
        

    }
}
