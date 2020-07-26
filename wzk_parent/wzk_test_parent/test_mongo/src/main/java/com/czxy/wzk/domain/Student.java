package com.czxy.wzk.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @param
 * @author康大
 * @2020/6/17
 * @authorASUS
 * @return 返回值
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "student")
public class Student {
    @Id
    private String sid;
    @Field("name")
    private String name;
    @Field("password")
    private String password;
    @Field("age")
    private Integer age;
    @Field("edu")
    private String edu;
    @Field("description")
    private String description;

}
