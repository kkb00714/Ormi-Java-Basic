package chap09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowException {
    public static void main(String[] args) {
        ThrowException f1 = new ThrowException();
        try {
            f1.readFile();
        } catch (IOException e) {
            System.out.println("호출 측에서 예외 발생 시 예외 처리");
        }
    }

    public void readFile() throws IOException {
        // 예외를 catch 하지 않고 throw만 한 것.
        // 이렇게 되면 메서드를 호출한 측에게 처리를 넘김.
        BufferedReader reader = new BufferedReader(new FileReader(""));
        System.out.println(reader.readLine());
        reader.close();
    }
}
