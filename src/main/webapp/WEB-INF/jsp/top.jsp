<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
function startTime()
{
var today=new Date();
var year=today.getFullYear();
var month=checkTime(today.getMonth()+1);
var day=checkTime(today.getDate());
var h=checkTime(today.getHours());
var m=today.getMinutes();
var s=today.getSeconds();
// add a zero in front of numbers<10
m=checkTime(m)
s=checkTime(s)
document.getElementById('txt').innerHTML=year+"年"+month+"月"+day+"日  "+h+":"+m+":"+s
t=setTimeout('startTime()',500)
}

function checkTime(i)
{
if (i<10) 
  {i="0" + i}
  return i
}
$(function(){
	startTime();
});
</script>

<style type="text/css">
	.btn_a {
		width: 88px;
		line-height: 30px;
		font-size: 16px;
		background: #fff;
		color: #15a547;
		border: 1px solid #15a547;
		border-radius: 25px;
	}
	.btn_a:HOVER {
		background: #15a547;
		color: #fff;
		-moz-box-shadow: 1px 1px 1px #fff; /* èç Firefox */
		box-shadow: 1px 1px 1px #fff;
		border: 1px solid #fff;
	}
</style>
</head>
<body style="background: url('${pageContext.request.contextPath}/img/title.png') no-repeat;overflow: hidden;">
	<div style="width: 100%;text-align: right;line-height: 74px;padding-right: 20px;color: #FFFFFF;">
		<span style="color: #32394d;font-size: 18px;">${user.realName}&nbsp;&nbsp;你好,今天是</span>&nbsp;
		<span style="color: #ff0000;font-size: 18px;" id="txt"></span>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="${pageContext.request.contextPath}/main/password" class="btn btn-sm btn_a" target="content">修改密码</a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="javascript:void(0);" class="btn btn-sm btn_a" target="_top" onclick="javascript:window.top.location.href='${pageContext.request.contextPath}/login/exit'">退出</a>
	</div>
</body>

</html>