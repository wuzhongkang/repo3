package com.czxy.wzk.service;

import com.czxy.wzk.dao.StudentRepository;
import com.czxy.wzk.domain.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @param
 * @author康大
 * @2020/6/17
 * @authorASUS
 * @return 返回值
 */
@Service
@Transactional
public class StudentService {
    @Resource
    private StudentRepository studentRepository;

    /**
     * 查询所有学生
     *
     * @return
     */

    public List<Student> findAllStudent() {
        List<Student> all = studentRepository.findAll();
        return all;
    }

    /**
     * 添加学生
     *
     * @param student
     */
    public void insertStudent(Student student) {
        studentRepository.insert(student);

    }

    /**
     * 修改学生
     *
     * @param student
     */
    public void updateStudent(Student student) {
        Optional<Student> optional = studentRepository.findById(student.getSid());
        System.err.println("updateStudent"+optional.isPresent());
        if (optional.isPresent()) {
            Student student1 = optional.get();
            System.out.println(studentRepository.save(student));
        } else {
            System.out.println("没有数据");
        }

    }

    public Student findStudentBySid(String sid) {
        Optional<Student> optional = studentRepository.findById(sid);
        System.err.println(optional.isPresent());
        if (optional.isPresent()) {
            Student student1 = optional.get();
            return student1;
        }

        return null;
    }

    /**
     * 删除学生
     *
     * @param sid
     */
    public void delStudent(String sid) {
        studentRepository.deleteById(sid);

    }
}
