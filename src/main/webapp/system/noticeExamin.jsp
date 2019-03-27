<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>通知公告审批列表</title>
<style type="text/css">
	table td{text-overflow: ellipsis; white-space: nowrap; overflow: hidden;}
</style>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/notice.js"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
	<div class="container" style="width: 100%;padding: 25px 15px;">
		<div class="row clearfix">
			<div class="col-md-12 column" style="padding: 20px;">
				<table class="table table-bordered" style="margin-top: 20px;">
					<thead>
						<tr>
							<th>序号</th>
							<th style="width: 300px;">标题</th>
							<th>内容</th>
							<th>发布人</th>
							<th style="width: 140px;">操作</th>
						</tr>
					</thead>
					<tbody>
						<c:if test="${!empty notices }">
							<c:forEach items="${notices }" var="n" varStatus="v">
								<c:if test="${v.index % 2 == 0 }">
									<tr class="success">
								</c:if>
								<c:if test="${v.index % 2 != 0 }">
									<tr>
								</c:if>
									<td>${v.index + 1 }</td>
									<td><a href="${pageContext.request.contextPath}/notice/notice/detail.action?id=${n.id }&type=0">${n.title }</a></td>
									<td>${n.content }</td>
									<td>${n.uName }</td>
									<td>
										<a href="javascript:void(0);" onclick="javascript:location.href='${pageContext.request.contextPath}/notice/notice/publish.action?id=${n.id }&status=1'" class="btn btn-primary btn">同意</a>
										<a href="javascript:void(0);" onclick="javascript:location.href='${pageContext.request.contextPath}/notice/notice/publish.action?id=${n.id }&status=2'" class="btn btn-primary btn">驳回</a>
									</td>
								</tr>
							</c:forEach>
						</c:if>
						<c:if test="${empty notices }">
							<tr><td colspan="5" style="text-align: center;">${msg}</td></tr>
						</c:if>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>