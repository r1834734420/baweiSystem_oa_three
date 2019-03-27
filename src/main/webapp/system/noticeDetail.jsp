<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>通知公告详情</title>
<style type="text/css">
	.inputText{width: 430px !important;}
	.rowDiv{margin-bottom: 15px;}
	.col-sm-1 control-label{width: 80px;text-align: right;}
</style>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/notice.js"></script>
<script type="text/javascript">
	$(function(){
		if ('${type }' == '0') {
			$("#noticeForm").find('input,textarea').attr("disabled", "disabled");
		}
		if ('${res }' != '')
			alert('${res }');
	});
</script>
</head>
<body>
<div class="container" style="width: 100%;padding: 25px 15px;">
		<div class="row clearfix">
			<div class="col-md-12 column" style="padding: 20px;padding-top: 0px;">
				<form action="<c:if test="${type =='1' }">${pageContext.request.contextPath}/notice/notice/update.action</c:if>" method="post" id="noticeForm" enctype="multipart/form-data" role="form" class="form-horizontal" style="margin-bottom: 10px;">
					<div id="userInfoDiv" class="form" style="padding:5px;">
						<div class="row rowDiv">
							<div class="col-sm-12">
								<div class="form-group">
									<label class="col-sm-1 control-label" for="account">标题：<span style="color: red;">*</span></label>
									<c:if test="${type =='1' }">
										<input type="hidden" name="id" value="${notice.id}"/>
									</c:if>
									<div class="col-sm-11">
										<input type="text" class="form-control" name="title" value="${notice.title }">
									</div>
								</div>
							</div>
						</div>
						<div class="row rowDiv">
							<div class="col-sm-12">
								<div class="form-group">
									<label class="col-sm-1 control-label" for="content">内容：<span style="color: red;">*</span></label>
									<div class="col-sm-11">
										<textarea class="form-control" id="content" name="content" rows="10" style="resize: none;">${notice.content }</textarea>
									</div>
								</div>
							</div>
						</div>
						<div class="row rowDiv">
							<div class="col-sm-12">
								<div class="form-group">
									<label class="col-sm-1 control-label" for="realName">发布人：</label>
									<div class="col-sm-11">
										<input type="text" class="form-control" id="realName" name="realName" value="${sessionScope.user.realName }">
									</div>
								</div>
							</div>
						</div>
						<div class="row rowDiv">
							<div class="col-sm-12">
								<div class="form-group">
									<label class="col-sm-1 control-label" for="mobile">接收人：<span style="color: red;">*</span></label>
									<div class="col-sm-11">
										<c:forEach items="${users}" var="u">
											<input type="checkbox" name="recipinet" value="${u.id}" <c:if test="${u.checked == true }">checked="checked"</c:if>/> ${u.realName }&nbsp;&nbsp;&nbsp;&nbsp;
										</c:forEach>
									</div>
								</div>
							</div>
						</div>
						<div class="row rowDiv">
							<div class="col-sm-12">
								<div class="form-group">
									<label class="col-sm-1 control-label">附件：</label>
									<div class="col-sm-11">
										<c:if test="${type == '1' }">
											<input type="file" name="file" style="display: inline-block;">
										</c:if>
										<c:if test="${type == '0' }">
											<a href="${noticeImg }">${formerly }</a>
										</c:if>
									</div>
								</div>
							</div>
						</div>
						<c:if test="${type =='1' }">
							<div class="row">
								<div class="col-sm-12">
									<div class="form-group">
										<input type="submit" class="btn btn-primary btn" value="提交" onclick="return noticeCheck()"/>
									</div>
								</div>
							</div>
						</c:if>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>