package chap06.Test;

public class Animal {
    protected String name = "";
    protected double weight;
    boolean nap;

    // default Constructor 생성
    Animal() {

    }

    private Animal(String name, double weight, boolean nap) {
        this.name = name;
        this.weight = weight;
        this.nap = nap;
    }

    // 이름을 매개변수로 받는 Setter
    public void setName(String name) {
        this.name = name;
    }

    // 이름을 가져오는 Getter
    public String getName() {
        return this.name;
    }

    // 몸무게를 무게로 변환하는 setter
    public void setWithGravity(double kg) {
        this.weight = kg * 9.8;
    }

    // 무게로 변환된 값을 반환하는 getter
    public double getWithGravity() {
        return this.weight;
    }

    protected void setNap(boolean nap) {
        this.nap = nap;
    }
    
    protected String getNap() {
        if (nap) {
            return "잘까말까잘까말까잘까말까잘까말까";
        } else {
            return (name + " (은)는 (이미 기절했습니다.)");
        }
    }

    // 객체를 소개하는 메서드
    protected void introduce () {
        System.out.println("I am " + name + "애오.");
        System.out.println("제 무게는 " + weight + " N(뉴턴)" + " 이애오.");
        if (nap) {
            System.out.println(name + "(은)는 잘거야. 쿨...zzz");
        } else {
            System.out.println(name + "(은)는 아직 더 놀거야. 끼얏호우!");
        }
    }

    public static void main(String[] args) {
        Animal rabbit = new Animal("뚱끼", 7.0, true);
        rabbit.introduce();

        Animal pig = new Animal("피글린", 35, false);
        pig.introduce();
    }
}
