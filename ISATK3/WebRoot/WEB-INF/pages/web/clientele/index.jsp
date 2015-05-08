<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测测SAT欢迎您</title>
<jsp:include page="/WEB-INF/pages/common/head.jsp"></jsp:include>
</head>
<body data-menu="2">
<jsp:include page="/WEB-INF/pages/common/menu.jsp"></jsp:include>
 <div class="container" >
       	<ol class="breadcrumb main" >
		  <li><a href="#"><i class="fa fa-truck"></i> 鄂西快运</a></li>
		  <li  class="active">客户管理</li>
		</ol>
     	<div class="well">
     		<form class="form-inline">
     		 
			  <div class="form-group">
			    <label for="exampleInputEmail3">姓名：</label>
			    <input type="email" class="form-control" id="exampleInputEmail3" placeholder="发货/收货人姓名">
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword3">电话：</label>
			    <input type="password" class="form-control" id="exampleInputPassword3" placeholder="发货/收货人电话">
			  </div>
			   <div class="form-group">
			    <label for="exampleInputPassword3">类型：</label>
			    <select class="form-control">
			      		<option>全部</option>
			      		<option>发货人</option>
			      		<option>收货人</option>
			      	</optgroup>
			      </select>
			  </div>
			  <button type="submit" class="btn btn-default"><i class="fa fa-search"></i> 搜 索</button>
			</form>
     	</div>
		<div class="panel panel-default">
		  <!-- Default panel contents -->
		  <div class="panel-heading"><i class="fa fa-th-list"></i> 对账单 <div class="pull-right"><a href="#" class="btn btn-success btn-xs"><i class="fa fa-plus"></i> 添加客户</a></div></div>
		
		  <!-- Table -->
		  <table class="table">
		  	<thead>
		  	<tr>
		  		<th>姓名</th>
		  		<th>电话</th>
		   		<th>发货方</th>
		   		<th>收货方</th>
		   		<th>运单数（收/付）</th>
		   		<th>代收合计</th>
		   		<th>运费合计</th>
		   		<th>删除/编辑</th>
		   		
		   	</tr>
		   	</thead>
		   	<tbody>
		   	<tr>
		   		<td>张三</td>
		   		<td>18987634567</td>
		   		<td>是</td>
		   		<td>否</td>
		   		<td>100/23</td>
		   		<td>239312</td>
		   		<td>2113</td>
		   		<td>删除/编辑</td>
		   	</tr>
		   	</tbody>
		  </table>
		</div>
    </div> <!-- /container -->
<jsp:include page="/WEB-INF/pages/common/foot.jsp"></jsp:include>
</body>
</html>