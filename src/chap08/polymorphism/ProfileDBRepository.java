package chap08.polymorphism;

public class ProfileDBRepository implements ProfileRepository{
    @Override
    public void save() {
        System.out.println("프로필을 ProfileDBRepository에 저장");
    }
}
