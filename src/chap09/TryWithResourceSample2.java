package chap09;

public class TryWithResourceSample2 {
    public static void main(String[] args) {
        try (FileStream fileStream = new FileStream("file1.txt")) {
            fileStream.read();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("완료");
        }
    }
}