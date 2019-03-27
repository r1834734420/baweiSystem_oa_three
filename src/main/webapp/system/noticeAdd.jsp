<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/notice.js"></script>
<title>添加通知公告</title>
<style type="text/css">
	.inputText{width: 830px !important;}
	.rowDiv{margin-bottom: 15px;}
	.form-lavel{width: 80px;text-align: right;}
</style>
</head>
<body>
<div class="container" style="width: 100%;padding: 25px 15px;">
		<div class="row clearfix">
			<div class="col-md-12 column" style="padding: 20px;padding-top: 0px;">
				<form action="${pageContext.request.contextPath}/notice/notice/save.action" method="post" id="noticeForm" enctype="multipart/form-data" role="form" class="form-horizontal" style="margin-bottom: 10px;">
					<div id="userInfoDiv" class="form" style="padding:5px;">
						<div class="row rowDiv">
							<div class="col-sm-12">
								<div class="form-group">
									<label class="col-sm-1 control-label" for="account" style="padding-top: 0px;">标题：<span style="color: red;">*</span></label>
									<div class="col-sm-11">
										<input type="text" class="form-control" id="title" name="title" value="">
									</div>
								</div>
							</div>
						</div>
						<div class="row rowDiv">
							<div class="col-sm-12">
								<div class="form-group">
									<label class="col-sm-1 control-label" for="content" style="padding-top: 0px;">内容：<span style="color: red;">*</span></label>
									<div class="col-sm-11">
										<textarea class="form-control" id="content" name="content" rows="10" style="resize: none;"></textarea>
									</div>
								</div>
							</div>
						</div>
						<div class="row rowDiv">
							<div class="col-sm-12">
								<div class="form-group">
									<label class="col-sm-1 control-label" for="mobile" style="padding-top: 0px;">接收人：<span style="color: red;">*</span></label>
									<div class="col-sm-11">
									     <c:forEach items="${users}" var="u">
											<input type="checkbox" name="recipinet" value="${u.id}"/>&nbsp;${u.realName} &nbsp;&nbsp;&nbsp;&nbsp;
									     </c:forEach>
									</div>
								</div>
							</div>
						</div>
						<div class="row rowDiv">
							<div class="col-sm-12">
								<div class="form-group">
									<label class="col-sm-1 control-label" style="padding-top: 0px;">附件：</label>
									<div class="col-sm-11">
										<input type="file" name="file" style="display: inline-block;">
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<input type="submit" class="btn btn-primary btn" value="发布" onclick="return noticeCheck()"/>
								</div>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>