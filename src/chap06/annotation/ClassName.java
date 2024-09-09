package chap06.annotation;

@AnnotationName(elementNameone = "값", elementNameTwo = 3)
public class ClassName {

    @AnnotationName(elementNameone = "Hello")
    int field;

    @AnnotationName(elementNameone = "World")
    void medthod() {

    }
}
