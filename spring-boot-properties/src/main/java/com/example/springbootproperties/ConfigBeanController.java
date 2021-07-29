package com.example.springbootproperties;

import com.example.springbootproperties.model.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigBeanController {

    @Autowired
    ConfigBean configBean;

    @RequestMapping("/my")
    public String index(){
        return configBean.getName()+"，"+configBean.getAge();
    }
}
