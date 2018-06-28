package com.hk.demo.controller;

import com.hk.base.cache.IRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by LuHj on 2018/6/28.
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private IRedisService redisService;

    @RequestMapping(value = "/set", method = RequestMethod.PUT)
    public String redisSet(
            @RequestParam("key")String key,
            @RequestParam("value")String value){
        redisService.set(key, value);
        return value;
    }

    @RequestMapping(value = "/get/{key}", method = RequestMethod.GET)
    public String redisGet(@PathVariable(value = "key") String key) {
        String name = redisService.get(key);
        return name;
    }
}
