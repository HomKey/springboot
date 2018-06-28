package com.hk.demo.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.hk.demo.entity.Student;
import com.hk.demo.entity.User;
import com.hk.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.sql.Wrapper;
import java.util.List;

/**
 * Created by tandewei on 2018/6/25.
 */
@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @Value("${password}")
    private String password;

    @Autowired
    private Student student;

    @Autowired
    private IUserService userService;

    @RequestMapping("/hello")
    public String hello(){
        return "name:" + name + "\n" +
                "password:" + password + "\n" +
                "student: " + student.getName() + "/" + student.getAge()
                ;
    }



    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> getUserList(){
        EntityWrapper<User> ew = new EntityWrapper<User>();
        ew.where("name={0}", "雷锋").and("id=0")
                .orNew("test_type={0}", "1").or("test_type=0")
                .notLike("name", "notvalue")
                .andNew("role=1").like("role", "1")
                .andNew("role=1").isNotNull("test_date,test_date").isNull("phone")
                .groupBy("id").groupBy("tenant_id,name")
                .having("age=1").having("role=1")
                .orderBy("test_date");
        List<User> users = userService.selectList(ew);
        return users;
    }

    @RequestMapping(value = "/user/page", method = RequestMethod.GET)
    public Page<User> getUserListByPage(
            @RequestParam(name = "current", required = false, defaultValue = "1") int current,
            @RequestParam(name = "size", required = false, defaultValue = "5") int size ){
        Page<User> pages = userService.selectPage(new Page<User>(current,size));
        return pages;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public boolean delUser(@PathVariable(value = "id")Long id){
        boolean isSuccess = userService.deleteById(id);
        return isSuccess;
    }
}
