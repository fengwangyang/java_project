package com.wangyang.demo.mapper;

import com.wangyang.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    List<User> getUser(User reqMap);
}
