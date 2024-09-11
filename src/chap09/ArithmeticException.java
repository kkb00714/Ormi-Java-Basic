package chap09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArithmeticException {
    public static void main(String[] args) throws IOException {
//        int b = Integer.parseInt(args[0]);
//        int result = 10 / 0;    // Arithmetic Exception

        // (존재하는) 파일에 데이터를 읽어오는 코드
        // => 예외 상황을 가정해서 예외 처리를 하라고 함. (강제화)
        try {
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            reader.readLine();
            reader.close();
        } catch (FileNotFoundException e) {
            // FileNotFoundException이 발생했을 때 예외 처리 코드

        } catch (IOException e) {
            // IOException이 발생했을 때 처리 코드
        }
    }
}
