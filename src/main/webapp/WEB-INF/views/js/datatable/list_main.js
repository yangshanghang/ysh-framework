require(['component/dataTable', 'common/util', 'common/http', "layer1", 'jquery.serialize'], function (dataTable, util, http, layer) {

    init();

    var searchParams;//查询参数声明!
    var table;

    /**
     * 初始化函数集合
     */
    function init() {
        // 初始化dataTable
        initDataTable();
        // 事件绑定
        _bind();
    }

    /**
     * 初始化dataTable
     */
    function initDataTable() {
        table = dataTable.load({
            //需要初始化dataTable的dom元素
            el: '#config-table',
            ajax: {
                url: window.__YSH_FRAMEWORK__.root_url + 'client/data_table/read_list',
                data: function (data) {
                    data.params = searchParams;
                }
            },
            //需注意如果data没有对应的字段的，请设置为null，不然ie下会出错;
            //className不要写成class
            showIndex: true,
            scrollX: true,
            columns: [
                {data: null, defaultContent: ''},
                {data: null, defaultContent: '', width: "200px"},
                {data: 'title'},
                {data: 'content'},
                {data: 'describe'}
            ],
            columnDefs: [
                {
                    targets: 1,
                    render: function (data, type, row, meta) {
                        return '&nbsp<a href="javascript:void(0);" data-id="' + row.id + '" class="js-edit">修改</a>' +
                            '&nbsp<a href="javascript:void(0);" data-id="' + row.id + '" class="js-delete">删除</a>';

                    }
                }
            ]
        });
    }

    function _bind() {
        util.bindEvents([
            // {
            //     el: '#search',
            //     event: 'click',
            //     handler: function () {
            //         searchParams = $("#configForm").serializeObject();
            //         table.ajax.reload();
            //     }
            // }, {
            //     el: '.ipt-txt',
            //     event: 'keydown',   // 回车查询
            //     handler: function (event) {
            //         var e = event || window.event;
            //         if (e.keyCode == 13) {
            //             searchParams = $("#configForm").serializeObject();
            //             table.ajax.reload();
            //             return false;
            //         }
            //     }
            // },
            {
                el: '.js-edit',
                event: 'click',
                handler: function () {
                    layer.open({
                        type: 2, // 2表示打开新的url
                        title: ['修改配置', 'font-size:18px;color:#07538f;background:#e4f6fb;'],
                        // skin: 'layui-layer-rim', //加上边框
                        area: ['40%', '95%'], //宽高
                        content: ['http://www.baidu.com']
                    });
                }
            }
        ])
    }

});