package com.ysh.framework.system.model;

/**
 * 描述: dataTable实体类 .<br>
 *
 * @author YangShangHang
 * @date 2018/3/29
 */
public class DataTable {

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 描述
     */
    private String describe;

    public DataTable() {
    }

    public DataTable(String title, String content, String describe) {
        this.title = title;
        this.content = content;
        this.describe = describe;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
