<%--
  Created by IntelliJ IDEA.
  User: xheart
  Date: 2016/8/5
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=GB2312" %>
<%@include file="common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <script type="text/javascript" src="/js/login.js"></script>
    <link href="/css/login.css" rel="stylesheet" />
    <title>��¼</title>
</head>
<body class="body">
    <div class="form-container form-body">
        <form id="loginForm">
            <div class="inputs">
            <div class="form-group">
                <h4 class="modal-title">��¼</h4>
            </div>
            <div class="form-group">
                <label class="control-label">�û���</label>
                <input type="text" class="form-control" id="username">
            </div>
            <div class="form-group">
                <label class="control-label">����</label>
                <input type="password" class="form-control" id="password">
            </div>
                <div class="radios clearfloat">
                    <div class="radio radio-public">
                        <label>
                            <input type="radio" name="optionsRadios" id="student" value="student" checked> ѧ��
                        </label>
                    </div>
                    <div class="radio radio-public">
                        <label>
                            <input type="radio" name="optionsRadios" id="teacher" value="teacher">��ʦ
                        </label>
                    </div>
                    <div class="radio radio-public">
                        <label>
                            <input type="radio" name="optionsRadios" id="manager" value="manager">����Ա
                        </label>
                    </div>
                </div>
            <button type="button" class="btn btn-default btn-login" id="submit">Submit</button>
            </div>

        </form>
    </div>
</body>
</html>
