package training.adnotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.TYPE,
        ElementType.METHOD,
        ElementType.FIELD,
        ElementType.CONSTRUCTOR
})

@Documented
public @interface Information {
    String author() default "Programmer";
    String date();
    String description();
}
