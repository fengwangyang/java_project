package com.wangyang.demo.service.impl;

import com.wangyang.demo.entity.Teacher;
import com.wangyang.demo.mapper.TeacherMapper;
import com.wangyang.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherIml implements TeacherService{
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public void addTeacher(Teacher reqMap){
        teacherMapper.addTeacher(reqMap);
    };
    public List<Teacher> getTeacher(){
        return teacherMapper.getTeacher();
    }
    public void delTeacher(String id){
         teacherMapper.delTeacher(id);
    }
    public void updateTeacher(Teacher teacher){
        teacherMapper.updateTeacher(teacher);
    }


}
