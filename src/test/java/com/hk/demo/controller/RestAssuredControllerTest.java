package com.hk.demo.controller;

import io.restassured.response.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * Created by LuHj on 2019/8/15.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RestAssuredControllerTest {
    @Autowired
    private RestAssuredController restAssuredController;

    @Test
    public void testRestAssured() {
        Response response = get("/RestAssured/test/{id}", 1);
        System.out.println(response);
    }

}