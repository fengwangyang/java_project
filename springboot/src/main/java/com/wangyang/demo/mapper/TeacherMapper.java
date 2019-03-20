package com.wangyang.demo.mapper;

import com.wangyang.demo.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {
    void addTeacher(Teacher reqMap);
    List<Teacher> getTeacher();
    void delTeacher(String id);
    void updateTeacher(Teacher teacher);
}
