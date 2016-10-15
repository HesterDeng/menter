<%--
  Created by IntelliJ IDEA.
  User: xheart
  Date: 2016/8/10
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=GB2312" %>
<%@include file="common.jsp"%>
<html>
<head>
    <script type="text/javascript" src="/js/role.js"></script>
    <script type="text/javascript" src="/plugin/bootstrap/js/bootstrap-table.js"></script>
    <link href="/css/role.css" rel="stylesheet" />
    <link rel="stylesheet" href="/plugin/bootstrap/css/bootstrap-table.min.css">
    <title>角色管理</title>
</head>
<body>
<%--搜索表单--%>
<div class="search-form form-horizontal">
    <div class="form-group">
        <label class="col-sm-2 control-label">关键字：</label>

        <div class="col-sm-3">
            <input type="text" name="keyword" class="form-control keyword" placeholder="请输入查询关键字...">
        </div>

        <div class="col-sm-1">
            <button class="btn btn-primary search">搜索</button>
        </div>
        <div class="col-sm-6">
            <button class="btn btn-primary add">添加</button>
        </div>
    </div>
</div>

<table data-toggle="table" data-url="/role/list" data-classes="table table-hover"
       data-pagination="true" data-pagination-loop="true" data-side-pagination="server">
    <thead>
    <tr>
        <th data-field="id">ID</th>
        <th data-field="rolename" data-editable="true">角色名字</th>
        <th data-field="rolepower" data-editable="true">角色权限</th>
        <th data-field="option">操作</th>
    </tr>
    </thead>
</table>
</body>
</html>
