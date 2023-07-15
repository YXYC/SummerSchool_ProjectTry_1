package com.example.summerschool_projecttry_1.mapper;

import com.example.summerschool_projecttry_1.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
/**
 * @Mapper 注解用于标识 MyBatis 的映射器接口或类，而 @Repository 注解用于标识 Spring 的数据访问层组件
 */
public interface UserMapper {
    List<User> getAllUser();//查询所有的用户
    User getUser(String name,String password);//通过账号密码，查找用户是否存在
    void addUser(String id,String password,String name);//增加新用户
}