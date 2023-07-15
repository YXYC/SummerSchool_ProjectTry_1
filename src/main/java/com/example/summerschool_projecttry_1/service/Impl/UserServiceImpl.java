package com.example.summerschool_projecttry_1.service.Impl;


import com.example.summerschool_projecttry_1.mapper.UserMapper;
import com.example.summerschool_projecttry_1.pojo.User;
import com.example.summerschool_projecttry_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public User getUser(String name, String password) {
        return userMapper.getUser(name,password);
    }

    @Override
    public void addUser(String id, String password, String name) {
        userMapper.addUser(id, password, name);
    }
}
