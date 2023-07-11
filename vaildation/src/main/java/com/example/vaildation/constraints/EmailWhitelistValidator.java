package com.example.vaildation.constraints;

import com.example.vaildation.constraints.annotations.EmailWhitelist;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.HashSet;
import java.util.Set;

public class EmailWhitelistValidator //사용자 지정 유효성검사를 위해 구현해야하는 인터페이스
        implements ConstraintValidator<EmailWhitelist, String> {

    private final Set<String> whitelist;

    public EmailWhitelistValidator(){
        this.whitelist=new HashSet<>();
        this.whitelist.add("gmail.com");
        this.whitelist.add("naver.com");
    }

@Override
    public boolean isValid(String value, ConstraintValidatorContext context){
    //유효한 값일때 true반환 / 유효하지 않은 값일때 false반환

    String[] split = value.split("@");
    String domain = split[split.length - 1];
    // Set whiteList에 domain이 추가되어 있는지
    return whitelist.contains(domain);

}

}
