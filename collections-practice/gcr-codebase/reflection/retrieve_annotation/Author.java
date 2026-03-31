package reflection.retrieve_annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)   // needed for runtime access
@Target(ElementType.TYPE)              // Can be applied to class
public @interface Author {
    String name();
}
