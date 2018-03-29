package com.ysh.framework.common.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * 描述: 可配置常量 .<br>
 *
 * @author YangShangHang
 * @date 2018/3/13
 */
@Component
@Lazy(false)
public class ConfigConstant {

    /**
     * 微信服务地址
     */
    public static String FRAMEWORK_SERVER_URL;

    @Value(("${framework.server.url}"))
    public void setFrameworkServerUrl(String frameworkServerUrl) {
        FRAMEWORK_SERVER_URL = frameworkServerUrl;
    }
}
