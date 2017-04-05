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
  <script type="text/javascript" src="/js/selectStu.js"></script>
    <title>导师选择的学生列表</title>
</head>
<body>
<table data-toggle="table" data-url="/teacher/selectStudents" data-classes="table table-hover"
       data-pagination="true" data-pagination-loop="true" data-side-pagination="server"
       data-search="true" data-show-refresh="true" data-show-columns="true"
       data-show-toggle="true" data-height="500" data-toolbar="#toolbar"
       data-method="post" data-content-type="application/json" data-data-type="json"
       data-query-params="queryParams">
  <thead>
  <tr>
    <th data-field="id">ID</th>
    <th data-field="name">姓名</th>
    <th data-field="sex">性别</th>
    <th data-field="grade">年级/班级</th>
    <th data-field="tellphone">移动电话</th>
    <th data-field="email">邮箱</th>
    <th data-field="qq">QQ</th>
    <th data-field="cvid" data-formatter="nameFormatter">简历</th>
    <th data-formatter="actionFormatter" data-events="actionEvents">操作</th>
  </tr>
  </thead>
</table>

<!-- 信息删除确认 -->
<!-- 模态框（Modal） -->
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
        <p>您确认要删除吗？</p>
      </div>
      <div class="modal-footer">
        <div class="modal-footer">
          <input type="hidden" class="id"/>
          <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
          <a  onclick="deleteSubmit()" class="btn btn-success" data-dismiss="modal">确定</a>
        </div>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal -->
</div>

<!-- 模态框（Modal） -->
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
            <h3 class="panel-title">经历</h3>
          </div>
          <div class="panel-body" id="experience">
          </div>
        </div>
        <div class="panel panel-success">
          <div class="panel-heading">
            <h3 class="panel-title">成就</h3>
          </div>
          <div class="panel-body" id="result">
          </div>
        </div>
        <div class="panel panel-info">
          <div class="panel-heading">
            <h3 class="panel-title">其他</h3>
          </div>
          <div class="panel-body" id="other">
          </div>
        </div>
      </div>
      <div class="modal-footer">
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        </div>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal -->
</div>
</body>
</html>
