package utilities.tool;

/**
 * Created by zoetx on 2017/1/22.
 */
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ java.lang.annotation.ElementType.TYPE })
@Documented
public @interface DataObjectDescriptor {
    public abstract String value();
}