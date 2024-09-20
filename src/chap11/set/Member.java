package chap11.set;

public class Member {
    String name;
    int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // hashCode 메서드 재정의
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    // 인스턴스가 달라도 이름, 나이가 동일하면 동일한 객체로 간주하는 코드
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {    // 객체 타입 확인
            Member member = (Member) obj;
            return member.name.equals(this.name) && member.age == this.age;
        } else {
            return super.equals(obj);
        }
    }
}