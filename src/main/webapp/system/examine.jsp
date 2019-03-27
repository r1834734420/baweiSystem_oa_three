<%@page import="cn.feicui.domain.UserInfo"%>
<%@page import="cn.feicui.domain.Examine"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/examine.js"></script>
<title>审批管理</title>
</head>
<body>
<div class="container" style="width: 100%;padding: 25px 15px;">
    <div class="row clearfix">
        <div class="col-md-12 column" style="padding: 20px;">
        <form action="${pageContext.request.contextPath}/examine/list.action" method="post">
            <table class="table table-bordered" style="margin-top: 20px;">
                <thead>
                    <tr>
                        <th style="width: 150px;">姓名</th>
                        <th style="width: 150px;">审批类型</th>
                        <th>描述</th>
                        <th style="display:none">关联表id</th>
                        <th style="width: 100px;">操作</th>
                    </tr>
                </thead>
                <tbody>
                    <c:if test="${!empty listMap}">
                        <c:forEach  items="${listMap }" var="list" varStatus="v">
	                           <c:if test="${v.index % 2 == 0 }">
	                                <tr class="success">
	                            </c:if>
	                            <c:if test="${v.index % 2 != 0 }">
	                                <tr>
	                            </c:if>
	                            <td>${list['realName']}</td>
                                <td>加班管理</td>
                                <td>${list['des']}</td>
                                <td style="display:none">${list['TId']}</td>
                                <td>
                                    <a href="javascript:void(0);" onclick="detailOvertime('${pageContext.request.contextPath}', '${list['id']}')" class="btn btn-primary btn">详情</a>
                                </td>
                        </c:forEach>
                    </c:if>
                </tbody>
            </table>
            </form>
        </div>
    </div>
</div>
</body>
</html>