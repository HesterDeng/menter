<%--
  Created by IntelliJ IDEA.
  User: xheart
  Date: 2016/8/8
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=GB2312" %>
<%@include file="common.jsp"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script type="text/javascript" src="/plugin/bootstrap/js/bootstrap-table.js"></script>
  <script type="text/javascript" src="/js/studentList.js"></script>
  <link rel="stylesheet" href="/plugin/bootstrap/css/bootstrap-table.min.css">
    <title>ѧ��</title>
</head>
<body>
<table data-toggle="table" data-url="/student/list" data-classes="table table-hover"
       data-pagination="true" data-pagination-loop="true" data-side-pagination="server"
       data-search="true" data-show-refresh="true" data-show-columns="true"
       data-show-toggle="true" data-height="500" data-toolbar="#toolbar"
       data-method="post" data-content-type="application/json" data-data-type="json"
       data-query-params="queryParams">
  <thead>
  <tr>
    <th data-field="id">ID</th>
    <th data-field="name">����</th>
    <th data-field="sex">�Ա�</th>
    <th data-field="grade">�꼶/�༶</th>
    <th data-field="tellphone">�ƶ��绰</th>
    <th data-field="email">����</th>
    <th data-field="qq">QQ</th>
    <th data-field="cvid" data-formatter="nameFormatter">����</th>
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
          Add Student
        </h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label class="control-label">�û���</label>
          <input type="text" class="form-control" id="name">
        </div>
        <div class="form-group">
          <label class="control-label">����</label>
          <input type="password" class="form-control" id="password">
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
          Delete Student
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

<!-- ģ̬��Modal�� -->
<div class="modal fade" id="cvModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
          &times;
        </button>
        <h4 class="modal-title">
          Student CV
        </h4>
      </div>
      <div class="modal-body">
        <div class="panel panel-primary">
          <div class="panel-heading">
            <h3 class="panel-title">����</h3>
          </div>
          <div class="panel-body" id="experience">
          </div>
        </div>
        <div class="panel panel-success">
          <div class="panel-heading">
            <h3 class="panel-title">�ɾ�</h3>
          </div>
          <div class="panel-body" id="result">
          </div>
        </div>
        <div class="panel panel-info">
          <div class="panel-heading">
            <h3 class="panel-title">����</h3>
          </div>
          <div class="panel-body" id="other">
          </div>
        </div>
      </div>
      <div class="modal-footer">
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">�ر�</button>
        </div>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal -->
</div>
</body>
</html>
