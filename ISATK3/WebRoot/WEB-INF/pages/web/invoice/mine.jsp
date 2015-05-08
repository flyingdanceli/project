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
<body data-menu="0">
<jsp:include page="/WEB-INF/pages/common/menu.jsp"></jsp:include>
 <div class="container" >
       	<ol class="breadcrumb main" >
		  <li><a href="#"><i class="fa fa-truck"></i> 鄂西快运</a></li>
		  <li  class="active">发货单</li>
		</ol>
		<form class="form-inline" id="pagerForm" action="${appPath}/web/user/message/query.html" method="post">
     	<div class="well">
     		
				<input type="hidden" name="pageNum" value="1">
			  <div class="form-group">
			    <label for="exampleInputEmail3">姓名：</label>
			    <input type="email" class="form-control" id="exampleInputEmail3" placeholder="发货/收货人姓名">
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword3">电话：</label>
			    <input type="password" class="form-control" id="exampleInputPassword3" placeholder="发货/收货人电话">
			  </div>
			  <button type="submit" class="btn btn-default"><i class="fa fa-search"></i> 搜 索</button>
			
     	</div>
		<div class="panel panel-default">
		  <!-- Default panel contents -->
		  <div class="panel-heading"><i class="fa fa-th-list"></i> 我的发货单 <div class="pull-right"><a href="${appPath }/invoice/add.html" class="btn btn-success btn-xs"><i class="fa fa-plus"></i> 添加</a></div></div>
		
		  <!-- Table -->
		  <table class="table">
		  	<thead>
		  	<tr>
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
		   	<c:forEach items="${page.dataList}" var="v" varStatus="s">
			   	<tr>
			   		<td class="text-danger">${v.faNo }</td>
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
		   	</c:forEach>
		   	</tbody>
		  </table>
		</div>
		<hr />
					<div class="panelBar row" >
				        <div class="pages col-md-3 pagination">
				            <span>&nbsp;每页&nbsp;</span>
				            <span class="sel">
				            ${page.pageSize }
				            </span>
				            <span>&nbsp;条，共 ${page.lastRowNum} 条</span>
				        </div>
				        <div class="pagination-box col-md-9" totalcount="${page.lastRowNum}" numperpage="20" pagenumshown="10" currentpage="${page.pageNum}">
				        	<nav class="pull-right">
							  <ul class="pagination">
							   
							  </ul>
							</nav>
				        </div>
				    </div>
		</form>
    </div> <!-- /container -->
<jsp:include page="/WEB-INF/pages/common/foot.jsp"></jsp:include>
</body>
</html>