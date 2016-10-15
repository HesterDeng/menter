<%--
  Created by IntelliJ IDEA.
  User: xheart
  Date: 2016/8/8
  Time: 11:04
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
  <script type="text/javascript" src="/js/teacherList.js"></script>
    <title>老师</title>
</head>
<body>
<table data-toggle="table" data-url="/teacher/list" data-classes="table table-hover"
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
    <th data-field="xueli">学历</th>
    <th data-field="xuewei">学位</th>
    <th data-field="position">职称</th>
    <th data-field="duty">职务</th>
    <th data-field="schoolage">教龄</th>
    <th data-field="tellphone">移动电话</th>
    <th data-field="email">邮箱</th>
    <th data-field="qq">QQ</th>
    <th data-field="campus">校区</th>
    <th data-field="cvid" data-formatter="nameFormatter">简历</th>
    <th data-formatter="actionFormatter" data-events="actionEvents">操作</th>
  </tr>
  </thead>
</table>
<!-- 模态框（Modal） -->
<div class="modal fade" id="addModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
          &times;
        </button>
        <h4 class="modal-title">
          Add Teacher
        </h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label class="control-label">用户名</label>
          <input type="text" class="form-control" id="name">
        </div>
        <div class="form-group">
          <label class="control-label">密码</label>
          <input type="password" class="form-control" id="password">
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
        </button>
        <button type="button" class="btn btn-primary" onclick="addUser()" data-dismiss="modal">
          添加
        </button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal -->
</div>

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
          Delete Teacher
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
          Teacher CV
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
