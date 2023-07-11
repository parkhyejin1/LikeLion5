package com.example.vaildation.constraints;


    import com.example.vaildation.constraints.annotations.BlackList;
    import com.example.vaildation.constraints.annotations.BlackList;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.HashSet;
import java.util.Set;

    public class BlackListValidator
            implements ConstraintValidator<BlackList, String> {
        private Set<String> blacklist;

        @Override
        public void initialize(BlackList constraintAnnotation) {
            blacklist = new HashSet<>();
            for (String target: constraintAnnotation.blacklist()) {
                blacklist.add(target);
            }
        }

        @Override
        public boolean isValid(String value, ConstraintValidatorContext context) {
            // this.blacklist 안에 value 가 있으면 실패
            return !this.blacklist.contains(value);
        }
    }

