<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="/js/manager.js"></script>
    <link href="/css/common.css" rel="stylesheet" />
    <title>主页</title>
</head>
<body>
<nav class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-left cbp-spmenu-open active" id="cbp-spmenu-s1">
    <h3>目录</h3>
    <a onclick="showTab('角色管理','/pages/role.jsp')">角色管理</a>
    <a onclick="showTab('管理员管理','/pages/user.jsp')">管理员管理</a>
    <a onclick="showTab('学生管理','/pages/studentList.jsp')">学生管理</a>
    <a onclick="showTab('导师管理','/pages/teacherList.jsp')">导师管理</a>
    <a onclick="showTab('系统设置','/pages/system.jsp')">系统设置</a>
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