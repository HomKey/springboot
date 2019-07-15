package com.hk.wechat;

import jdk.nashorn.internal.parser.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by LuHj on 2019/7/11.
 */
@RestController
@RequestMapping("wechat")
public class WeChatController {

    private final String token = "erlie";

    @RequestMapping(value = "token")
    public void getToken(HttpServletRequest request, HttpServletResponse response) {
        //获取参数值
        String signature = request.getParameter("signature");
        String timeStamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");

        // 测试分支合并1111111

        try {
            response.getWriter().print(echostr == null ? token : echostr);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        return echostr;
    }
}
