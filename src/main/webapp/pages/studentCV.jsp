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
  <title>ѧ������</title>
</head>
<body>
<input class="hide idvalue" value="<%=session.getAttribute("id") %>">
<input class="hide" id="cvid">
<div class="table-responsive">
  <table class="table table-striped">
    <thead>
    <tr>
      <th>����</th>
      <th>ֵ</th></tr>
    </thead>
    <tbody>
    <tr>
      <td class="col-md-4">����</td>
      <td class="col-md-8" id="name"></td></tr>
    <tr>
      <td>�Ա�</td>
      <td class="edit" id="sex"></td></tr>
    <tr>
      <td>�꼶</td>
      <td class="edit" id="grade"></td></tr>
    <tr>
      <td>�绰����</td>
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
  <label for="name">����</label>
  <textarea class="form-control" rows="4" id="experience"></textarea>
</div>
<div class="form-group">
  <label for="name">�ɹ�</label>
  <textarea class="form-control" rows="4" id="result"></textarea>
</div>
<div class="form-group">
  <label for="name">����</label>
  <textarea class="form-control" rows="4" id="other"></textarea>
</div>
<button type="button" class="btn btn-primary btn-lg" id="save">����</button>
</body>
</html>
