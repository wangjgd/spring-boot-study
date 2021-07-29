package com.example.springbootrestful.controller;

import com.example.springbootrestful.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot")
public class HelloController {

    @Autowired
    User user;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String index(@PathVariable("name") String name){
        System.out.println("userName:" + user.getName()+",age:"+user.getAge()+",remark:"+user.getRemark());
        System.out.println("address:" + user.getAddress());

        return "Hello " + name;
    }
}
