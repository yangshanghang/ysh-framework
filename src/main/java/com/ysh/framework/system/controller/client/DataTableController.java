package com.ysh.framework.system.controller.client;

import com.ysh.framework.common.page.datatable.PageRequest;
import com.ysh.framework.common.page.datatable.PageResponse;
import com.ysh.framework.system.model.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述: dataTable表格 控制器 .<br>
 *
 * @author YangShangHang
 * @date 2018/3/29
 */
@Controller
@RequestMapping(value = "/client/data_table/")
public class DataTableController {

    /**
     * 进入dataTable表格页面
     *
     * @return dataTable表格页面
     * @throws Exception 异常
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list() throws Exception {
        return "datatable/list";
    }

    /**
     * 获取dataTable内容列表
     *
     * dataTable查询数据库：
     * 需要传入pageNum,pageSize通过limit查询当前页，
     * 还需查询满足条件的列表数量
     *
     * @return dataTable内容列表
     * @throws Exception 异常
     */
    @RequestMapping(value = "read_list", method = RequestMethod.GET)
    @ResponseBody
    public PageResponse<DataTable> readList(PageRequest request) throws Exception {
        PageResponse<DataTable> response = new PageResponse<>(generateList(request));
        response.setRecordsFiltered(30);
        response.setRecordsTotal(30);
        return response;
    }

    /**
     * 生成dataTable列表
     *
     * @return dataTable列表
     * @throws Exception 异常
     */
    private List<DataTable> generateList(PageRequest request) throws Exception {
        int pageNum = request.getPageNum();
        int pageSize = request.getLength();
        List<DataTable> list = new ArrayList<>();
        List<DataTable> dataTableList = new ArrayList<>();
        DataTable dataTable;
        for (int i = 0; i < 30; i++) {
            dataTable = new DataTable("这是一个标题" + i, "这是内容呀呀呀" + i, "那么这就是描述了" + i);
            list.add(dataTable);
        }

        for (int i = (pageNum - 1) * pageSize; i < pageNum * pageSize; i++) {
            dataTableList.add(list.get(i));
        }

        return dataTableList;
    }
}
