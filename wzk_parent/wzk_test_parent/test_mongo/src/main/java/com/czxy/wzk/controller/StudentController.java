package com.czxy.wzk.controller;

import com.czxy.wzk.common.BaseResult;
import com.czxy.wzk.domain.Student;
import com.czxy.wzk.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @param
 * @author康大
 * @2020/6/17
 * @authorASUS
 * @return 返回值
 */
@RestController
@RequestMapping("/stu")
public class StudentController {
    @Resource
    private StudentService studentService;

//
//    @GetMapping("/test")
//    public BaseResult test() {
//
//        System.out.println(studentService.findAllStudent());
//
//        return BaseResult.ok("查询成功", studentService.findAllStudent());
//    }


    /**
     * 查询所有学生
     *
     * @return
     */
    @GetMapping("/findAllStudent")
    public BaseResult findAllStudent() {

        System.out.println("findAllStudent");
        return BaseResult.ok("查询成功", studentService.findAllStudent());
    }

    /**
     * 添加学生
     *
     * @param student
     */
    @PostMapping("/insertStudent")
    public BaseResult insertStudent(@RequestBody Student student) {
        studentService.insertStudent(student);
        return BaseResult.ok("添加成功");
    }




    /**
     * 修改学生
     *
     * @param student
     */
    @PostMapping("/updateStudent")
    public BaseResult updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return BaseResult.ok("修改成功");
    }

    /**
     * 删除学生
     *
     * @param sid
     */
    @DeleteMapping("/delStudent/{sid}")
    public BaseResult delStudent(@PathVariable String sid) {
        studentService.delStudent(sid);
        return BaseResult.ok("删除成功");
    }

    @PostMapping("/findStudentBySid/{sid}")
    public BaseResult findStudentBySid(@PathVariable("sid") String sid) {

        Student studentBySid = studentService.findStudentBySid(sid);
        return BaseResult.ok("", studentBySid);
    }
}
