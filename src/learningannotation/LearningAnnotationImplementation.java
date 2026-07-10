package learningannotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Documented
@Target(ElementType.TYPE)
@Inherited
//@Repeatable(MyAnno.class)
@interface MyAnno {
    String name();

    String project() default "Learning Annotation";

    String date() default "2026-07-11";

    String version() default "1.0";
}

@MyAnno(name = "Abdul Bari")
public class LearningAnnotationImplementation {
    int data;

    static void main(String[] args) {
        int x;
        System.out.println();
    }
}

