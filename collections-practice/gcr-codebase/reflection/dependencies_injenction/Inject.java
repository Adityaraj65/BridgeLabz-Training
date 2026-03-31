package reflection.dependencies_injenction;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)   // Needed at runtime
@Target(ElementType.FIELD)             // Can be used on fields
public @interface Inject {
}
