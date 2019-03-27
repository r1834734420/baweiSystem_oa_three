<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/menuSet.js"></script>
<script type="text/javascript">
	$(function(){
		menuShow('${pageContext.request.contextPath}','2');
	});
</script>
<title>角色列表</title>
</head>
<body>
<div class="container" style="width: 100%;padding: 25px 15px;">
	<div class="row clearfix">
		<div class="col-md-12 column" style="padding: 20px;">
			<div style="float: left;padding-bottom: 10px;" id="condition">
			</div>
			<div style="float: right;padding-bottom: 10px;padding-right: 30px;">
				<input type="button" class="btn btn-primary btn" value="更新" onclick="menuSet('${pageContext.request.contextPath}')" />
			</div>
			<table class="table table-bordered" style="margin-top: 20px;">
				<thead>
					<tr id="authTr">
					</tr>
				</thead>
				<tbody id="menuAuthTr">
				</tbody>
			</table>
		</div>
	</div>
</div>
</body>
</html>