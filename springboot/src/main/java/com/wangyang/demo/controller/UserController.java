package com.wangyang.demo.controller;

import com.wangyang.demo.entity.User;
import com.wangyang.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public List<User> getUser(@RequestBody User reqMap) {
        System.out.println(reqMap);
        System.out.println(userService.getUser(reqMap));
        return userService.getUser(reqMap);
    }
}
