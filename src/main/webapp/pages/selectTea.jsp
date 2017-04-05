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
  <script type="text/javascript" src="/js/selectTea.js"></script>
    <title>ѧ����ѡ�б�</title>
</head>
<body>
<table data-toggle="table" data-url="/student/teachers" data-classes="table table-hover"
       data-pagination="true" data-pagination-loop="true" data-side-pagination="server"
       data-show-refresh="true" data-show-columns="true"
       data-show-toggle="true" data-height="500" data-toolbar="#toolbar"
       data-method="get">
  <thead>
  <tr>
    <th data-field="id" class="hide">id</th>
    <th data-field="listnumber">����</th>
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
    <th data-formatter="actionFormatter" data-events="actionEvents" class="option">����</th>
  </tr>
  </thead>
</table>
<button type="button" class="btn btn-primary btn-lg btn-block option" data-target="#isselectModal" data-toggle="modal">ȷ���ύ</button>
<!-- ģ̬��Modal�� -->
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
        <p>��ȷ��Ҫɾ��<p id="menter"></p>��ʦ��</p>
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
<div class="modal fade" id="isselectModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
          &times;
        </button>
      </div>
      <div class="modal-body">
        <p>��ʦ�б�һ��ȷ�������ɸ��ģ�������ѡ����ȷ�ϵ�ʦ�б�������</p>
      </div>
      <div class="modal-footer">
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">ȡ��</button>
          <a  onclick="submitSelect()" class="btn btn-success" data-dismiss="modal">ȷ��</a>
        </div>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal -->
</div>
</body>
</html>
