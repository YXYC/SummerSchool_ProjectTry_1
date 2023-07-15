package com.example.summerschool_projecttry_1.service;

import com.example.summerschool_projecttry_1.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getAllUser();
    User getUser(String name,String password);
    void addUser(String id,String password,String name);
}
