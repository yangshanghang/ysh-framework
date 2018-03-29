$(function () {
    //页面初始化
    init()
});

function init() {
    $('#js-verify').click(function () {
        $.ajax({
            type: "POST",
            url: "/client/system/verify",
            data: "luotest_response=" + $('#lc-captcha-response').val(),
            success: function (data) {
                layer.msg(data.msg);
            }
        });
    })
}



