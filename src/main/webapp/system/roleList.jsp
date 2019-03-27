<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/role.js"></script>
<title>角色列表</title>
</head>
<body>
<div class="container" style="width: 100%;padding: 25px 15px;">
	<div class="row clearfix">
		<div class="col-md-12 column" style="padding: 20px;">
			<div style="float: left;">
				
						<input type="button" class="btn btn-primary btn" value="添加" onclick="roleHTML('${pageContext.request.contextPath}', 'add');"/>
					
			</div>
			<table class="table table-bordered" style="margin-top: 20px;">
				<thead>
					<tr>
						<th>角色名称</th>
						<th>描述</th>
						<th style="width: 180px;">操作</th>
					</tr>
				</thead>
				<tbody>
					
								<tr class="success">
							   <c:forEach var="role" items="${roles}">
								  <tr>
										<td>${role.roleName}</td>
										<td>${role.describe }</td>
										<td>
													<a href="javascript:void(0);" onclick="detailRole('${pageContext.request.contextPath}', '${role.id }')" class="btn btn-primary btn">修改</a>
												
													<a href="javascript:void(0);" onclick="delRole('${pageContext.request.contextPath}', '${role.id}')" class="btn btn-primary btn">删除</a>	
										</td>
								   </tr> 
					           </c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
</body>

</html>