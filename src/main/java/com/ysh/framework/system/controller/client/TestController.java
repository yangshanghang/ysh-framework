package com.ysh.framework.system.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述: 测试Controller .<br>
 *
 * @author YangShangHang
 * @date 2018/3/13
 */
@Controller("clientTestController")
@RequestMapping("/client/system")
public class TestController {

    @RequestMapping(value = "/index")
    public String index() throws Exception{

        return "index";
    }
}
