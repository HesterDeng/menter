<%@ page language="java" import="java.util.*" contentType="text/html; charset=GB2312" %>
<%@include file="common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <script type="text/javascript" src="/js/manager.js"></script>
    <link href="/css/common.css" rel="stylesheet" />
    <title>��ҳ</title>
</head>
<body>
<nav class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-left cbp-spmenu-open active" id="cbp-spmenu-s1">
    <h3>Ŀ¼</h3>
    <a onclick="showTab('��ɫ����','/pages/role.jsp')">��ɫ����</a>
    <a onclick="showTab('����Ա����','/pages/user.jsp')">����Ա����</a>
    <a onclick="showTab('ѧ������','/pages/studentList.jsp')">ѧ������</a>
    <a onclick="showTab('��ʦ����','/pages/teacherList.jsp')">��ʦ����</a>
    <a onclick="showTab('ϵͳ����','/pages/system.jsp')">ϵͳ����</a>
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