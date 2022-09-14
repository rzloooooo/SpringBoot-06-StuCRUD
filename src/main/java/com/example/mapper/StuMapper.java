package com.example.mapper;

import com.example.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StuMapper {

    // 查询全部
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
