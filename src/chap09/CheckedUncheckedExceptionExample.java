package chap09;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedUncheckedExceptionExample {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        String file = System.getProperty("user.dir");
        String filename = file + "/file1.txt";     // 없는 파일

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            // try with resource 문. => I/O 자원을 자동으로 닫아줌.

            int result = 0 / a;
            System.out.println(result); // 0
            System.out.println(1); // 1

//            BufferedReader reader = new BufferedReader(new FileReader(filename));
            System.out.println(2);
            System.out.println(reader.readLine());
//            reader.close();     // 파일 IO 관련은 꼭 닫아줘야 하기 때문에 이 구문을 finally에 넣으면 좋다.ㅓ

        } catch (FileNotFoundException | java.lang.ArithmeticException e) {
            System.out.println("Exception 발생");
            System.out.println(3); // 3
        } catch (IOException e) {
            System.out.println("IOException 발생");
            System.out.println(4);
        } finally {
            System.out.println("그럼 20000");
            System.out.println(5); // 5
        }
    }
}
