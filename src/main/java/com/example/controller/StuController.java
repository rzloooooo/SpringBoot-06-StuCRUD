package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.pojo.Msg;
import com.example.pojo.Student;
import com.example.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class StuController {

    @Autowired
    private StuService stuService;

    @RequestMapping("/allStu")
    @ResponseBody
    public String allStu() {
        List<Student> allStu = stuService.getAllStu();
        return JSON.toJSONString(allStu);
    }

    @RequestMapping("/addStu")
    @ResponseBody
    public String addStu(@RequestBody Student student) {
        int i = stuService.addStu(student);
        Msg msg = new Msg();
        if (i > 0) {
            msg.setCode(200);
        } else {
            msg.setCode(400);
        }
        return JSON.toJSONString(msg);
    }

    @RequestMapping("/deleteStu")
    @ResponseBody
    public String deleteStu(@RequestBody Student student) {
        int i = stuService.deleteStu(student);
        Msg msg = new Msg();
        if (i > 0) {
            msg.setCode(200);
        } else {
            msg.setCode(400);
        }
        return JSON.toJSONString(msg);
    }

    @RequestMapping("/updateStu")
    @ResponseBody
    public String updateStu(@RequestBody Student student) {
        int i = stuService.updateStu(student);
        Msg msg = new Msg();
        if (i > 0) {
            msg.setCode(200);
        } else {
            msg.setCode(400);
        }
        return JSON.toJSONString(msg);
    }

    @RequestMapping("/getStuById")
    @ResponseBody
    public String getStuById(@RequestBody Student student) {
        List<Student> list = stuService.getStuById(student);
        return JSON.toJSONString(list);
    }

    @RequestMapping("/getStu")
    @ResponseBody
    public String getStu() {
        System.out.println("Hello Git!");
        return "";
    }

}
