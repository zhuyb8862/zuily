<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resource/js/jquery-1.10.2.js"></script>

<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>

<link href="/resource/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<ul class="nav nav-tabs">
				<li class="active"><a href="#">添加游记描述</a></li>
			</ul>
		</div>
		<div class="row">
			<div style="padding: 10px 50px 10px;">
				<form class="form-horizontal" role="form"
					action="<%=request.getContextPath()%>/travel/addTitle.do"
					id="tForm" method="post" enctype="multipart/form-data">
					<input type="hidden" value="${tid}" name="tid">
					<div class="form-group">
						<div class="col-xs-2">
							<font color="red">*</font><span>标题</span>
						</div>
						<div class="col-xs-10">
							<input type="text" class="form-control" name="title">
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-2">
							<font color="red">*</font><span>描述</span>
						</div>
						<div class="col-xs-10">
							<textarea class="form-control" rows="2" name ="des"></textarea>
						</div>
					</div>

					<div class="form-group">
						<div class="col-xs-2">
							<span>图片1</span>
						</div>
						<div class="col-xs-10">
							<input type="file" id="inputfile" class="form-control"
								name="travelpic">
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-2">
							<span>图片2</span>
						</div>
						<div class="col-xs-10">
							<input type="file" id="inputfile" class="form-control"
								name="travelpic">
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-2">
							<span>图片3</span>
						</div>
						<div class="col-xs-10">
							<input type="file" id="inputfile" class="form-control"
								name="travelpic">
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-2">
							<span>图片4</span>
						</div>
						<div class="col-xs-10">
							<input type="file" id="inputfile" class="form-control"
								name="travelpic">
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
	function submitFrom() {
		if (confirm('确定提交么？')) {
			$("#tForm").submit();
		} else {

		}

	}
</script>

</html>