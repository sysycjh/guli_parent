package com.cjh.eduservice.controller;


import com.cjh.eduservice.entity.EduTeacher;
import com.cjh.eduservice.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author CJH
 * @since 2022-10-14
 */
@RestController
@RequestMapping("/eduservice/edu-teacher")
public class EduTeacherController {

    @Autowired
    private EduTeacherService eduTeacherService;

    @GetMapping("/findAll")
    public List<EduTeacher> findAllTeacher(){
        List<EduTeacher> list = eduTeacherService.list(null);
        return list;
    }

    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable("id")String id){
        return eduTeacherService.removeById(id);
    }
}

