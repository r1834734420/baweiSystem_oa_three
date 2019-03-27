<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<style type="text/css">
.myDiv {
    width: 400px;
    height: 200px;
    border: 1px solid #5e5e5e;
    top: 50%;
    left: 50%;
    margin-top: -220px;
    margin-left: -250px;
    position: absolute;
    border-radius: 5px;
}
</style>
<script type="text/javascript">
    //校验新密码和旧密码
    function validation(){
        var oldpwd = $("#oldpwd").val();
        var newpwd = $("#newpwd").val();
        var confim = $("#confim").val();
        if(oldpwd==' '&&oldpwd==null&&oldpwd==''){
            alert("请输入原始密码");
            return false;
        }
        if(newpwd==' '&&newpwd==null&&newpwd==''){
            alert("请输入新密码");
            return false;
        }
        if(newpwd != confim){
            alert("密码不一致");
            return false;
        }
        return true;
    }
    
    function updatePassword(path){
    	var flag=validation();
    	if(flag==true){
	    	$.ajax({
	    		url:path+"/userInfo/updatepwd.action",
	    		method:"POST",
	    		data:$("#myPassword").serialize(),
	    		cache:false,
	    		dataType:"json",
	    		success:function(data){
	    			if(data.code=="200"){
	    				alert(data.message);
	    				window.top.location=path+"/login.jsp";
	    			}else if(data.code=="400"){
	    				$("#message").html(data.message);
	    				$("#oldpwd").val(data.oldpwd);
	    				$("#newpwd").val(data.newpwd);
	    				$("#confim").val(data.newpwd);
	    			}
	    		}
	    	});
	    }
  }
</script>
</head>
<body>
    <div class="myDiv">
        <div class="row-fluid">
            <form id="myPassword" class="form-horizontal" method="post" action="${pageContext.request.contextPath}/userInfo/updatepwd.action" style="padding: 15px;">
                <div class="form-group">
                  <label class="col-sm-3 control-label" for="pwd">原始密码</label>
                    <div class="col-sm-8">
                        <input type="password" class="form-control" name="oldpwd" id="oldpwd" placeholder="请输入原始密码"><font color='#ff0000'><b><span id="message"></span></b></font>
                    </div>
                </div>
                 <div class="form-group">
                    <label class="col-sm-3 control-label" for="pwd">新密码</label> 
                    <div class="col-sm-8">
                        <input type="password" class="form-control" name="newpwd" id="newpwd" placeholder="请输入新密码">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label" for="pwd">确认密码</label> 
                    <div class="col-sm-8">
                        <input type="password" class="form-control" name="confim" id="confim" placeholder="请再次输入新密码">
                    </div>
                </div>
              <div class="row">
                    <div class="col-sm-12" style="text-align: center;">
                        <button type="button" class="btn btn-primary" onclick="updatePassword('${pageContext.request.contextPath}');">确认修改</button>
                    </div>
                </div> 
            </form>
        </div>
    </div>
</body>
</html>