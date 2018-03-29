package com.ysh.framework.common.remote.client;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;

/**
 * Http请求客户端
 * Created by yushunwei on 2016/8/7.
 */
public class HttpClient {

    private static Logger logger = LoggerFactory.getLogger(HttpClient.class);

    // http请求连接池
    private static PoolingHttpClientConnectionManager connectionManager;

    // httpClient生成器
    private static HttpClientBuilder clientBuilder;

    static {
        connectionManager = new PoolingHttpClientConnectionManager();
        // 设置最大连接数为100
        connectionManager.setMaxTotal(120);
        // 设置每个域名最大连接数为15
        connectionManager.setDefaultMaxPerRoute(15);
        // 设置连接管理器及重试策略
        clientBuilder = HttpClients.custom()
                .setConnectionManager(connectionManager)
                .setConnectionManagerShared(true);
//                .setRetryHandler(new HttpRequestRetryHandler() {
//                    @Override
//                    public boolean retryRequest(IOException exception, int executionCount, HttpContext context) {
//                        // 重试2次后放弃
//                        if (executionCount > 2) {
//                            return false;
//                        }
//                        // 如果服务器丢掉了连接，则再次重试
//                        if (exception instanceof NoHttpResponseException) {
//                            return true;
//                        }
//                        return false;
//                    }
//                });
    }

    /**
     * 请求超时配置
     */
    private static RequestConfig requestConfig = RequestConfig.custom()
            .setConnectTimeout(30 * 1000)
            .setConnectionRequestTimeout(30 * 1000)
            .setSocketTimeout(30 * 1000).build();

    /**
     * 执行json格式返回类请求
     *
     * @param request     请求
     * @param requestInfo 请求信息
     * @param clazz       返回对象类型
     * @param <T>         泛型
     * @return 泛型对象
     * @throws Exception
     */
    public static <T> T executeJsonResult(HttpUriRequest request, Map<String, String> requestInfo, Class<T> clazz) throws Exception {
        return execute(request, JsonResponseHandler.createResponseHandler(request, requestInfo, clazz));
    }

    /**
     * 执行string格式返回类请求
     *
     * @param request 请求
     * @return 字符结果
     * @throws Exception 异常
     */
    public static String executeStringResult(HttpUriRequest request, Map<String, String> requestInfo) throws Exception {
        return (String) execute(request, StringResponseHandler.createResponseHandler(request, requestInfo));
    }

    /**
     * 发送请求
     *
     * @param request         请求
     * @param responseHandler 响应处理器
     * @param <T>             泛型
     * @return 泛型对象
     * @throws Exception
     */
    private static <T> T execute(HttpUriRequest request, ResponseHandler<T> responseHandler) throws Exception {
//        CloseableHttpClient httpClient = clientBuilder
//                .setDefaultRequestConfig(requestConfig)
//                .build();
//        T t;
//        try {
//            t = httpClient.execute(request, responseHandler);
//        } catch (Exception e) {
//            logger.error("HTTP请求失败：", e);
//            throw new Exception(e);
//        }
//        return t;
        CloseableHttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).build();
        T t;
        try {
            t = httpClient.execute(request, responseHandler);
        } catch (Exception e) {
            logger.error("HTTP请求失败：", e);
            throw new Exception(e);
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                logger.error("HTTP请求关闭连接失败：", e);
            }
        }
        return t;
    }
}
