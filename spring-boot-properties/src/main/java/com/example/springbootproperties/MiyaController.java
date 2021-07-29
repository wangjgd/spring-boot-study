package com.example.springbootproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiyaController {

    private @Value("${my.name}") String name;

    private @Value("${my.age}") int age;

    @RequestMapping("/miya")
    public String index(){
        return name+","+age;
    }
}
