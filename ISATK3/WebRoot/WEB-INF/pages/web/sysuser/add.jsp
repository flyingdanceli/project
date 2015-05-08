<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>鄂西快运欢迎您</title>
<jsp:include page="/WEB-INF/pages/common/head.jsp"></jsp:include>
<script type="text/javascript">
	if("${res}"){
		alert("${res}");
	}
	function saveUser(){
		user_form.action = "${appPath }/sysUser/saveUser.mo";
		user_form.submit();
	}
</script>
</head>
<body  data-menu="0">
<jsp:include page="/WEB-INF/pages/common/menu.jsp"></jsp:include>
<div class="container">
      <div class="jumbotron">
       <form class="form-horizontal" id="user_form">
       <input type="hidden" id="id" name="id" value="${user.id }" />
        <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">登录帐号</label>
		    <div class="col-sm-4">
		      <input type="text" id="loginName" name="loginName" class="form-control" placeholder="登录帐号" value="${user.loginName }">
		    </div>
		    <label for="inputPassword3" class="col-sm-2 control-label">姓名</label>
		    <div class="col-sm-4">
		      <input type="text" id="name" name="name" class="form-control" placeholder="姓名" value="${user.name }">
		    </div>
		  </div>
        <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">发货权限</label>
		    <div class="col-sm-4">
		      <select class="form-control" id="faRange" name="faRange">
		      	<option value="0" <c:if test="${user.faRange=='0' }">selected</c:if>>否</option>
		      	<option value="1" <c:if test="${user.faRange=='1' }">selected</c:if>>是</option>
		      </select>
		    </div>
		    <label for="inputPassword3" class="col-sm-2 control-label">接受权限</label>
		    <div class="col-sm-4">
		       <select class="form-control" id="soRange" name="soRange">
		      	<option value="0" <c:if test="${user.soRange=='0' }">selected</c:if>>否</option>
		      	<option value="1" <c:if test="${user.soRange=='1' }">selected</c:if>>是</option>
		      </select>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">录入时间 <fmt:formatDate value='${user.insTime }'/></label>
		    <div class="col-sm-4">
		      <input type="date" id="insTime" name="insTime" class="form-control" placeholder="录入时间" value="">
		    </div>
		    <label for="inputPassword3" class="col-sm-2 control-label">是否禁用</label>
		    <div class="col-sm-4">
		      <select class="form-control" id="isDisable" name="isDisable">
		      	<option value="0" <c:if test="${user.isDisable=='0' }">selected</c:if>>否</option>
		      	<option value="1" <c:if test="${user.isDisable=='1' }">selected</c:if>>是</option>
		      </select>
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="button" class="btn btn-primary" onclick="saveUser()"><i class="fa fa-floppy-o"></i> 保 存</button>&nbsp;&nbsp;&nbsp;&nbsp;
		      <a href="${appPath }/sysUser/userIndex.html" class="btn btn-default"><i class="fa fa-history"></i> 取消</a>
		    </div>
		  </div>
		</form>
      </div>		
    </div> <!-- /container -->
<jsp:include page="/WEB-INF/pages/common/foot.jsp"></jsp:include>
</body>
</html>