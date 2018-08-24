package com.hk.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LuHj on 2018/8/15.
 */
@Controller
public class WebSocketController {

    @RequestMapping("/client")
    public String getWebSocketClientTylf(){
        return "websocket-client";
    }
}
