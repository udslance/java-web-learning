package com.hou.curry.controller;

import com.hou.curry.domain.User;
import com.hou.curry.mapper.UserMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
@Slf4j
public class UserController {
    private UserMapper userMapper;

    @GetMapping("/query")
    public List<User> query() {
        List<User> userList = userMapper.getUserList();
        System.out.println("size: " + userList.size());
        for (User user : userList) {
            System.out.println(user);
        }
        return userList;
    }

    @PostMapping("/user")
    public String save(User user) {
        int result = userMapper.insert(user);
        if (result > 0) {
            return "insert success";
        } else {
            return "insert fail";
        }
    }
}
