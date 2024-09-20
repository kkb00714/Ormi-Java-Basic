package chap11.set;

import chap10.wildcard.Person;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        // 값 추가
        Set<String> hashSet = new HashSet<>();
        hashSet.add("짱구");
        hashSet.add("훈이");
        hashSet.add("유리");
        hashSet.add("맹구");
        hashSet.add("철수");
        hashSet.add("흰둥이");

        // 값 검색 (개수, 각 요소)
        System.out.println("총 개수 : " + hashSet.size());

        for (String str : hashSet) {
            System.out.println('\t' + "값 : " + str);
        }

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println('\t' + element);
            iterator.remove(); // 요소 삭제
        }


        // 값 삭제
//        hashSet.remove("훈이");
//        for (String str : hashSet) {
//            System.out.println('\t' + "값 : " + str);
//        }

//        hashSet.clear();      // 모든 요소 삭제
        if (hashSet.isEmpty()) {
            System.out.println("비어있음 " + hashSet);
        }

        Person person1 = new Person("1");
        Person person2 = new Person("1");
        // 같은 값이어도 인스턴스가 다르기 때문에 중복 처리가 안 됨.

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println("짱구".hashCode());
        System.out.println("짱구".hashCode());
        // => 두 객체의 해시코드가 다르기 때문에 중복으로 판단되지 않음

        Member member = new Member("Leon",28);
        Member member2 = new Member("Leon", 28);
        Member member3 = new Member("Leon", 21);
        Set<Member> memberSet = new HashSet<>();

        memberSet.add(member);
        memberSet.add(member2);
        memberSet.add(member3);
        System.out.println(memberSet.size()); // 2
    }
}
