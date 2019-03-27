<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/notice.js"></script>
<style type="text/css">
	table td{text-overflow: ellipsis; white-space: nowrap; overflow: hidden;}
</style>
<script type="text/javascript">
$(function(){
	if ('${auths}' == 1) {
		myPulish('${pageContext.request.contextPath}', 1);
	} else {
		myReceive('${pageContext.request.contextPath}', 1);
	}
	
	$('a[data-toggle="tab"]').on('show.bs.tab', function (e) {
		// 获取已激活的标签页的href
		var activeTab = $(e.target).attr("href");
		if (activeTab == '#publishNotice') {
			myPulish('${pageContext.request.contextPath}', 1);
		} else {
			myReceive('${pageContext.request.contextPath}', 1);
		}
		
	});
});
</script>
<title>我的通知公告</title>
</head>
<body>
	<div class="container" style="width: 100%;padding: 25px 15px;">
		<div class="row clearfix">
			<div class="col-md-12 column" style="padding: 20px;padding-top: 0px;">
				<ul id="noticeTab" class="nav nav-tabs">
					<c:if test="${auths == 1}">
						<li class="active"><a href="#publishNotice" data-toggle="tab">发布的公告</a></li>
						<li><a href="#receivePublish" data-toggle="tab">接收的公告</a></li>
					</c:if>
					<c:if test="${auths == 0}">
						<li class="active"><a href="#receivePublish" data-toggle="tab">接收的公告</a></li>
					</c:if>
				</ul>
				<div id="noticeTabContent" class="tab-content">
					<c:if test="${auths == 1}">
						<div class="tab-pane fade in active" id="publishNotice">
							<table class="table table-bordered" style="margin-top: 20px;">
								<thead>
									<tr>
										<th>序号</th>
										<th style="width: 300px;">标题</th>
										<th>内容</th>
										<th style="width: 100px;">状态</th>
										<th style="width: 100px;">操作</th>
									</tr>
								</thead>
								<tbody id="publishTable"></tbody>
							</table>
							<div id="publishPage"></div>
						</div>
						<div class="tab-pane fade" id="receivePublish">
							<table class="table table-bordered" style="margin-top: 20px;">
								<thead>
									<tr>
										<th>序号</th>
										<th style="width: 300px;">标题</th>
										<th>内容</th>
										<th style="width: 100px;">发布人</th>
									</tr>
								</thead>
								<tbody id="receiveTable"></tbody>
							</table>
							<div id="receivePage"></div>
						</div>
					</c:if>
					<c:if test="${auths == 0 }">
						<div class="tab-pane fade in active" id="receivePublish">
							<table class="table table-bordered" style="margin-top: 20px;">
								<thead>
									<tr>
										<th>序号</th>
										<th style="width: 300px;">标题</th>
										<th>内容</th>
										<th style="width: 100px;">发布人</th>
									</tr>
								</thead>
								<tbody id="receiveTable"></tbody>
							</table>
							<div id="receivePage"></div>
						</div>
					</c:if>
				</div>
			</div>
		</div>
	</div>
</body>
</html>