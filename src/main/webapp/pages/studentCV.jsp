<%--
  Created by IntelliJ IDEA.
  User: feilin
  Date: 2016/9/7
  Time: 20:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=GB2312" %>
<%@include file="common.jsp"%>
<html>
<head>
  <script type="text/javascript" src="/js/studentCV.js"></script>
  <title>学生简历</title>
</head>
<body>
<input class="hide idvalue" value="<%=session.getAttribute("id") %>">
<input class="hide" id="cvid">
<div class="table-responsive">
  <table class="table table-striped">
    <thead>
    <tr>
      <th>名称</th>
      <th>值</th></tr>
    </thead>
    <tbody>
    <tr>
      <td class="col-md-4">姓名</td>
      <td class="col-md-8" id="name"></td></tr>
    <tr>
      <td>性别</td>
      <td class="edit" id="sex"></td></tr>
    <tr>
      <td>年级</td>
      <td class="edit" id="grade"></td></tr>
    <tr>
      <td>电话号码</td>
      <td class="edit" id="tellphone"></td></tr>
    <tr>
      <td>QQ</td>
      <td class="edit" id="qq"></td></tr>
    <tr>
      <td>email</td>
      <td class="edit" id="email"></td></tr>
    </tbody>
  </table>
</div>
<div class="form-group">
  <label for="name">经历</label>
  <textarea class="form-control" rows="4" id="experience"></textarea>
</div>
<div class="form-group">
  <label for="name">成果</label>
  <textarea class="form-control" rows="4" id="result"></textarea>
</div>
<div class="form-group">
  <label for="name">其他</label>
  <textarea class="form-control" rows="4" id="other"></textarea>
</div>
<button type="button" class="btn btn-primary btn-lg" id="save">保存</button>
</body>
</html>
