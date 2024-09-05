package chap05;

import java.util.ArrayList;

public class StringBuilderBufferExample {
    public static void main(String[] args) {
        String result = "";
        result += "Hello ";
        result += "Java ";
        result += "World";
        System.out.println(result);

        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello ");
        buffer.append("Java ");
        buffer.append("World!");
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder();
        builder.append("Hello ");
        builder.append("Java ");
        builder.append("World!");
        System.out.println(builder);

        // insert(), substring()
        // insert가 가능한 범위는 그 길이(length)만큼만 가능하다.
        System.out.println(builder.insert(0, "첫번째"));
        System.out.println(builder.insert(builder.length(), "마지막"));

        System.out.println(buffer.substring(6));
        System.out.println(buffer.substring(1, 8));

    }
}
