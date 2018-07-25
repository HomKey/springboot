package com.hk.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LuHj on 2018/6/27.
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/")
    public String toIndex() {
        return "index";
    }



}
