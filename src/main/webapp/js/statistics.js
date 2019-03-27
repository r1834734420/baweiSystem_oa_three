$(document).ready(function() {
	// 初始化柱状图表标签
	var myChart1 = echarts.init(document.getElementById('histogram'));

	$.ajax({
		url : "/oa/userInfo/getStatistics.action",
		type : "POST",
		dataType : "json",
		success : function(result) {

			var names = [];
			var values = [];
			

			for (var i = 0; i < result.length; i++) {
				values[i] = result[i].num;
				switch (result[i].type) {
				case 0:
					names[i] = '试用期';
					break;
				case 1:
					names[i] = '转正';
					break;
				case 2:
					names[i] = '离职';
					break;
				}
			}

			var options = {
				// 定义一个标题
				title : {
					text : '员工统计'
				},
				// X轴设置
				xAxis : {
					data :names
				},
				yAxis : {},
				series : [ {
					type : 'bar',
					data : values
				} ]

			};
			myChart1.setOption(options);
			
			
			
			
			
			// 初始化饼状图表标签
			var myChart2 = echarts.init(document.getElementById('pie'));
			
			var dataNum = []
			for (var i = 0; i < result.length; i++) {
				values[i] = result[i].num;
				switch (result[i].type) {
				case 0:
					names[i] = '试用期';
					break;
				case 1:
					names[i] = '转正';
					break;
				case 2:
					names[i] = '离职';
					break;
				}
				dataNum[i] = {name:names[i],value:values[i]}
			}
			var option = {
				title : {
					text : '员工统计',
					x : 'center'
				},
				tooltip : {
					trigger : 'item',
					formatter : "{a} <br/>{b} : {c} ({d}%)"
				},
				legend : {
					orient : 'vertical',
					x : 'left',
				},
				toolbox : {
					show : true,
					feature : {
						mark : true,
						dataView : {
							readOnly : false
						},
						restore : true,
						saveAsImage : true
					}
				},
				calculable : true,
				series : [ {
					type : 'pie',
					radius : '55%',
					center : [ '50%', 225 ],
					data : dataNum
				} ]
			};
			myChart2.setOption(option);

		},
		error : function(data) {
			alert("系统错误，请联系管理员");
		}
	});

});