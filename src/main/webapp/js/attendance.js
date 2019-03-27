// 条件查询
function findAttend() {
	var reg = /^((((1[6-9]|[2-9]\d)\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\d|3[01]))|(((1[6-9]|[2-9]\d)\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\d|30))|(((1[6-9]|[2-9]\d)\d{2})-0?2-(0?[1-9]|1\d|2[0-8]))|(((1[6-9]|[2-9]\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-))$/;
	
	var signInStr = $("#signInStr").val();
	var signOutStr = $("#signOutStr").val();
	if (signInStr != '' && !reg.test(signInStr)) {
		alert("输入的签到时期格式有误，正确格式为：YYYY-MM-DD");
		return;
	}
	if (signOutStr != '' && !reg.test(signOutStr)) {
		alert("输入的签退时期格式有误，正确格式为：YYYY-MM-DD");
		return;
	}
	if (signInStr != '' && signOutStr != '') {
		// 部分火狐浏览器不兼容 YYYY-MM-DD格式
		signInStr = signInStr.replace(/-/g,"/");
		signOutStr = signOutStr.replace(/-/g,"/");
		var signIn = new Date(signInStr);
		var signOut = new Date(signOutStr);
		if (signIn.getTime() > signOut.getTime()) {
			alert("签退日期不能早于签到日期");
			return;
		}
	}
	
	$("#attendForm").submit();
}

// 分页查询
function attendPage(page) {
	$("#pageNo").val(page);
	findAttend();
}

/**
 * 签到
 * @param path
 */
function attendSignIn(path) {
	$.ajax({
		url: path + "/attendance/attend/signIn",
		type: "POST",
		dataType: "json",
		success: function(data) {
			    if(data.code=="200"){
			    	alert(data.message);
					window.location.href = path + "/attendance/attend/list";
			    }else{
			    	alert("签到失败");
			    }
		}, error: function(data) {
			alert("系统错误，请联系管理员！");
		}
	});
}

/**
 * 签退
 * @param path
 */
function atttendSignOut(path) {
	$.ajax({
		url: path + "/attendance/attend/signOut",
		type: "POST",
		dateType: "json",
		success: function(data) {
			if (data.code =="400") {
				alert(data.message);
			} else if(data.code =="200") {
				alert(data.message);
				window.location.href = path + "/attendance/attend/list";
			} 
		}, error: function(data) {
			alert("系统错误，请联系管理员！");
		}
	});
}