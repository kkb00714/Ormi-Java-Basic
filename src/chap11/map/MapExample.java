package chap11.map;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        // Map 객체 선언, key value 값 추가
        Map<String, Integer> map = new HashMap<>();
        map.put("김레오", 25);
        map.put("김철수", 77);
        map.put("김영희", 1);
        map.put("김레오", 1); // key값 중복으로 인해 추가되지 않음.

        System.out.println(map.size());
        System.out.println("=====================");
        // 각 key, value 순회하면서 출력 => ( 1.keySet() 2. entrySet() )
//        map.get("김레오");    // 기본적인 방법

        // 1. keySet() 방법 => key-value 묶음으로 가져옴
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }
        System.out.println("=====================");

        // 2. entrySet() 방법 => 객체를 하나씩 순차적으로 처리
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println(entrySet);

        // Iterator를 사용하면 컬렉션을 순차적으로 탐색.
        // iterator.hasNexy()는 iterator가 처리할 다음 요소가 있을 때까지 반복
        Iterator<Map.Entry<String, Integer>> iterator =  entrySet.iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(map.get("key"));     // key가 존재하지 않는다면 null 반환
        System.out.println(map.getOrDefault("key", 0));
        // 값("key")이 존재하지 않으면, 기본값 0으로 반환함.


        // 삭제
    }
}
