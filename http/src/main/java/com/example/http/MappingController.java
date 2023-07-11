package com.example.http;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Slf4j
@Controller

public class MappingController {
 //   private static final  Logger logger
       //     = LoggerFactory.getLogger(MappingController.class);
 @RequestMapping(
         value = "/path",
         method = RequestMethod.GET
 )
public String getPath(){
 log.info("GET/path");
  return "index";
      }

 @RequestMapping(
         value = "/path",
         method = RequestMethod.POST
 )
 public String postPath(){
  log.info("POST/path");
  return "index";
 }
@RequestMapping(
        value = "/path",
        method ={ RequestMethod.PUT, RequestMethod.DELETE}
)
public String putOrDeletePath(){
  log.info("Put or Delete/path");
  return "index";
}
@RequestMapping(
        value = "/path",
        method = RequestMethod.POST,
        consumes = MediaType.APPLICATION_JSON_VALUE
)
public String consumes(){
     log.info("POST/path Content-Type : application/json");
     return "index";
}
@RequestMapping(
        value = "/path",
        method = RequestMethod.POST,
        headers = "x-likelion=hello"
)
public String headerWith(){
     log.info("POST/path with x-likelion=hello");
     return "index";
}
@RequestMapping(
        value = "/path",
        method = RequestMethod.POST,
        params = "likelion=hello"
)
    public String params(){
     log.info("POST/path with parameter likelion");
     return "index";
}


  }
