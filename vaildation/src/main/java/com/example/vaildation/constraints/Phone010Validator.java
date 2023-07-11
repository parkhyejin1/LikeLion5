package com.example.vaildation.constraints;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class Phone010Validator
        implements ConstraintValidator<Phone010,String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean withDash =value.startsWith("010-");
        boolean withPar =value.startsWith("(010)");
        return withPar||withPar;
    }
}