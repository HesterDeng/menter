<%--
  Created by IntelliJ IDEA.
  User: feilin
  Date: 2016/9/7
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=GB2312" %>
<%@include file="common.jsp"%>
<html>
<head>
  <script type="text/javascript" src="/plugin/bootstrap/js/bootstrap-table.js"></script>
  <link rel="stylesheet" href="/plugin/bootstrap/css/bootstrap-table.min.css">
  <script type="text/javascript" src="/js/teaList.js"></script>
    <title>����ѡ��ĵ�ʦ�б�</title>
</head>
<body>
<table data-toggle="table" data-url="/student/selectTeas" data-classes="table table-hover"
       data-pagination="true" data-pagination-loop="true" data-side-pagination="server"
       data-search="true" data-show-refresh="true" data-show-columns="true"
       data-show-toggle="true" data-height="500" data-toolbar="#toolbar"
       data-method="post" data-content-type="application/json"
       data-query-params="queryParams">
  <thead>
  <tr>
    <th data-field="id">ID</th>
    <th data-field="name">����</th>
    <th data-field="sex">�Ա�</th>
    <th data-field="xueli">ѧ��</th>
    <th data-field="xuewei">ѧλ</th>
    <th data-field="position">ְ��</th>
    <th data-field="duty">ְ��</th>
    <th data-field="schoolage">����</th>
    <th data-field="tellphone">�ƶ��绰</th>
    <th data-field="email">����</th>
    <th data-field="qq">QQ</th>
    <th data-field="campus">У��</th>
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
          Select Teacher
        </h4>
      </div>
      <div class="modal-body">
        <p>��ȷ��Ҫ���<p id="menter"></p>��ʦ��</p>
      </div>
      <div class="modal-footer">
        <div class="modal-footer">
          <input type="hidden" class="id"/>
          <button type="button" class="btn btn-default" data-dismiss="modal">ȡ��</button>
          <a  onclick="addSubmit()" class="btn btn-success" data-dismiss="modal">ȷ��</a>
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
          Teacher CV
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
