<%--
  Created by IntelliJ IDEA.
  User: xheart
  Date: 2016/8/5
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="http://localhost:8080/js/login.js"></script>
    <link href="http://localhost:8080/css/login.css" rel="stylesheet" />
    <title>登录</title>
</head>
<body class="body">
    <div class="form-container">
        <form id="loginForm">
            <div class="form-group">
                <h4 class="modal-title">登录</h4>
            </div>
            <div class="form-group">
                <label class="control-label">用户名</label>
                <input type="text" class="form-control">
            </div>
            <div class="form-group">
                <label class="control-label">密码</label>
                <input type="password" class="form-control">
            </div>
            <button type="button" class="btn btn-default" id="submit">Submit</button>
        </form>
    </div>
</body>
</html>
