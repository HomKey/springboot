package com.hk.demo.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.hk.base.domain.ResponseResult;
import com.hk.base.enums.ResponseCode;
import com.hk.demo.entity.Student;
import com.hk.demo.entity.User;
import com.hk.demo.service.IUserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.sql.Wrapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tandewei on 2018/6/25.
 */
@RestController
@Api(tags = "my first swagger")
public class HelloController {

    @Value("${name}")
    private String name;

    @Value("${password}")
    private String password;

    @Autowired
    private Student student;

    @Autowired
    private IUserService userService;

    @RequestMapping("/junit")
    @ApiOperation(value = "hello junit")
    public String junitTest(){
        return "hello junit";
    }
    @RequestMapping("/hello")
    public String hello(){
        return "name:" + name + "\n" +
                "password:" + password + "\n" +
                "student: " + student.getName() + "/" + student.getAge()
                ;
    }
    @RequestMapping("/hello/swagger")
    @ApiOperation(value = "swagger param test")
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功"),
            @ApiResponse(code = 400, message = "服务器内部异常")
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id", dataType = "Long", paramType = "query", required=true),
            @ApiImplicitParam(name = "name", value = "name",dataType = "String", paramType = "query", required = true)
    })
    public ResponseResult swagger(
            @RequestParam(name = "id") int id,
            @RequestParam(name = "name") String name){
        Map<String, Object> result = new HashMap<>();
        result.put("id", id);
        result.put("name", name);
        return new ResponseResult(ResponseCode.SUCCESS, result);
    }

    @RequestMapping("/hello/jenkins")
    public String jenkins(){
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
    @ApiOperation(value = "分页查询用户")
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
