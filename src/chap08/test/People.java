package chap08.test;

public class People implements Talkable, Swimmable{
    @Override
    public void swim() {
        System.out.println("나는 수영할 줄 아는 인간");
    }

    @Override
    public void talk() {
        System.out.println("나는 똑바로 말할 줄 아는 똑똑한 인간. 라임미쳤다 ㄷㄷ");
    }
}

