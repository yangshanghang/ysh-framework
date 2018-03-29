package com.ysh.framework.system.controller.client;

import com.ysh.framework.common.ajax.AjaxResult;
import com.ysh.framework.common.remote.api.CaptchaAPI;
import com.ysh.framework.common.remote.response.CaptchaApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述: 验证码控制器 .<br>
 *
 * @author YangShangHang
 * @date 2018/3/13
 */
@Controller("clientCaptchaController")
@RequestMapping("/client/system")
public class CaptchaController {

    /**
     * 进入点击型验证码页面
     *
     * @return 页面
     * @throws Exception 异常
     */
    @RequestMapping(value = "/to_click_captcha", method = RequestMethod.GET)
    public String toClickCaptcha() throws Exception{

        return "captcha/clickCaptcha";
    }

    /**
     * 验证验证码
     *
     * @param luotest_response 前端校验结果
     * @return 验证结果
     * @throws Exception 异常
     */
    @RequestMapping(value = "/verify", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult verifyClickCaptcha(@RequestParam(value = "luotest_response") String luotest_response) throws Exception{
        CaptchaApiResponse response = CaptchaAPI.siteVerify(luotest_response);
        if("success".equals(response.getRes())){
            return AjaxResult.success("验证成功");
        }
        return AjaxResult.error("验证失败");
    }
}
