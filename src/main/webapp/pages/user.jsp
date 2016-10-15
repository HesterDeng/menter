<%--
  Created by IntelliJ IDEA.
  User: feilin
  Date: 2016/8/20
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=GB2312" %>
<%@include file="common.jsp"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script type="text/javascript" src="/plugin/bootstrap/js/bootstrap-table.js"></script>
  <link rel="stylesheet" href="/plugin/bootstrap/css/bootstrap-table.min.css">
  <script type="text/javascript" src="/js/user.js"></script>
  <link rel="stylesheet" href="/css/user.css">
    <title></title>
</head>
<body>
<table data-toggle="table" data-url="/user/list" data-classes="table table-hover"
       data-pagination="true" data-pagination-loop="true" data-side-pagination="server"
       data-search="true" data-show-refresh="true" data-show-columns="true"
       data-show-toggle="true" data-height="500" data-toolbar="#toolbar"
        data-method="post" data-content-type="application/json" data-data-type="json"
       data-query-params="queryParams">
  <thead>
  <tr>
    <th data-field="id">ID</th>
    <th data-field="username">�û���</th>
    <th data-field="roleid">��ɫid</th>
    <th data-formatter="actionFormatter" data-events="actionEvents">����</th>
  </tr>
  </thead>
</table>

<!-- ģ̬��Modal�� -->
<div class="modal fade" id="addModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title">
                    Add User
                </h4>
            </div>
            <div class="modal-body">
                <div class="form-group">
                    <label class="control-label">�û���</label>
                    <input type="text" class="form-control" id="username">
                </div>
                <div class="form-group">
                    <label class="control-label">����</label>
                    <input type="password" class="form-control" id="password">
                </div>
                <div class="form-group">
                    <label class="control-label">��ɫ</label>
                    <input type="text" class="form-control" id="roleid">
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">�ر�
                </button>
                <button type="button" class="btn btn-primary" onclick="addUser()" data-dismiss="modal">
                    ���
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

<!-- ģ̬��Modal������ -->
<div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title">
                    Update User
                </h4>
            </div>
            <div class="modal-body">
                <div class="form-group">
                    <label class="control-label">�û���</label>
                    <input type="text" class="form-control" id="usernamenew">
                </div>
                <div class="form-group">
                    <label class="control-label">����</label>
                    <input type="password" class="form-control" id="passwordnew">
                </div>
                <div class="form-group">
                    <label class="control-label">��ɫ</label>
                    <input type="text" class="form-control" id="roleidnew">
                </div>
            </div>
            <div class="modal-footer">
                <input type="hidden" class="id"/>
                <button type="button" class="btn btn-default" data-dismiss="modal">�ر�
                </button>
                <button type="button" class="btn btn-primary" onclick="editUser()" data-dismiss="modal">
                    ����
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

<!-- ��Ϣɾ��ȷ�� -->
<!-- ģ̬��Modal�� -->
<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title">
                    Delete User
                </h4>
            </div>
            <div class="modal-body">
                <p>��ȷ��Ҫɾ����</p>
            </div>
            <div class="modal-footer">
                <div class="modal-footer">
                    <input type="hidden" class="id"/>
                    <button type="button" class="btn btn-default" data-dismiss="modal">ȡ��</button>
                    <a  onclick="deleteSubmit()" class="btn btn-success" data-dismiss="modal">ȷ��</a>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
</body>
</html>
