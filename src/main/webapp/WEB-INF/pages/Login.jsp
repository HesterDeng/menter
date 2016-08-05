<%--
  Created by IntelliJ IDEA.
  User: xheart
  Date: 2016/8/5
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="http://localhost:8080/WEB-INF/plugin/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/WEB-INF/plugin/js/jquery/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="/WEB-INF/js/login.js"></script>
    <script type="text/css" src="/WEB-INF/css/login.css"></script>
    <title>登录</title>
</head>
<body class="body">
    <div class="form-container">
        <form>
            <div class="form-group">
                <label>登录</label>
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">用户名</label>
                <input type="email" class="form-control" id="exampleInputEmail1">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">密码</label>
                <input type="password" class="form-control" id="exampleInputPassword1">
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
        </form>
    </div>
</body>
</html>
