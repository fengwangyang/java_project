package com.wangyang.demo.service;

import com.wangyang.demo.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
     List<User> getUser(User reqMap);
}
