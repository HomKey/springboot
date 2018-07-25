package com.hk.base.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by LuHj on 2018/7/25.
 */
@Aspect
@Component
public class ControllerValidatorInterceptor {
    @Around("execution(* com.hk.*.controller.*.*(..)) && args(..,bindingResult)")
    public Object doAround(ProceedingJoinPoint pjp, BindingResult bindingResult) throws Throwable {
        /**
         * 1.获取request信息
         * 2.根据request获取session
         * 3.从session中取出登录用户信息
         */
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        HttpServletRequest request = sra.getRequest();

        // 获取输入参数
        Map<String, String[]> inputParamMap = request.getParameterMap();
        // 获取请求地址
        String requestPath = request.getRequestURI();
        String method =  request.getMethod();
        //info("当前请求的URL：【{}】", requestPath);
        //info("执行目标方法: {}", method);
        //print(inputParamMap, "请求参数");

        // 执行完方法的返回值：调用proceed()方法，就会触发切入点方法执行
        Map<String, Object> outputParamMap = new HashMap<String, Object>();
        Object result = pjp.proceed();// result的值就是被拦截方法的返回值
        outputParamMap.put("result", result);
//      print(outputParamMap, "返回参数");
//      info("MVC返回请求完成耗时：【{}】", startTimeMillis - endTimeMillis);


        Object retVal;
        if (bindingResult.hasErrors()) {
            retVal = "" + requestPath.replace("/springboot","");
        } else {
            retVal = pjp.proceed();
        }
        return retVal;
    }

    @Around("execution(* com.hk.*.controller.*.*(..))")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        return pjp.proceed();
    }
}
