package com.example.summerschool_projecttry_1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//使用注解，自动生成get、set等方法以及构造函数
public class User {
    private String name; //用户昵称
    private String ID;//用户ID
    private String password;//用户密码

}
