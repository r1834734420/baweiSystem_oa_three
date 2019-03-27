<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script>
     function checkLogin(){
    	 $.ajax({
    		 url:$("#loginForm").attr("action"),
    		 type:"POST",
    		 data:$("#loginForm").serialize(),
    		 cache:false,
    		 dataType:"json",
    		 success:function(data){
    			   if(data.code=="400"){
    				   //400个表示有错误
    				   $("#message").html(data.message);
    				   //$("#message").addClass("messageError");
    			   }else if(data.code=="200"){
    				   //通过认证,转向index.jsp
    				   window.location="${pageContext.request.contextPath}/main/index";
    			   }
    		 }
    	 });
    	
     }
</script>
<style type="text/css">

.messageError{
   font-size: 20px;color:#ff0000;font-weight:bold; 
}
.myDiv {
	width: 336px;
	height: 290px;
	margin-top: 402px;
	margin-left: 806px;
	position: absolute;
	border-radius: 5px;
}

.d1 {
	width: 200px;
	height: 50px;
	margin-top: 360px;
	margin-left: 860px;
	position: absolute;
}
.inputText {
	border: 0px;
	border-bottom: 1px solid #8ad2a3;
	font-size: 18px;
	line-height: 50px;
	width: 100%;
	outline:none;
}
.inputBtn {
	margin-top: 30px;
	font-size: 24px;
	-moz-box-shadow: 0px 20px 30px #4de5a4; /* èç Firefox */
	box-shadow: 0px 20px 30px #4de5a4;
	background: linear-gradient(to right, #4de5a4 , #15a54d);
}
</style>
</head>
<body style="background: url('img/login.png') no-repeat;">
    
    <div class="d1"><span id="message" class="messageError">${message}</span></div>
	<div class="myDiv">
		<form method="post" action="${pageContext.request.contextPath}/login/checkLogin" id="loginForm">
		<input type="text" class="inputText" name="account" id="account" placeholder="请输入账号" autofocus style="margin-top: 30px;"/><br>
		<input type="password" class="inputText" name="password" id="pwd" placeholder="请输入密码" value="123456" style="margin-top: 60px;"/><br>
		<input type="button" class="btn btn-success btn-lg btn-block inputBtn" value="登录" onclick="checkLogin();"/>
		</form>
	</div>
</body>

</html>