package com.ysh.framework.common.remote.api;

import com.ysh.framework.common.remote.client.HttpClient;
import com.ysh.framework.common.remote.response.CaptchaApiResponse;
import com.ysh.framework.common.util.StringUtils;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * 验证码API（luosimao）
 */
public class CaptchaAPI extends BaseAPI {
    /**
     * 描述：验证码验证（luosimao）
     *
     * @param response 前端校验结果
     * @throws Exception 异常
     */
    public static CaptchaApiResponse siteVerify(String response) throws Exception {
        Map<String, String> map = new HashMap<>();
        HttpUriRequest httpUriRequest = RequestBuilder.get()
                .setConfig(requestConfig)
                .setUri("https://captcha.luosimao.com/api/site_verify")
                .addParameter("api_key", "d6b133d4df9ee2e4a4fcf16bacd56863")
                .addParameter("response", response)
                .build();
        map.put("url", httpUriRequest.getURI().toString());
        map.put("params", StringUtils.assemblyString("{response:", response, "}"));
        return HttpClient.executeJsonResult(httpUriRequest, map, CaptchaApiResponse.class);
    }
}
