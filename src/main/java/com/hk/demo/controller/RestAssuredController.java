package com.hk.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LuHj on 2019/8/15.
 */
@RestController
@RequestMapping("/RestAssured")
public class RestAssuredController {

    @GetMapping("/test/{id}")
    public String testRestAssured(@PathVariable("id") String id) {
        return "this is RestAssured test : " + id;
    }
}
