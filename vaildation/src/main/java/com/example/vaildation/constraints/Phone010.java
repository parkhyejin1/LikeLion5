package com.example.vaildation.constraints;

import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone010 {

    String message()default  "email not in whitelist";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload()default {};
}
