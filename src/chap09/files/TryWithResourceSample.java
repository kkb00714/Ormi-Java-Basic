package chap09.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceSample {
    public static void main(String[] args) {
        // file 읽어오는 로직
        String filename = "file1.txt";
        // autoClosable
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            reader.readLine();
        } catch (IOException e) {
            System.out.println("IOE 발생");
        }
    }
}
