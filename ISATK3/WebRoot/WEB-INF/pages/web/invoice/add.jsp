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
<body  data-menu="0">
<jsp:include page="/WEB-INF/pages/common/menu.jsp"></jsp:include>
<div class="container">
	<ol class="breadcrumb main" >
		  <li><a href="#"><i class="fa fa-truck"></i> 鄂西快运</a></li>
		  <li><a href="#">发货单</a></li>
		  <li  class="active">新增发货单</li>
		</ol>
      <div class="jumbotron">
       <form class="form-horizontal">
        <div class="form-group">
		    <label class="col-sm-2 control-label">发货时间</label>
		    <div class="col-sm-4">
		      <input type="date" class="form-control" placeholder="默认当天" value="2013-04-20" name="faTime" />
		    </div>
		    <label class="col-sm-2 control-label">单号</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" placeholder="运单号" name="faNo">
		    </div>
		  </div>
        <div class="form-group">
		    <label class="col-sm-2 control-label">发货点</label>
		    <div class="col-sm-4">
		      <select class="form-control" name="faPoint">
		      <c:forEach var="fa" items="${fa }">
		      	<option id="${fa.id }">${fa.name }</option>
		      </c:forEach>
		      </select>
		    </div>
		    <label class="col-sm-2 control-label">到货点</label>
		    <div class="col-sm-4">
		       <select class="form-control" name="soPoint">
		      	<c:forEach var="so" items="${so }">
			      	<option id="${so.id }">${so.name }</option>
			      </c:forEach>
		      </select>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">发货人</label>
		    <div class="col-sm-4">
		    	<div class="input-group">
		      		<input type="email" class="form-control" id="inputEmail3" placeholder="发货人名称" name="faClientele">
		      		  <span class="input-group-btn">
				        <button class="btn btn-default" type="button">选择</button>
				      </span>
		      	</div>
		    </div>
		    <label class="col-sm-2 control-label">发货电话</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" id="inputPassword3" placeholder="座机/手机" name="faPhone">
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">收货人</label>
		    <div class="col-sm-4">
		    	<div class="input-group">
		      		<input type="email" class="form-control" id="inputEmail3" placeholder="收货人名称" name="soClientele">
		      		  <span class="input-group-btn">
				        <button class="btn btn-default" type="button">选择</button>
				      </span>
		      	</div>
		    </div>
		    <label class="col-sm-2 control-label">收货电话</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" id="inputPassword3" placeholder="座机/手机" name="soPhone">
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">运费</label>
		    <div class="col-sm-4">
		      <div class="input-group">
				  <span class="input-group-addon">¥</span>
				  <input type="number" class="form-control" aria-label="Amount (to the nearest dollar)" name="freight">
				  <span class="input-group-addon">.00</span>
				</div>
		    </div>
		    <label class="col-sm-2 control-label">代收金额</label>
		    <div class="col-sm-4">
		      <div class="input-group">
				  <span class="input-group-addon">¥</span>
				  <input type="number" class="form-control" aria-label="Amount (to the nearest dollar)" name="collection">
				  <span class="input-group-addon">.00</span>
				</div>
		    </div>
		  </div>
		  <div class="form-group">
		    <label  class="col-sm-2 control-label">运费-付款方式</label>
		    <div class="col-sm-4">
		    	<label class="radio-inline">
				  <input type="radio" name="freightWay" id="freightWay2" value="0"> (自)已付
				</label>
				<label class="radio-inline">
				  <input type="radio" name="freightWay" id="freightWay1" value="1">  到付
				</label>
		    </div>
		    <label class="col-sm-2 control-label">代收-付款方式</label>
		    <div class="col-sm-4">
		       	<label class="radio-inline">
				  <input type="radio" name="collectionWay" id="freightWay2" value="0"> 现金
				</label>
				<label class="radio-inline">
				  <input type="radio" name="collectionWay" id="freightWay1" value="1">  银行
				</label>
		      </select>
		    </div>
		  </div>
		  <div class="form-group">
		    <label  class="col-sm-2 control-label">收货方式</label>
		    <div class="col-sm-4">
		      <label class="radio-inline">
				  <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="0"> 自提&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				</label>
				<label class="radio-inline">
				  <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="1">  送货
				</label>
		    </div>
		    <label class="col-sm-2 control-label">银行</label>
		    <div class="col-sm-4">
		       <select class="form-control">
		       	  <c:forEach var="v" items="${bankNames }">
			      	<option id="${v.code }">${v.name }（${v.code }）</option>
			      </c:forEach>
		      </select>
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-primary"><i class="fa fa-floppy-o"></i> 保 存</button>&nbsp;&nbsp;&nbsp;&nbsp;
		      <a href="${appPath }/invoice/mine.html" class="btn btn-default"><i class="fa fa-history"></i> 取消</a>
		    </div>
		  </div>
		</form>
      </div>
		<div class="panel panel-default">
		  <!-- Default panel contents -->
		  <div class="panel-heading"><i class="fa fa-th-list"></i> 货物明细 <div class="pull-right" data-toggle="tooltip" data-placement="top" title="如果有明细，货物名称必须填写！"><i class="fa fa-question-circle text-danger"></i></div></div>
		
		  <!-- Table -->
		  <table class="table">
		  	<thead>
		  	<tr>
		   		<th>名称</th>
		   		<th>件数</th>
		   		<th>保险费（¥）</th>
		   	</tr>
		   	</thead>
		   	<tbody>
			   	<tr>
			   		<td><input type="text" class="form-control" placeholder="货物名称"></td>
			   		<td><input type="text" class="form-control" placeholder="平方米"></td>
			   		<td><input type="text" class="form-control" placeholder="千分之三"></td>
			   	</tr>
		   		<tr>
			   		<td><input type="text" class="form-control" placeholder="货物名称"></td>
			   		<td><input type="text" class="form-control" placeholder="平方米"></td>
			   		<td><input type="text" class="form-control" placeholder="千分之三"></td>
			   	</tr><tr>
			   		<td><input type="text" class="form-control" placeholder="货物名称"></td>
			   		<td><input type="text" class="form-control" placeholder="平方米"></td>
			   		<td><input type="text" class="form-control" placeholder="千分之三"></td>
			   	</tr><tr>
			   		<td><input type="text" class="form-control" placeholder="货物名称"></td>
			   		<td><input type="text" class="form-control" placeholder="平方米"></td>
			   		<td><input type="text" class="form-control" placeholder="千分之三"></td>
			   	</tr><tr>
			   		<td><input type="text" class="form-control" placeholder="货物名称"></td>
			   		<td><input type="text" class="form-control" placeholder="平方米"></td>
			   		<td><input type="text" class="form-control" placeholder="千分之三"></td>
			   	</tr><tr>
			   		<td><input type="text" class="form-control" placeholder="货物名称"></td>
			   		<td><input type="text" class="form-control" placeholder="平方米"></td>
			   		<td><input type="text" class="form-control" placeholder="千分之三"></td>
			   	</tr><tr>
			   		<td><input type="text" class="form-control" placeholder="货物名称"></td>
			   		<td><input type="text" class="form-control" placeholder="平方米"></td>
			   		<td><input type="text" class="form-control" placeholder="千分之三"></td>
			   	</tr>
		   	</tbody>
		  </table>
		</div>
    </div> <!-- /container -->
<jsp:include page="/WEB-INF/pages/common/foot.jsp"></jsp:include>
</body>
</html>