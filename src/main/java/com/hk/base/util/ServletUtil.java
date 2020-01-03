package com.hk.base.util;


import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import java.net.InetAddress;
import java.net.UnknownHostException;

public abstract class ServletUtil {
    public static boolean isFromRemote(@Context HttpServletRequest request) {
        boolean isRemote = false;
        String requestIp = request.getRemoteHost();
        String localIp = "127.0.0.1";
        try {
            localIp = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            System.out.println(ServletUtil.class.getClass() + "get Local InetAddress error!" +e.getStackTrace());
        }
        if( !requestIp.equals(localIp) && !requestIp.equals("0:0:0:0:0:0:0:1") &&  !requestIp.equals("127.0.0.1") && !requestIp.equals("localhost") ) {
            isRemote = true;
        }
        return isRemote;
    }

    public static String getRequestIp(@Context HttpServletRequest request){
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }


}
