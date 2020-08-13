package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @description:
 * @author: bbm
 * @Date: 2020/8/12 5:40 下午
 */
@RestController
@RequestMapping("/consumer/v1")
@RefreshScope
public class ConfigController {
    @Value("${config.name:b}")
    private String configName;

//    @Value("{config.friend.name:lsv}")
    @Value("${config.friend.name:f}")
    private String friendName;

    @Value("${student.name:s}")
    private String stuName;

    @Value("${student.age:12}")
    private String age;

    @Value("${bobo.age:12}")
    private String boage;

    @RequestMapping(method = RequestMethod.GET, value = "/getConsumer")
    public void test(){
        System.out.println("config name:" + configName);
        System.out.println("friend name:" + friendName);
        System.out.println("stu name:" + stuName);
        System.out.println("stu age:" + age);
        System.out.println("stu boage:" + boage);
    }
}
