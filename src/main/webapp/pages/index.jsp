<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="http://localhost:8080/js/index.js"></script>
    <link href="http://localhost:8080/css/index.css" rel="stylesheet" />
    <title>主页</title>
</head>
<body>
<nav class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-left cbp-spmenu-open active" id="cbp-spmenu-s1">
    <h3>目录</h3>
    <a onclick="showTab('role','http://localhost:8080/role/list')">角色管理</a>
    <a href="#">管理员管理</a>
    <a href="#">学生管理</a>
    <a href="#">导师管理</a>
    <a href="#">系统设置</a>
    <a href="#">系统满意度统计</a>
</nav>
<div class="main-container">
    <div class="tab">
        <h1>携心医疗</h1>
        <div>欢迎使用携心医疗，请选择顶部菜单进行操作.</div>
    </div>
</div>
</body>
</html>