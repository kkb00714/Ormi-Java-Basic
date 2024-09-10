package chap08.polymorphism;

public class ProfileMemoryRepository implements ProfileRepository{
    @Override
    public void save() {
        System.out.println("프로필을 ProfileMemoryRepository에 저장");
    }
}
