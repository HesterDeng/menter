<%--
  Created by IntelliJ IDEA.
  User: feilin
  Date: 2016/9/7
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common.jsp"%>
<html>
<head>
  <script type="text/javascript" src="/plugin/bootstrap/js/bootstrap-table.js"></script>
  <link rel="stylesheet" href="/plugin/bootstrap/css/bootstrap-table.min.css">
  <script type="text/javascript" src="/js/teaList.js"></script>
    <title>可以选择的导师列表</title>
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
          Select Teacher
        </h4>
      </div>
      <div class="modal-body">
        <p>您确认要添加<p id="menter"></p>导师吗？</p>
      </div>
      <div class="modal-footer">
        <div class="modal-footer">
          <input type="hidden" class="id"/>
          <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
          <a  onclick="addSubmit()" class="btn btn-success" data-dismiss="modal">确定</a>
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
        <h1>经历</h1>
        <p class="lead" id="experience"></p>
        <h1>成就</h1>
        <p class="lead" id="result"></p>
        <h1>其他</h1>
        <p class="lead" id="other"></p>
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
