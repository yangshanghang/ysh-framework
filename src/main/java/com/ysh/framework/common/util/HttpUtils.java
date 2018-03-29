package com.ysh.framework.common.util;

import org.apache.commons.io.IOUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 描述: Http工具类 .<br>
 *
 * @author YangShangHang
 * @date 2018/3/13
 */
public class HttpUtils {

    /**
     * 获取客户端IP地址
     *
     * @param request 客户端请求
     * @return 客户端IP地址
     */
    public static String getClientIP(HttpServletRequest request) {
        String ip = "";
        try {
            ip = getIpAddress(request);
        } catch (Exception e) {
            // 异常直接返回空串，不做别的处理
        }
        return ip;
    }

    /**
     * 获取Http请求内容
     *
     * @param request 请求对象
     * @return 请求文本内容
     * @throws Exception
     */
    public static String getHttpContent(HttpServletRequest request) throws Exception {
        return IOUtils.toString(request.getInputStream());
    }


    /**
     * 判断是否Ajax请求
     *
     * @param request 请求
     * @return ajax请求：true 否则 false
     */
    public static boolean isAjax(HttpServletRequest request) {
        // 判定是否为异步请求，非异步请求直接进入error页面
        return ((request.getHeader("accept") != null && request.getHeader("accept").indexOf("application/json") > -1)
                || (request.getHeader("X-Requested-With") != null
                && request.getHeader("X-Requested-With").indexOf("XMLHttpRequest") > -1));
    }

    /**
     * http响应写回
     * @param response 响应
     * @param info 响应内容
     * @param httpStatus 响应状态
     * @throws Exception
     */
    public static void write(HttpServletResponse response, String info, int httpStatus) throws Exception {
        PrintWriter writer = null;
        try {
            // 设置响应字符集
            response.setContentType("text/html; charset=utf-8");
            // 设置HTTP响应状态码
            response.setStatus(httpStatus);
            writer = response.getWriter();
            writer.write(info);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    /**
     * 获取ip地址
     *
     * @param request
     * @return
     */
    private static String getIpAddress(HttpServletRequest request) {
        if(request == null) {
            return "";
        } else {
            String ipAddress = request.getHeader("X-Forwarded-For");
            if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                ipAddress = request.getHeader("Proxy-Client-IP");
            }

            if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                ipAddress = request.getHeader("WL-Proxy-Client-IP");
            }

            if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                ipAddress = request.getHeader("X-Real-IP");
            }

            if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                ipAddress = request.getRemoteAddr();
            }

            return ipAddress;
        }
    }
}
