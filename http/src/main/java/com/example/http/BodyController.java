package com.example.http;

import com.example.http.dto.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BodyController {
    // `/body`로 요청이 들어왔을 때,
    // ResponseDto 데이터를 표현한 JSON 응답을 반환하는 메소드
    @PostMapping("/body")
    // HTTP 응답의 Body임을 나타내는 어노테이션
    public ResponseDto body(
            @RequestBody ArticleDto dto
    ) {
        log.info("POST/body"+ dto.toString());
        ResponseDto response = new ResponseDto();
        response.setStatus(200);
        response.setMessage("success");
        return response;
    }

    @PostMapping("/body-2")
    @ResponseBody
    public ResponseDto body2(
            @RequestBody
            WriterDto dto
    ){
        log.info("POST/body-2"+ dto.toString());
        ResponseDto response = new ResponseDto();
        response.setStatus(200);
        response.setMessage("success");
        return response;
    }
@PostMapping("/body-3")
    @ResponseBody
    public ResponseDto body3(
            @RequestBody
            ArticleWithCommentsDto dto
){
        log.info("POST/body-3"+ dto.toString());
        return  new ResponseDto();
}
//json spring으로 표기 
@PostMapping("/body-4")
    @ResponseBody
    public ResponseDto body4(
            @RequestBody
            ArticleComplexDto dto
){
        log.info("POST/body-4"+dto.toString());
        return new ResponseDto();
}
    @PostMapping("/entity")
    public ResponseDto entity(
            @RequestBody
            ArticleDto dto
    ) {
        log.info("POST /body " + dto.toString());
        ResponseDto response = new ResponseDto();
        response.setMessage("success");
        response.setStatus(200);
        return response;
    }

}
