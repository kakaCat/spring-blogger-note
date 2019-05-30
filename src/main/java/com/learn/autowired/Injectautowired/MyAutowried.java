package com.learn.autowired.Injectautowired;

import java.lang.annotation.*;

/**
 * Created by JAVA on 2019/4/27.
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAutowried {
    String value() default "";
}
