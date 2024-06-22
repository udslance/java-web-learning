package com.hou.curry.domain;

import lombok.Data;

/**
 * 用户实体
 * @author: Udslance
 * @create: 2024-04-13 15:50
 **/
@Data
public class User {
    private int id;

    private String username;

    private String password;

    private String birthday;
}
