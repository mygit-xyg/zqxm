package com.baizhi.controller;

import com.baizhi.entity.Student;
import com.baizhi.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/test")
    public String test(Map map ,Integer start) {
        if(start==null){
            start=1;
        }
        /*PageHelper.startPage(start, 5);
        List<Student> list = studentService.queryAll();;
        PageInfo<Student> pi = new PageInfo<Student>(list);
        map.put("list",list);
        map.put("pi",pi);*/
        PageHelper.startPage(start, 6);
        List<Student> list = studentService.squeryAll();
        PageInfo<Student> pageInfo=new PageInfo<Student>(list);
        map.put("list", list);
        map.put("pageInfo",pageInfo);

        return "index";
    }
}
