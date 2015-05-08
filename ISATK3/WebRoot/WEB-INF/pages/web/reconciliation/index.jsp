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
<body data-menu="1">
<jsp:include page="/WEB-INF/pages/common/menu.jsp"></jsp:include>
 <div class="container" >
       	<ol class="breadcrumb main" >
		  <li><a href="#"><i class="fa fa-truck"></i> 鄂西快运</a></li>
		  <li  class="active">对账管理</li>
		</ol>
     	<div class="well">
     		<form class="form-inline">
     		  <div class="form-group">
			    <label for="exampleInputEmail3">单号：</label>
			    <input type="email" class="form-control" id="exampleInputEmail3" placeholder="运单号">
			  </div>
     		  <div class="form-group">
			    <label for="exampleInputEmail3">收货点：</label>
				  <select class="form-control">
			      	<optgroup label="武昌">
			      		<option>电脑城</option>
			      		<option>虎泉</option>
			      	</optgroup>
			      </select>
			  </div>
			  <div class="form-group">
			    <label for="exampleInputEmail3">发货时间：</label>
			   <input type="date" class="form-control" placeholder="默认当天" value="2013-04-20">
			  </div>
			  <div class="form-group">
			    <label for="exampleInputEmail3">姓名：</label>
			    <input type="email" class="form-control" id="exampleInputEmail3" placeholder="发货/收货人姓名">
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword3">电话：</label>
			    <input type="password" class="form-control" id="exampleInputPassword3" placeholder="发货/收货人电话">
			  </div>
			  <button type="submit" class="btn btn-default"><i class="fa fa-search"></i> 搜 索</button>
			</form>
     	</div>
		<div class="panel panel-default">
		  <!-- Default panel contents -->
		  <div class="panel-heading"><i class="fa fa-th-list"></i> 对账单 
		  	<div class="pull-right">
		  		<a href="#" class="btn btn-danger btn-xs"><i class="fa fa-check"></i> 确认到账</a>
		  		<a href="#" class="btn btn-default btn-xs"><i class="fa fa-search"></i> 查看已对账</a>
		  	</div>
		  </div>
		
		  <!-- Table -->
		  <table class="table">
		  	<thead>
		  	<tr>
		  		<th><input type="checkbox"></th>
		  		<th>运单号</th>
		  		<th>发货点</th>
		   		<th>发货人</th>
		   		<th>发货电话</th>
		   		<th>收货点</th>
		   		<th>收货人</th>
		   		<th>收货电话</th>
		   		<th>发货时间</th>
		   		<th>运费</th>
		   		<th>代收费</th>
		   		<th>保险费</th>
		   		<th>状态</th>
		   		
		   	</tr>
		   	</thead>
		   	<tbody>
		   	<tr>
		   		<td><input type="checkbox"></td>
		   		<td class="text-danger">001234</td>
		   		<td>电脑城</td>
		   		<td>张三</td>
		   		<td>18987634567</td>
		   		<td>北京</td>
		   		<td>李四</td>
		   		<td>87663927643</td>
		   		<td>2013-04-02</td>
		   		<td>150</td>
		   		<td>2000</td>
		   		<td>0</td>
		   		<td><span class="text-muted">无代收</span></td>
		   	</tr>
		   	<tr><td><input type="checkbox"></td>
		   	<td class="text-danger">001234</td>
		   		<td>电脑城</td>
		   		<td>张三</td>
		   		<td>18987634567</td>
		   		<td>北京</td>
		   		<td>李四</td>
		   		<td>87663927643</td>
		   		<td>2013-04-02</td>
		   		<td>150</td>
		   		<td>2000</td>
		   		<td>0</td>
		   		<td class="text-danger">代收中</td>
		   	</tr>
		   	<tr><td><input type="checkbox"></td>
		   	<td class="text-danger">001234</td>
		   		<td>电脑城</td>
		   		<td>张三</td>
		   		<td>18987634567</td>
		   		<td>北京</td>
		   		<td>李四</td>
		   		<td>87663927643</td>
		   		<td>2013-04-02</td>
		   		<td>150</td>
		   		<td>2000</td>
		   		<td>0</td>
		   		<td><span class="text-success">代收完成</span></td>
		   	</tr>
		   	<tr><td><input type="checkbox"></td><td class="text-danger">001234</td>
		   		<td>电脑城</td>
		   		<td>张三</td>
		   		<td>18987634567</td>
		   		<td>北京</td>
		   		<td>李四</td>
		   		<td>87663927643</td>
		   		<td>2013-04-02</td>
		   		<td>150</td>
		   		<td>2000</td>
		   		<td>0</td>
		   		<td><span class="text-success">代收完成</span></td>
		   	</tr>
		   	<tr><td><input type="checkbox"></td><td class="text-danger">001234</td>
		   		<td>电脑城</td>
		   		<td>张三</td>
		   		<td>18987634567</td>
		   		<td>北京</td>
		   		<td>李四</td>
		   		<td>87663927643</td>
		   		<td>2013-04-02</td>
		   		<td>150</td>
		   		<td>2000</td>
		   		<td>0</td>
		   		<td class="text-danger">代收中</td>
		   	</tr>
		   	</tbody>
		  </table>
		</div>
    </div> <!-- /container -->
<jsp:include page="/WEB-INF/pages/common/foot.jsp"></jsp:include>
</body>
</html>