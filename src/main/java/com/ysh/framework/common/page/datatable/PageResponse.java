package com.ysh.framework.common.page.datatable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述: dataTable分页对象 .<br>
 *
 * @author YangShangHang
 * @date 2018/3/29
 */
public class PageResponse<T> implements Serializable {
    private static final long serialVersionUID = -5584061128249495676L;

    private int draw;
    private long recordsTotal;
    private long recordsFiltered;
    private List<T> data = new ArrayList();

    public PageResponse(List<T> data) {
        this.recordsTotal = data.size();
        this.recordsFiltered = data.size();
        this.data = data;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public long getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(long recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public long getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(long recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
