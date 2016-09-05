<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resource/js/jquery-1.10.2.js"></script>

<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>

<script type="text/javascript" src="/resource/js/laydate.js"></script>
<link href="/resource/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<ul class="nav nav-tabs">
				<li class="active"><a href="#">发布游记</a></li>
			</ul>
		</div>
		<div class="row">
			<div style="padding: 10px 50px 10px;">
				<form class="form-horizontal" role="form"
					action="<%=request.getContextPath()%>/travel/publishTravel.do"
					id="pForm" method="post" enctype="multipart/form-data">
					<div class="form-group">
						<div class="col-xs-4">
							<span style="color: rgb(255, 140, 60);"
								class="glyphicon glyphicon-plus"> </span> <label>基础信息</label>
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-2">
							<font color="red">*</font><span>名称标题</span>
						</div>
						<div class="col-xs-10">
							<input type="text" class="form-control" name="tname">
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-2">
							<font color="red">*</font><span>产品分类</span>
						</div>
						<div class="col-xs-3">
							<select class="form-control" name="type">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-2">
							<font color="red">*</font><span>价格</span>
						</div>
						<div class="col-xs-6 radio">
							<label> <input type="radio" name="free"
								id="optionsRadios1" value="option1" checked> 收费
							</label> <input type="text" name="fee">
						</div>

						<div class="col-xs-2 radio">
							<label> <input type="radio" name="free"
								id="optionsRadios2" value="option2"> 免费
							</label>
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-2">
							<font color="red">*</font><span>目的地</span>
						</div>
						<div class="col-xs-10">
							<input type="text" class="form-control " name="destination">
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-2">
							<font color="red">*</font><span>出发时间</span>
						</div>
						<div class="col-xs-5">
							<input class="  laydate-icon form-control" id="stime"
								name="starttime" value="开始时间">
						</div>

					</div>
					<div class="form-group">
						<div class="col-xs-2">
							<font color="red">*</font><span>行程天数</span>
						</div>
						<div class="col-xs-7">
							<input type="text" class="form-control " name="daynum">
						</div>
					</div>

					<div class="form-group">
						<div class="col-xs-2">
							<font color="red">*</font><span>用户名</span>
						</div>
						<div class="col-xs-10">
							<input type="text" name="username" class="form-control" />
						</div>
					</div>


					<div class="form-group">
						<div class="col-xs-2">
							<font color="red">*</font><span>用户头像</span>
						</div>
						<div class="col-xs-10">
							<input type="file" id="inputfile" class="form-control"
								name="userpic">
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-2">
							<font color="red">*</font><span>展示图片</span>
						</div>
						<div class="col-xs-10">
							<input type="file" id="inputfile" class="form-control"
								name="userpic">
						</div>
					</div>

					<div class="form-group">
						<div class="col-xs-2"></div>
						<div class="col-xs-10">
							<button class="btn btn-block btn-success" onclick="submitFrom()">提交</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>


</body>


<script type="text/javascript">
	/* function uppic() {
		//异步上传图片
		//插件已经引入
		//jquery 纯  插件  jquery.form.js
		alert("ddddd");
		var picids = "";
		var options = {
			url : "/travel/uppics.do",
			type : "post",
			dataType : "json",

			success : function(data) {
				
				picids = picids + "," + data;
				alert(data);

			}
		}
		alert("wwwwwwwwwwwww");
		$("#pForm").ajaxSubmit(options);
	} 
	 */

	function submitFrom() {
		if (confirm('确定提交么？')) {
			$("#pForm").submit();
		} else {

		}

	}
</script>

<script type="text/javascript">
	!function() {
		laydate.skin('molv');//切换皮肤，请查看skins下面皮肤库
		laydate({
			elem : '#stime'
		}); //绑定元素
		/* laydate({
			elem : '#etime1'
		}); */

	}();

	//日期范围限制
	var start = {
		elem : '#start',
		format : 'YYYY-MM-DD',
		min : laydate.now(), //设定最小日期为当前日期
		max : '2099-06-16', //最大日期
		istime : true,
		istoday : false,
		choose : function(datas) {
			end.min = datas; //开始日选好后，重置结束日的最小日期
			end.start = datas //将结束日的初始值设定为开始日
		}
	};

	var end = {
		elem : '#end',
		format : 'YYYY-MM-DD',
		min : laydate.now(),
		max : '2099-06-16',
		istime : true,
		istoday : false,
		choose : function(datas) {
			start.max = datas; //结束日选好后，充值开始日的最大日期
		}
	};
	laydate(start);
	laydate(end);
</script>
</html>