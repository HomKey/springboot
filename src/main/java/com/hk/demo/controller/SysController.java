package com.hk.demo.controller;

import com.hk.base.web.BaseController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by LuHj on 2018/7/25.
 */
@Controller
public class SysController extends BaseController{
    /**
     * 默认请求处理方法，调用请求路径对应的jsp
     */
//    @RequestMapping
//    public String defaultController(HttpServletRequest request) {
//        logger.info("html");
//        String path = request.getRequestURI().replaceFirst("^" + request.getContextPath() + "/", "")
//                .replaceFirst("\\.[^.]*$", "");
//        return path;
//    }
}
