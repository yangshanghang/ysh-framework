<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <meta charset="utf-8">
    <link rel="stylesheet" href="<c:url value='/css/vendor/bootstrap.min.css'/>">
    <link rel="stylesheet" href="<c:url value='/css/vendor/dataTables.bootstrap.min.css'/>">
    <link rel="stylesheet" href="<c:url value='/css/style.css'/>">
    <title>dataTable表格展示</title>
</head>
<body>

<div class="">
    <div class="table-out">
        <table id="config-table" border="0" cellspacing="0" cellpadding="0" class="table-row mt30 nowrap"
               width="100%">
            <thead>
            <tr>
                <th style="padding: 0 20px;">序号</th>

                <th>操作</th>

                <th>标题</th>

                <th>内容</th>

                <th>描述</th>
            </tr>
            </thead>
        </table>
    </div>
</div>

<jsp:include page="../common/common.jsp"/>
<script src="<c:url value='/js/datatable/list_main.js'/>"></script>
</body>
</html>