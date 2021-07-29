package com.example.springbootmybatisplus;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.springbootmybatisplus.mapper.UserMapper;
import com.example.springbootmybatisplus.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void run(String... args) throws Exception {
        /*User user = userMapper.selectById(1);
        System.out.println(user);*/

        User user = new User();
        user.setName("微笑");
        user.setAge(3);
        user.setEmail("neo@tooool.org");
        userMapper.insert(user);
        // 成功直接拿会写的 ID
        System.out.println(user.getId());
    }
}
