package com.example.service;

import com.example.pojo.Student;

import java.util.List;

public interface StuService {

    List<Student> getAllStu();

    // 添加
    int addStu(Student student);

    // 删除
    int deleteStu(Student student);

    // 修改
    int updateStu(Student student);

    // 条件查询
    List<Student> getStuById(Student student);
}
