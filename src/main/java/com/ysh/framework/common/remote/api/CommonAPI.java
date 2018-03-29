package com.ysh.framework.common.remote.api;

import com.ysh.framework.common.remote.client.HttpClient;
import com.ysh.framework.common.remote.response.ApiResponse;
import com.ysh.framework.common.util.StringUtils;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * 公共API
 */
public class CommonAPI extends BaseAPI {
    /**
     * 描述：测试接口
     *
     * @param url   请求的地址
     * @param param 参数
     * @throws Exception 异常
     */
    public static ApiResponse testApi(String url, String param) throws Exception {
        Map<String, String> map = new HashMap<>();
        HttpUriRequest httpUriRequest = RequestBuilder.get()
                .setConfig(requestConfig)
                .setUri(url)
                .addParameter("param", param)
                .build();
        map.put("url", httpUriRequest.getURI().toString());
        map.put("params", StringUtils.assemblyString("{param:", param, "}"));
        return HttpClient.executeJsonResult(httpUriRequest, map, ApiResponse.class);
    }
}
