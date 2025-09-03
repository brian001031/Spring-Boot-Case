package com.suntask.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*啟動類*/
@SpringBootApplication
public class CloneStreamApplication {

    public static void main(String[] args) {

        SpringApplication.run(CloneStreamApplication.class, args);
    }

}
