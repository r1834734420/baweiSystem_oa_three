<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<title>考勤统计</title>
<script type="text/javascript">
    // 分页查询
    function userPage(page) {
        $("#currentPage").val(page);
        $("#attendanceForm3").submit();
    }
</script>
</head>
<body>
<div class="container" style="width: 100%;padding: 25px 15px;">
    <div class="row clearfix">
        <div class="col-md-12 column" style="padding: 20px;">
            <div style="float: left;">
				<form action="${pageContext.request.contextPath}/attendanceStatistics/search" method="post" id="attendanceForm1" role="form" class="form-inline" style="float: right;margin-bottom: 10px;">
				   <label>月份：</label>
                   <input type="text" name="date" placeholder="yyyy-MM" value="${sessionScope.month}" style="height:32px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				   <input type="submit" id="search" style="text-align:left" class="btn btn-primary btn" name="exportExcel" value="查询"/>            
                </form>
            </div>
            <form action="${pageContext.request.contextPath}/attendanceStatistics/export" method="post" id="attendanceForm2" role="form" class="form-inline" style="float: right;margin-bottom: 10px;">
                 <input type="submit" id="exportExcel" class="btn btn-primary btn" name="exportExcel" value="批量导出"/>
            </form>
            <form action="${pageContext.request.contextPath}/attendanceStatistics/queryAttendans" method="post" id="attendanceForm3" role="form" class="form-inline" style="float: right;margin-bottom: 10px;">
                 <input type="hidden" id="currentPage" name="currentPage" value=""/>
            </form>
            <table class="table table-bordered" style="margin-top: 20px;">
                <thead>
                    <tr>
                        <th style="width: 150px;">用户名</th>
                        <th>迟到时间</th>
                        <th>早退时间</th>
                        <th>应上班时间</th>
                        <th>实上班时间</th>
                        <th>加班时间</th>
                    </tr>
                </thead>
                <tbody>
                          <c:forEach var="sa" items="${pageView.records}">
                                <tr class="success">                      
	                                <tr>                           
		                                <td>${sa.realName}</td>
		                                <td>${sa.late}小时</td>
		                                <td>${sa.leaveEarly}小时</td>
		                                <td>${sa.shouldTime}小时</td>
		                                <td>${sa.realTime}小时</td>
		                                <td>${sa.overTime}小时</td>
	                                </tr> 
                            </c:forEach>      
                </tbody>
            </table>
            
            <span>共${pageView.totalRecord}条记录 共${pageView.totalPage}页 当前第${pageView.currentPage}页</span>
			<!-- 分页 -->
			<ul class="pagination" style="float: right;margin: 0;">
				<li><a href="javascript:void(0)" onclick="userPage(1)">首页</a></li>
				<c:choose>
					<c:when test="${pageView.currentPage!=1}">
						<li><a href="javascript:void(0)" onclick="userPage('${pageView.currentPage-1}')">上一页</a></li>
					</c:when>
					<c:otherwise>
						<li class="disabled"><a href="javascript:void(0)">上一页</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${pageView.currentPage != pageView.totalPage}">
						<li><a href="javascript:void(0)" onclick="userPage('${pageView.currentPage+1}')">下一页</a></li>
					</c:when>
					<c:otherwise>
						<li class="disabled"><a href="javascript:void(0)">下一页</a></li>
					</c:otherwise>
				</c:choose>
				<li><a href="javascript:void(0)" onclick="userPage('${pageView.totalPage}')">尾页</a></li>
			</ul>
           
        </div>
    </div>
</div>
</body>
</html>