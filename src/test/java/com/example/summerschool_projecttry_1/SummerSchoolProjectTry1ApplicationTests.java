package com.example.summerschool_projecttry_1;

import com.example.summerschool_projecttry_1.mapper.UserMapper;
import com.example.summerschool_projecttry_1.pojo.User;
import com.example.summerschool_projecttry_1.service.Impl.UserServiceImpl;
import com.example.summerschool_projecttry_1.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class SummerSchoolProjectTry1ApplicationTests {
   @Autowired
    private UserService userService = new UserServiceImpl();

   @Autowired
   private UserMapper userMapper;
    @Test
    void contextLoads() {
        // 调用userService的方法进行测试
        List<User> allUsers = userService.getAllUser();
        System.out.println(allUsers);
    }

    @Test
    void GetAllUser(){
        System.out.println(userMapper.getAllUser());
        List<User> allUsers = userService.getAllUser();
        System.out.println(allUsers);
    }


    @Test
    void AddUser(){
        GetAllUser();
        userMapper.addUser("1234675417","123456","张三");
        GetAllUser();
    }

    @Test
    void GetUser(){
        //对获取用户进行验证
        User user;
        user = userMapper.getUser("1918686415","123456");
        System.out.println(user);
        user = userService.getUser("419746256","123456");
        System.out.println(user);
    }




}
