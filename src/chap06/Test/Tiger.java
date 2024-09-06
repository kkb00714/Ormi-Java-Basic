package chap06.Test;

public class Tiger extends Animal{
    public static void main(String[] args) {
        Tiger Leo = new Tiger();
        Leo.setName("레오");
        Leo.setWithGravity(37);
        Leo.setNap(true);
        Leo.introduce();

        System.out.println();
        
        Tiger Horang = new Tiger();
        Horang.setName("홀앵이");
        System.out.println("안냥? 나는 " + Horang.getName() + ". 많관잘부~");
        Horang.setWithGravity(70);
        System.out.println("내 무게는 " + Horang.getWithGravity() + "N !!");
        Horang.setNap(false);
        System.out.println(Horang.getNap());
    }
}
