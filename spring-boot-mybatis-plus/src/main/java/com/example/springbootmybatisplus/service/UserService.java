package com.example.springbootmybatisplus.service;

import com.example.springbootmybatisplus.mapper.UserMapper;
import com.example.springbootmybatisplus.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper user;

    public User GetUserById(){
        return user.selectById(1);
    }
}
