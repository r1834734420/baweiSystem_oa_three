<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
	<frameset rows="76, *" frameborder="no" border="0" framespacing="0">
		<frame src="${pageContext.request.contextPath}/main/top" name="top"style="border: 1px solid #8ad2a3;border-bottom: 5px solid #8ad2a3;">
		<frameset cols="16.66666667%, *" frameborder="no" border="0" framespacing="0">
			<frame src="${pageContext.request.contextPath}/main/menu" name="menu" style="border: 1px solid #8ad2a3;border-right: 5px solid #8ad2a3;">
			<frame src="${pageContext.request.contextPath}/main/content" name="content" style="border: 1px solid #8ad2a3;">
		</frameset>
		<noframes>
			<body><h1>您的浏览器无法处理框架！</h1></body>
		</noframes>	
	</frameset>
</html>