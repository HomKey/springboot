package com.hk.wechat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by LuHj on 2019/7/15.
 */
@Controller
@RequestMapping("server")
public class WeChatController2 {
    /*
     * 微信公众号服务器
     */

    private final String token = "erlie";

    @GetMapping("system")
    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        //获取参数值
        String signature = request.getParameter("signature");
        String timeStamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");

        PrintWriter out = null;
        try {
            out = response.getWriter();
            //开发者获得加密后的字符串可与signature对比，标识该请求来源于微信
                //作出响应，即原样返回随机字符串
                out.println(echostr);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            out.close();
        }
    }
}
