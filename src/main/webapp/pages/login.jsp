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
    <script type="text/javascript" src="/js/login.js"></script>
    <link href="/css/login.css" rel="stylesheet" />
    <title>登录</title>
</head>
<body class="body">
    <div class="form-container form-body">
        <form id="loginForm">
            <div class="inputs">
            <div class="form-group">
                <h4 class="modal-title">登录</h4>
            </div>
            <div class="form-group">
                <label class="control-label">用户名</label>
                <input type="text" class="form-control" id="username">
            </div>
            <div class="form-group">
                <label class="control-label">密码</label>
                <input type="password" class="form-control" id="password">
            </div>
                <div class="radios clearfloat">
                    <div class="radio radio-public">
                        <label>
                            <input type="radio" name="optionsRadios" id="student" value="student" checked> 学生
                        </label>
                    </div>
                    <div class="radio radio-public">
                        <label>
                            <input type="radio" name="optionsRadios" id="teacher" value="teacher">老师
                        </label>
                    </div>
                    <div class="radio radio-public">
                        <label>
                            <input type="radio" name="optionsRadios" id="manager" value="manager">管理员
                        </label>
                    </div>
                </div>
            <button type="button" class="btn btn-default btn-login" id="submit">Submit</button>
            </div>

        </form>
    </div>
</body>
</html>
