<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/attendance.js"></script>
<title>考勤管理</title>
</head>
<body>
<div class="container" style="width: 100%;padding: 25px 15px;">
	<div class="row clearfix">
		<div class="col-md-12 column" style="padding: 20px;">
			<div style="float: left;">
				<c:if test="${isSignIn == 0 }">
					<input type="button" class="btn btn-primary btn" value="签到" onclick="attendSignIn('${pageContext.request.contextPath}')"/>
				</c:if>
				<input type="button" class="btn btn-primary btn" value="签退" onclick="atttendSignOut('${pageContext.request.contextPath}')"/>
			</div>
			<form action="${pageContext.request.contextPath}/attendance/attend/list" method="post" id="attendForm" role="form" class="form-inline" style="float: right;margin-bottom: 10px;">
				<div class="form-group" style="margin-right: 20px;">
					 <label for="exampleInputEmail1" style="margin-right: 10px;">签到时间</label><input type="text" value="${signInValue}" class="form-control" id="signInStr" name="signInStr" placeholder="签到时间，如：2017-01-01" />
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1" style="margin-right: 10px;">签退时间</label><input type="text" value="${signOutValue}" class="form-control" id="signOutStr" name="signOutStr" placeholder="签退时间，如：2017-01-02" />
				</div>
				<input type="hidden" id="pageNo" name="currentPage" value="">
				<button type="button" class="btn btn-primary btn" onclick="findAttend()">查询</button>
			</form>
			<table class="table table-bordered" style="margin-top: 20px;">
				<thead>
					<tr>
						<th style="width: 150px;">姓名</th>
						<th>签到时间</th>
						<th>签退时间</th>
						<th>IP</th>
					</tr>
				</thead>
				<tbody>
				      <c:forEach var="attendance" items="${pageView.records}">
								<tr class="success">
								<td>${sessionScope.user.realName}</td>
								<td><fmt:formatDate value="${attendance.signIn}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
								<td><fmt:formatDate value="${attendance.signOut}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
								<td>${attendance.ip}</td>
							</tr>
					 </c:forEach>		
						
				</tbody>
			</table>
			<span>共${pageView.totalRecord}条记录 共${pageView.totalPage}页 当前第${pageView.currentPage}页</span>
			<!-- 分页 -->
			<ul class="pagination" style="float: right;margin: 0;">
				<li><a href="javascript:void(0)" onclick="attendPage('1')">首页</a></li>
				<c:choose>
					<c:when test="${pageView.currentPage!=1}">
						<li><a href="javascript:void(0)" onclick="attendPage('${pageView.currentPage-1}')">上一页</a></li>
					</c:when>
					<c:otherwise>
						<li class="disabled"><a href="javascript:void(0)">上一页</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${pageView.currentPage != pageView.totalPage}">
						<li><a href="javascript:void(0)" onclick="attendPage('${pageView.currentPage+1}')">下一页</a></li>
					</c:when>
					<c:otherwise>
						<li class="disabled"><a href="javascript:void(0)">下一页</a></li>
					</c:otherwise>
				</c:choose>
				<li><a href="javascript:void(0)" onclick="attendPage('${pageView.totalPage}')">尾页</a></li>
			</ul>
		</div>
	</div>
</div>
</body>

</html>