package chap10.implement;

import java.util.ArrayList;

public class ImplementExample {
    public static void main(String[] args) {
        StorageImpl<String> storage = new StorageImpl<>(10);
        storage.add("첫번째", 0);
        storage.add("두번째", 1);
        storage.add("세번째", 2);

        String result = storage.get(1);
        System.out.println(result);

        ArrayList<String> storageList = new ArrayList<>();
        storageList.add(0, "0번 인덱스");
        storageList.add(1, "1번 인덱스");
        storageList.add(2, "2번 인덱스");
        System.out.println(storageList);

    }
}
