package com.hk.demo.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.hk.base.entity.SysUser;
import com.hk.base.service.ISysUserService;
import com.hk.demo.entity.User;
import com.hk.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author HomKey123
 * @since 2018-06-26
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;
    @Autowired
    private ISysUserService sysUserService;

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public User addUser(){
        User user = new User();
        user.setName("Name");
        userService.save(user);
        return user;
    }

    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    public boolean delUser(@PathVariable(value = "id") Long id){
        return userService.deleteById(id);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable(value = "id")String id){
        User user = userService.selectById(id);
        return user;
    }

    @RequestMapping(value = "/sys/user", method = RequestMethod.GET)
    public Page<SysUser> selectSysUserByPage(
            @RequestParam(name = "current", required = false, defaultValue = "1") int current,
            @RequestParam(name = "size", required = false, defaultValue = "5") int size ){
        return sysUserService.selectPage(new Page<SysUser>(current,size));
    }

    @RequestMapping(value = "/emoji", method = RequestMethod.POST)
    public User addEmojiToMysql(
            @RequestParam(name = "name") String name
    ){
        User user = new User();
        user.setName(name);
        userService.save(user);
        return user;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getTest(String test){
                return test;
    }
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public int getTest(int test){
        return test;
    }
}

