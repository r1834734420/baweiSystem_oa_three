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
<script type="text/javascript" src="${pageContext.request.contextPath}/js/overtime.js"></script>
<title>加班管理</title>
<script type="text/javascript">
    //条件查询
    function findOver(){
	    var realName = $("#realName").val();
	    $("#overForm").submit();
	}
    //分页查询
    function overPage(page){
    	$("#pageNo").val(page);
    	findOver();
    	
    }
</script>
</head>
<body>
<div class="container" style="width: 100%;padding: 25px 15px;">
    <div class="row clearfix">
        <div class="col-md-12 column" style="padding: 20px;">
            <div style="float: left;">
               
                        <input type="button" class="btn btn-primary btn" value="添加" onclick="overtimeHTML('${pageContext.request.contextPath}', 'add');"/>
                    
            </div>
            <form action="${pageContext.request.contextPath}/overtime/list" method="post" id="overForm" role="form" class="form-inline" style="float: right;margin-bottom: 10px;">
                <div class="form-group" style="margin-right: 20px;">
                     <label for="exampleInputEmail1" style="margin-right: 10px;">姓名</label><input type="text" class="form-control" id="realName" name="realName" placeholder="姓名"/>
                </div>
                <input type="hidden" id="pageNo" name="currentPage" value="">
                <button type="button" class="btn btn-primary btn" onclick="findOver()">查询</button>
            </form>
            <table class="table table-bordered" style="margin-top: 20px;">
                <thead>
                    <tr>
                        <th style="display:none">ID</th>
                        <th style="width:50px;text-align:center;">选择</th>
                        <th>姓名</th>
                        <th>申请时间</th>
                        <th>开始时间</th>
                        <th>结束时间</th>
                        <th>加班时长</th>
                        <th>描述</th>
                        <th>审批状态</th>
                        
                    </tr>
                </thead>
                <tbody>
                    
                      <tr class="success">
                      <c:forEach var="overtime" items="${pageView.records}">
	                      <tr>
		                      <td style="display:none">${overtime.id}</td>
		                      <td align="center"><input type="checkbox" name="overtimeids" value="${overtime.id}"/></td>
		                      <td>${sessionScope.user.realName}</td>
		                      <td><fmt:formatDate value="${overtime.applicationTime}" pattern="yyyy-MM-dd"/></td>
	                          <td><fmt:formatDate value="${overtime.startTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	                          <td><fmt:formatDate value="${overtime.endTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
		                      <td>${overtime.duration}</td>
		                      <td>${overtime.des}</td>
		                      <td>${overtime.status==0? "未审批" : overtime.status==1? "审核成功" : "审核失败"}</td>
	                     </tr>
                     </c:forEach>
                </tbody>
            </table>
            <table width="100%">
               <tbody>
                    <tr>
                         <td align="center">
	                         <a href="javascript:void(0);" onclick="detailOvertime('${pageContext.request.contextPath}')" class="btn btn-primary btn">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	                         <a href="javascript:void(0);" onclick="delOvertime('${pageContext.request.contextPath}')" class="btn btn-primary btn">删除</a>
	                     </td>
                   </tr>
                </tbody>
            </table>
            <span>共${pageView.totalRecord}条记录 共${pageView.totalPage}页 当前第${pageView.currentPage}页</span>
            <!-- 分页 -->
			<ul class="pagination" style="float: right;margin: 0;">
				<li><a href="javascript:void(0)" onclick="overPage('1')">首页</a></li>
				<c:choose>
					<c:when test="${pageView.currentPage!=1}">
						<li><a href="javascript:void(0)" onclick="overPage('${pageView.currentPage-1}')">上一页</a></li>
					</c:when>
					<c:otherwise>
						<li class="disabled"><a href="javascript:void(0)">上一页</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${pageView.currentPage != pageView.totalPage}">
						<li><a href="javascript:void(0)" onclick="overPage('${pageView.currentPage+1}')">下一页</a></li>
					</c:when>
					<c:otherwise>
						<li class="disabled"><a href="javascript:void(0)">下一页</a></li>
					</c:otherwise>
				</c:choose>
				<li><a href="javascript:void(0)" onclick="overPage('${pageView.totalPage}')">尾页</a></li>
			</ul>
        </div>
    </div>
</div>
</body>
</html>