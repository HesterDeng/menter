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
    <title>ѧ������</title>
</head>
<body>
<nav class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-left cbp-spmenu-open active" id="cbp-spmenu-s1">
  <h3>Ŀ¼</h3>
  <a onclick="showTab('����','/pages/studentCV.jsp')">����</a>
  <a onclick="showTab('��ʦ�б�','/pages/teaList.jsp')">��ʦ�б�</a>
  <a onclick="showTab('ѡ��ʦ�б�','/pages/selectTea.jsp')">ѡ��ʦ�б�</a>
  <a onclick="showTab('ϵͳ����','/pages/score.jsp')">ϵͳ����</a>
  <a onclick="closeSession()">�˳�</a>
</nav>
<div class="main-container">
  <div class="tab">
    <h1>welcome</h1>
    <div>��ӭʹ�õ�ʦѡ��ϵͳ����ѡ��˵����в���.</div>
  </div>
</div>
</body>
</html>
