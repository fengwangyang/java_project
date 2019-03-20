package com.wangyang.demo.controller;

import com.wangyang.demo.entity.Teacher;
import com.wangyang.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TeacherControll {
    @Autowired
    private TeacherService TeacherService;
    @RequestMapping(value = "/addTeacher",method = RequestMethod.POST)
        public void addTeacher(@RequestBody Teacher reqMap) {
        TeacherService.addTeacher(reqMap);
    }
    @RequestMapping(value = "/getTeacher",method = RequestMethod.GET)
    public List<Teacher> getTeacher() {
        return TeacherService.getTeacher();
    }
    @RequestMapping(value = "/delTeacher", method = RequestMethod.GET)
    public void delTeacher(String id){
        System.out.println("1111111111");
        System.out.println(id);
        TeacherService.delTeacher(id);
    }
    @RequestMapping(value = "/updateTeacher", method = RequestMethod.POST)
    public void updateTeacher(@RequestBody Teacher reqMap){
        System.out.println("1111111111");
        TeacherService.updateTeacher(reqMap);
    }

}
