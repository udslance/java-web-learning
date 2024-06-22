package com.hou.curry.mapper;

import com.hou.curry.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * UserMapper
 * @author: Udslance
 * @create: 2024-04-14 18:30
 **/
@Mapper
public interface UserMapper {
    List<User> getUserList();

    int insert(User user);
}
