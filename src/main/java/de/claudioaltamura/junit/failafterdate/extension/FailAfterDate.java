package de.claudioaltamura.junit.failafterdate.extension;

import org.apiguardian.api.API;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.*;

@Target(value={ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(FailAfterDateCondition.class)
@Documented
@API(status = API.Status.EXPERIMENTAL)
public @interface FailAfterDate {
    String from() default "";
    String reason() default "";
}
