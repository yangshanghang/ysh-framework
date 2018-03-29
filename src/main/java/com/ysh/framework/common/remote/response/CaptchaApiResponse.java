package com.ysh.framework.common.remote.response;

import java.io.Serializable;

/**
 * 描述: 验证码api响应（luosimao） .<br>
 *
 * @author YangShangHang
 * @date 2018/3/13
 */
public class CaptchaApiResponse implements Serializable {

    private static final long serialVersionUID = -2021616574750699040L;

    /**
     * 错误码
     */
    private String error;

    /**
     * 验证结果
     */
    private String res;

    /**
     * 	错误代码描述
     */
    private String msg;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
