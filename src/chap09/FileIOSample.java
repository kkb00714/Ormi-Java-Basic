package chap09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOSample {
    public static void main(String[] args) {
        // ArithmaticException 발생 시 예외 처리하기
        try {
            int a = 0;
            int result = 5 / a;
        } catch (java.lang.ArithmeticException e) {
            System.out.println("ArithmaticException 발생");
        } finally {
            System.out.println("0으로 나눌 수는 없습니다.");
        }

        // 파일 내용 읽어오는 코드
        try {
            // 직접 경로를 입력하는 경우. filename을 file1.txt 대신 입력하면 된다.
//            String file = System.getProperty("user.dir");
//            String filename = file + "/file1.txt";
            BufferedReader reader = new BufferedReader(new FileReader("file1.txt"));
            System.out.println(reader.readLine());
            reader.close();  // 파일 입출력 관련된 객체를 생성했을 땐, 마지막에 자원을 꼭 닫아줘야 함.
        } catch (FileNotFoundException | java.lang.ArithmeticException e) {
            System.out.println("IOException 발생");
        } catch (IOException e) {
            System.out.println("상위 예외 클래스가 처리했으니 걱정말라구");
        } finally {
            System.out.println("그럼 20000 ");
        }


    }
}
