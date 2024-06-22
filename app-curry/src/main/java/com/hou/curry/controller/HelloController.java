package com.hou.curry.controller;

import com.alibaba.druid.util.StringUtils;
import com.hou.curry.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @author: Udslance
 * @create: 2024-04-13 14:32
 **/
@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam String name,@RequestParam String phone,@RequestParam String email,@RequestParam String address) {
        log.info("{} {} {} {}", name, phone, email, address);
        StringBuilder sb = new StringBuilder();
        if (!StringUtils.isEmpty(name)) {
            sb.append("Hello, ").append(name).append("!");
        }
        if (!StringUtils.isEmpty(phone)) {
            sb.append(", ").append(phone).append("!");
        }
        if (!StringUtils.isEmpty(email)) {
            sb.append(", ").append(email).append("!");
        }
        if (!StringUtils.isEmpty(address)) {
            sb.append(", ").append(address).append("!");
        }
        return sb.toString();
    }

    @RequestMapping(value = "postTest0", method = RequestMethod.POST)
    public String postTest0() {
        return "postTest0";
    }

    @RequestMapping(value = "postTest1", method = RequestMethod.POST)
    public String postTest1(String username, String password) {
        System.out.println("username: " + username);
        System.out.println("password:" + password);
        return "postTest1";
    }

    @RequestMapping(value = "postTest2", method = RequestMethod.POST)
    public String postTest2(User user) {
        System.out.println(user);
        return "postTest2";
    }
}
