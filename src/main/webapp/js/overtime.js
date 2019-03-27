/**
 * 添加加班
 * @param path
 */
function addOvertime(path) {
	var startTime = $("#startTime").val();
	var endTime = $("#endTime").val();
	var des = $("#des").val();
	var res =  validate();
	if (!res) return;
	$.ajax({
		url: path + "/overtime/add.action",
		type: "POST",
		data:{startTime:startTime,endTime:endTime,des:des},
		dataType:"json",
		success: function(data) {
			if (data.code=="200") {
				alert(data.message);
				$('#overtimeDivModel').remove();
				location.href = path + "/overtime/list";
			} else if (data.code =="400") {
				alert("添加失败");
			} 
		},error: function(data) {
			alert("系统错误，请联系管理员");
		}
	});
}


/**
 * 加班详情
 * @param path
 * @param id
 */
function detailOvertime(path) {
	//首先要找到被选中的记录
	var $delInputs=$("input[name='overtimeids']:checked");
	if($delInputs.length!=1){
		alert("只能选择一条记录进行修改！");
		return false;
	}
	var id=$($delInputs[0]).val();
	//overtimeHTML(path, 'upd');
	$.ajax({
		url: path + "/overtime/detail",
		type: "POST",
		data:{"id":id},//"id="+id
		dataType: "JSON",
		success: function(data) {
			overtimeHTML(path, 'upd');
			$("#overtimeDivModel #overtimeId").val(data.id);
			$("#overtimeDivModel #startTime").val(data.startTime);
			$("#overtimeDivModel #endTime").val(data.endTime);
			$("#overtimeDivModel #des").val(data.des);
		}, error: function(data) {
			alert("系统错误，请联系管理员");
		}
	});
}

/**
 * 修改加班
 * @param path
 */
function updOvertime(path) {
	var id = $("#overtimeId").val();
	var startTime = $("#startTime").val();
	var endTime = $("#endTime").val();
	var des = $("#des").val();
	var res =  validate();
	if (!res) return; 
	$.ajax({
		url: path + "/overtime/update",
		type: "POST",
		data:{"id":id,"startTime":startTime,"endTime":endTime,"des":des},
		dataType: "JSON",
		success: function(data) {
			if(data.code=="200"){
				alert(data.message);
				location.href = path + "/overtime/list.action";
			}else{
				alert("更新失败!");
			}
			
		}, error: function(data) {
			alert("系统错误，请联系管理员");
		}
	});
}

/**
 * 删除加班
 * @param path
 */
function delOvertime(path) {
	
	var $delInputs=$("input[name='overtimeids']:checked");
	if($delInputs.length==0){
		alert("您还没有选中记录，请选择记录！");
		return;
	}
	var params="";
	$.each($delInputs,function(index,element){
		params=params+$(element).val()+",";
	});
	
	// params=1,2,3,4,5,
	params=params.substring(0,params.length-1);
	//params=1,2,3,4,5
	
	if (confirm("确定删除吗")) {
		$.ajax({
			url: path + "/overtime/delete.action",
			type: "POST",
			data:"ids="+params, //"ids=1,2,3,4,5"
			dataType: "JSON",
			success: function(data) {
				if(data.code='200'){
					alert(data.message);
					location.href = path+"/overtime/list";
				}else{
					alert("删除失败");
				}
				
			}, error: function(data) {
				alert("系统错误，请联系管理员");
			}
		});
	}
}

/**
 * 验证日期格式
 */
function validate(){
	
	var startTime = $("#startTime").val();
	var endTime = $("#endTime").val();
	var st = /^(\d{4})-(0\d{1}|1[0-2])-(0\d{1}|[12]\d{1}|3[01]) (\d{1,2}):(\d{1,2}):(\d{1,2})$/;
	if (startTime != '' && !st.test(startTime)){
		alert("请输入正确的开始日期格式");
		return false;
	}
	var et = /^(\d{4})-(0\d{1}|1[0-2])-(0\d{1}|[12]\d{1}|3[01]) (\d{1,2}):(\d{1,2}):(\d{1,2})$/;
	if (endTime != '' && !et.test(endTime)){
		alert("请输入正确的结束日期格式");
		return false;
	}
	var d1 = Date.parse(startTime);
	var d2 = Date.parse(endTime);
	var date = d2 - d1;
	var time = 60*60*1000;
	if(date<0||date<time){
		alert("开始时间应小于结束时间并且间隔小于一小时,请检查!");
		return false;
	}
	return true;
}
	
/**
 * 加班HTML
 * @param path
 */
function overtimeHTML(path, method) {
	// 检查当前页面是否弹层，如果有则删除
	if($('#overtimeDivModel') != null && $('#overtimeDivModel') != undefined)
		$('#overtimeDivModel').remove();
	
	var style_ = 'width: 600px; height: 300px; z-index: 1000; position: fixed; top: 50%;margin-top:-150px; left: 50%;margin-left: -300px;background: #fff;border: 1px solid rgba(39, 38, 38, 0.31);border-radius: 10px;padding: 15px;';
	var overtimeHtml = '<div id="overtimeDivModel" style="' + style_ + '">';
	overtimeHtml += '<div class="form-horizontal" role="form">';
	overtimeHtml += '<input type="hidden" id="overtimeId" value=""/>';
	overtimeHtml += '<div class="form-group">';
	overtimeHtml += '<label for="startTime" class="col-sm-2 control-label">开始时间</label>';
	overtimeHtml += '<div class="col-sm-10">';
	overtimeHtml += '<input type="text" class="form-control" id="startTime" placeholder="如：2017-04-19 08:00:00">';
	overtimeHtml += '</div></div>';
	overtimeHtml += '<div class="form-group">';
	overtimeHtml += '<label for="endTime" class="col-sm-2 control-label">结束时间</label>';
	overtimeHtml += '<div class="col-sm-10">';
	overtimeHtml += '<input type="text" class="form-control" id="endTime" placeholder="如：2017-04-19 18:00:00">';
	overtimeHtml += '</div></div>';
	overtimeHtml += '<div class="form-group">';
	overtimeHtml += '<label for="des" class="col-sm-2 control-label">加班描述</label>';
	overtimeHtml += '<div class="col-sm-10">';
	overtimeHtml += '<input type="text" class="form-control" id="des">';
	overtimeHtml += '</div></div>';
	overtimeHtml += '<div class="form-group">';
	overtimeHtml += '<div class="col-sm-12" style="text-align: center;">';
	if (method =='add') {
		overtimeHtml += '<input type="button" class="btn btn-primary btn" value="添加" onclick="addOvertime(\'' + path + '\')"/>';
	} else {
		overtimeHtml += '<input type="button" class="btn btn-primary btn" value="修改" onclick="updOvertime(\'' + path + '\')"/>';
	}
	overtimeHtml += '<input type="button" class="btn btn-primary btn" value="取消" onclick="javascript:$(\'#overtimeDivModel\').remove();" style="margin-left: 30px;"/>';
	overtimeHtml += '</div></div>';
	overtimeHtml += '</div></div>';
	$("body").append(overtimeHtml);
}