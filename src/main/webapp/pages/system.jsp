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
  <script src="/js/system.js"></script>
    <title></title>
</head>
<body>
<form class="form-horizontal" role="form">
  <div class="form-group">
    <label class="col-sm-2 control-label">��ʦ����ѡ��������</label>
    <div class="col-sm-5">
      <p class="form-control-static" id="teacherNumber"></p>
    </div>
    <div class="col-md-5"><button type="button" class="btn btn-default" data-target="#teacherModal" data-toggle="modal">����</button></div>
  </div>
  <div class="form-group">
    <label class="col-sm-2 control-label">ѧ������ѡ��������</label>
    <div class="col-sm-5">
      <p class="form-control-static" id="studentNumber"></p>
    </div>
    <div class="col-md-5"><button type="button" class="btn btn-default" data-target="#studentModal" data-toggle="modal">����</button></div>
  </div>
  <div class="form-group">
    <label class="col-sm-2 control-label">ϵͳ�����ܷ�</label>
    <div class="col-sm-10">
      <p class="form-control-static" id="marksum"></p>
    </div>
  </div>
  <div class="form-group">
    <label class="col-sm-2 control-label">�������ֵ�����</label>
    <div class="col-sm-10">
      <p class="form-control-static" id="usernumber"></p>
    </div>
  </div>
  <div class="form-group">
    <label class="col-sm-2 control-label">ϵͳ�÷ֵ�ƽ����</label>
    <div class="col-sm-10">
      <p class="form-control-static" id="avg"></p>
    </div>
  </div>
  <div class="form-group">
    <button type="button" class="btn btn-primary btn-lg btn-block" onclick="isResult()">
      �ж�����ѧ���Ƿ�ѡ��
    </button>
  </div>
  <div class="panel panel-primary">
    <div class="panel-heading">
      <h3 class="panel-title">�����ۺ�</h3>
    </div>
    <div class="panel-body" id="advice">
    </div>
  </div>
</form>
<!-- ģ̬��Modal�� -->
<div class="modal fade" id="teacherModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
          &times;
        </button>
        <h4 class="modal-title">
          Update Teacher Number
        </h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label class="control-label">��ʦ����ѡ��������</label>
          <input type="text" class="form-control" id="teachernumbernew">
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">�ر�
        </button>
        <button type="button" class="btn btn-primary" onclick="updateTeacher()" data-dismiss="modal">
          ȷ��
        </button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal -->
</div>

<!-- ģ̬��Modal�� -->
<div class="modal fade" id="studentModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
          &times;
        </button>
        <h4 class="modal-title">
          Update Student Number
        </h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label class="control-label">ѧ������ѡ��������</label>
          <input type="text" class="form-control" id="studentnumbernew">
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">�ر�
        </button>
        <button type="button" class="btn btn-primary" onclick="updateStudent()" data-dismiss="modal">
          ȷ��
        </button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal -->
</div>
</body>
</html>
