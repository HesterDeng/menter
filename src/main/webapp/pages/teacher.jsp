<%--
  Created by IntelliJ IDEA.
  User: feilin
  Date: 2016/8/21
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common.jsp"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>老师姓名</title>
</head>
<body>
<nav class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-left cbp-spmenu-open active" id="cbp-spmenu-s1">
  <h3>目录</h3>
  <a onclick="showTab('简历','/pages/teacherCV.jsp')">简历</a>
  <a onclick="showTab('学生选择列表','/pages/stuList.jsp')">学生选择列表</a>
  <a onclick="showTab('已选列表','/pages/selectStu.jsp')">已选列表</a>
  <a onclick="showTab('系统评估','/pages/score.jsp')">系统评估</a>
  <a onclick="closeSession()">退出</a>
</nav>
<div class="main-container">
  <div class="tab">
    <h1>welcome</h1>
    <div>欢迎使用导师选择系统，请选择菜单进行操作.</div>
  </div>
</div>
</body>
</html>
