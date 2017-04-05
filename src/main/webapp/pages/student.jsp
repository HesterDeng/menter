<%--
  Created by IntelliJ IDEA.
  User: feilin
  Date: 2016/8/21
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=GB2312" %>
<%@include file="common.jsp"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>学生姓名</title>
</head>
<body>
<nav class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-left cbp-spmenu-open active" id="cbp-spmenu-s1">
  <h3>目录</h3>
  <a onclick="showTab('简历','/pages/studentCV.jsp')">简历</a>
  <a onclick="showTab('导师列表','/pages/teaList.jsp')">导师列表</a>
  <a onclick="showTab('选择导师列表','/pages/selectTea.jsp')">选择导师列表</a>
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
