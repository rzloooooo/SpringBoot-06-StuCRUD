package com.example.service;

import com.example.mapper.StuMapper;
import com.example.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuServiceImpl implements StuService {

    @Autowired
    private StuMapper stuMapper;

    @Override
    public List<Student> getAllStu() {
        return stuMapper.getAllStu();
    }

    @Override
    public int addStu(Student student) {
        return stuMapper.addStu(student);
    }

    @Override
    public int deleteStu(Student student) {
        return stuMapper.deleteStu(student);
    }

    @Override
    public int updateStu(Student student) {
        return stuMapper.updateStu(student);
    }

    @Override
    public List<Student> getStuById(Student student) {
        return stuMapper.getStuById(student);
    }
}
