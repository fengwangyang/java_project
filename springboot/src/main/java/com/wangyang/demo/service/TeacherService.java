package com.wangyang.demo.service;

import com.wangyang.demo.entity.Teacher;

import java.util.List;

public interface TeacherService {
    void addTeacher(Teacher reqMap);
    List<Teacher> getTeacher();
    void delTeacher(String id);
    void updateTeacher(Teacher teacher);
}
