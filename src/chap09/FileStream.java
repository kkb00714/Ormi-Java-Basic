package chap09;

public class FileStream implements AutoCloseable{
    private String fileName;

    FileStream(String filename) {
        this.fileName = filename;
    }

    void read() throws Exception {
        System.out.println("FileStream.read() 호출 실패");
         throw new Exception("예외 발생 상황 가정");
    }

    @Override
    public void close() throws Exception {
        System.out.println("close() 메서드 호출");
    }
}
