package com.czxy.wzk.dao;

import com.czxy.wzk.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @param
 * @author康大
 * @2020/6/17
 * @authorASUS
 * @return 返回值
 */
public interface StudentRepository extends MongoRepository<Student, String> {
}
