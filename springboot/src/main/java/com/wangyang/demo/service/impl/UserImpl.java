package com.wangyang.demo.service.impl;

import com.wangyang.demo.entity.User;
import com.wangyang.demo.mapper.UserMapper;
import com.wangyang.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUser(User reqMap){
        System.out.println(reqMap);
        return userMapper.getUser(reqMap);
    }
}
