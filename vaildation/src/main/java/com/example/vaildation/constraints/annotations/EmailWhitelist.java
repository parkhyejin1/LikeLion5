package com.example.vaildation.constraints.annotations;

import com.example.vaildation.constraints.EmailWhitelistValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)//어노테이션을 어디에 적용할것인지(선택)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailWhitelistValidator.class)
public @interface EmailWhitelist {

    String message()default  "email not in whitelist";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload()default {};
}
