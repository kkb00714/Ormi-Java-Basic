package chap06.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})
//
public @interface AnnotationName {
    String elementNameone();
    // default 값이 없기 때문에 반드시 값을 기술해야 함

    int elementNameTwo() default 5;
    // default값을 설정해놨기 때문에 값을 정의하지 않아도 5로 지정됨

}
