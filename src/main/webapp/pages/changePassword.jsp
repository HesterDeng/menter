<%--
  Created by IntelliJ IDEA.
  User: feilin
  Date: 2016/9/21
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=GB2312" %>
<%@include file="common.jsp"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script type="text/javascript" src="/js/changePassword.js"></script>
    <title>更改密码</title>
</head>
<body>
<div class=".container" style="margin-top:100px;width:250%;">
  <form class="form-horizontal" role="form">
    <div class="form-group">
      <label for="newpass" class="col-sm-2 control-label">新密码</label>
      <div class="col-sm-10">
        <input type="password" class="form-control" style="width:250px;" id="newpass" placeholder="New Password"><span id="newpassTip" style="display:none;color:red;"></span>
      </div>
    </div>
    <div class="form-group">
      <label for="newpassAgain" class="col-sm-2 control-label">再次确认新密码</label>
      <div class="col-sm-10">
        <input type="password" class="form-control" style="width:250px;" id="newpassAgain" placeholder="Again New Password"><span id="newpassAgainTip" style="display:none;color:red;"></span>
      </div>
    </div>
    <div class="form-group">
      <label class="col-sm-2 control-label">  </label>
      <button type="submit" class="btn btn-primary" id="submit" style="text-align:center;">确认修改</button>
    </div>
  </form>
</div>
<div id="modifySuccess" class="alert alert-success alert-dismissable" style="width:50%;margin-left:40%;display:none;">
  <strong>Success!</strong> 你已成功修改密码！
</div>
</body>
</html>
