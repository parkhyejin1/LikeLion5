package com.example.vaildation.dto;

import com.example.vaildation.constraints.Phone010;
import com.example.vaildation.constraints.annotations.BlackList;
import com.example.vaildation.constraints.annotations.EmailWhitelist;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {
    private Long id;

@NotBlank//비어있지 않다
@Size(min=8, message = "최소 8글이여야합니다")
@BlackList(blacklist = {"dfkjsdflksfkldflks;"})
    private String username;
@Email//형식이 이메일
//이메일이 지정된 도매인이도록 검증하는 어노테이션
@EmailWhitelist
    private String email;
@NotNull//null이 아니다
@Phone010 //010으로 시작하는 형식
    private String phone;

@NotNull
@Min( value=14 ,
        message ="14세 미만은 부모님의 동의가 필요합니다.") // 최솟값
    private Integer age;
@Future(message = "미래의 시간까지 유효해야합니다.") // 미래의 시간만
private LocalDate validUntil;

@NotNull //NotnullString 이 null이 아닌지만 검증
    private String NotnullString;
@NotEmpty //NotEmptyString 이 길이가 0이 아닌지 검증
    private String NotEmptyString;
@NotBlank //NotBlankString이 공백 문자로만 이루어지지 않았는지 검증
    private String NotBlankString;
}
