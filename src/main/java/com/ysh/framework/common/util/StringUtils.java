package com.ysh.framework.common.util;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 描述: 字符串工具类 .<br>
 *
 * @author YangShangHang
 * @date 2018/3/13
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils  {

    /**
     * 字符串长度达到一定长度截取固定长度的子串
     *
     * @param str 截取原始字符串
     * @param max 字符串最大长度校验
     * @param sub 需要截取的子串长度
     * @return 截取后的子串
     */
    public static String subString(String str, int max, int sub) {
        // 为空，则直接返回
        if (isBlank(str)) {
            return str;
        }

        // 小于指定最大长度，直接返回
        if (str.length() <= max) {
            return str;
        }

        // 截取固定长度子串
        return substring(str, 0, sub >= str.length() ? str.length() : sub);
    }


    /**
     * 正则表达式匹配两个指定字符串中间的内容
     *
     * @param soap
     * @return
     */
    public static List<String> getSubUtil(String soap, String rgex) {
        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(rgex);// 匹配的模式
        Matcher m = pattern.matcher(soap);
        while (m.find()) {
            int i = 1;
            list.add(m.group(i));
            i++;
        }
        return list;
    }

    /**
     * 换行符统一替换成<br>
     *
     * @param str 待替换的字符串
     * @return 替换后的字符串
     * @throws Exception 异常
     */
    public static String replaceNewline(String str) throws Exception {
        // 为空，则直接返回
        if (isBlank(str)) {
            return str;
        }

        return str.replace("\\r\\n", "<br>")
                .replace("\r\n", "<br>")
                .replace("\\\\n", "<br>")
                .replace("\\n", "<br>")
                .replace("\n", "<br>");
    }

    /**
     * 拼接字符串
     *
     * @param strParam
     * @return
     */
    public static String assemblyString(String... strParam) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] arr$ = strParam;
        int len$ = strParam.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            String string = arr$[i$];
            stringBuffer.append(string);
        }

        return stringBuffer.toString();
    }

    /**
     * 获取uuid
     *
     * @return
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
    }
}
