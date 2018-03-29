package com.ysh.framework.common.remote.api;

import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.entity.ContentType;
import org.apache.http.message.BasicHeader;

/**
 * 描述: 基础API .<br>
 *
 * @author YangShangHang
 * @date 2018/3/13
 */
public abstract class BaseAPI {

    /**
     * json请求头
     */
    protected static Header jsonHeader = new BasicHeader(
            HttpHeaders.CONTENT_TYPE,
            ContentType.APPLICATION_JSON.toString());

    /**
     * xml请求头
     */
    protected static Header xmlHeader = new BasicHeader(
            HttpHeaders.CONTENT_TYPE,
            ContentType.APPLICATION_XML.toString());

    /**
     * 请求设置
     */
    protected static RequestConfig requestConfig = RequestConfig.custom()
            .setConnectTimeout(30000).setConnectionRequestTimeout(30000)
            .setSocketTimeout(30000).build();

}