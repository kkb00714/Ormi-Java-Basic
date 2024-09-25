package codingtest;

import java.util.function.Function;

public class LambdaExample_6 {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("저팔계", 95, 93)
    };


    /*  avg() 메소드 작성
     */
    public static double avg(Function<Student, Integer> function) {
        // 1. 점수 더하기 2. 평균 구하기
        int score = 0;
        for (Student student : students) {
            score +=  function.apply(student);
        }
        return ((double) score / students.length);
    };

    public static void main(String[] args) {
        double englishAvg = avg( s -> s.getEnglishScore() );
        System.out.println("영어 평균 점수: " + englishAvg);

        double mathAvg = avg( s -> s.getMathScore() );
        System.out.println("수학 평균 점수: " + mathAvg);
    }

    public static class Student {
        private String name;
        private int englishScore;
        private int mathScore;

        public Student(String name, int englishScore, int mathScore) {
            this.name = name;
            this.englishScore = englishScore;
            this.mathScore = mathScore;
        }

        public String getName() {
            return name;
        }

        public int getEnglishScore() {
            return englishScore;
        }

        public int getMathScore() {
            return mathScore;
        }
    }
}