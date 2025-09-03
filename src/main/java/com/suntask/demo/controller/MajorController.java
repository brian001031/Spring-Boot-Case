package com.suntask.demo.controller;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.web.bind.annotation.*;

import javax.management.Query;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MajorController {
    public  String  detial = "{call by Controller!}";

    @GetMapping("/welcome")
    public String ShowHandle_toString() {
        System.out.println(">>>>> Entering /welcome endpoint");
        return "First Show MajorController ->`"+detial;
    }

    @GetMapping("/main")
    public String index() {
        return "Hello from /main/";
    }


}
