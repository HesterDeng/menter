<%--
  Created by IntelliJ IDEA.
  User: feilin
  Date: 2016/9/7
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=GB2312" %>
<%@include file="common.jsp"%>
<html>
<head>
  <script type="text/javascript" src="/js/score.js"></script>
    <title>评价分数及建议</title>
</head>
<body>
<form class="form-horizontal" role="form">
  <div class="form-group">
    <label for="advice" class="col-sm-2 control-label">你的建议</label>
    <div class="col-sm-10">
      <textarea rows="4" class="form-control" id="advice"></textarea>
    </div>
  </div>
  <div class="form-group">
    <label class="col-sm-2 control-label">你的分数</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="mark">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default" id="addMark">确定</button>
    </div>
  </div>
</form>
</body>
</html>
