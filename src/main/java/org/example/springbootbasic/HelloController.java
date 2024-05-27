package org.example.springbootbasic;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        log.info("HelloController.index() called");
        return "Greetings from Spring Boot!";
    }

}
