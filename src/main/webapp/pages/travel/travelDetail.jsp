<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
				<li class="active"><a href="#">游记详情</a></li>
			</ul>
		</div>
		<div class="row">
			<div style="padding: 10px 50px 10px;">
				<form class="form-horizontal" role="form" method="post"
					enctype="multipart/form-data">
					<div class="form-group">
						<div class="col-xs-4">
							<span style="color: rgb(255, 140, 60);"
								class="glyphicon glyphicon-plus"> </span> <label>基础信息</label>
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-2">
							<span>名称标题</span>
						</div>
						<div class="col-xs-10">
							<input type="text" class="form-control" value="${travel.tname}">
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-2">
							<font color="red">*</font><span>产品分类</span>
						</div>
						<div class="col-xs-3">
							<span>${travel.type}</span>
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-2">
							<font color="red">*</font><span>价格</span>
						</div>
						<div class="col-xs-6 radio">
							<input type="text" name="fee" value="${travel.fee}">
						</div>

					</div>
					<div class="form-group">
						<div class="col-xs-2">
							<span>目的地</span>
						</div>
						<div class="col-xs-10">
							<input type="text" class="form-control " name="destination"
								value="${travel.destination}">
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-2">
							<span>出发时间</span>
						</div>
						<div class="col-xs-5">
							<input class=" form-control" value="${travel.starttime}">
						</div>

					</div>
					<div class="form-group">
						<div class="col-xs-2">
							<span>行程天数</span>
						</div>
						<div class="col-xs-7">
							<input type="text" class="form-control " name="daynum"
								value="${travel.daynum }">
						</div>
					</div>

					<div class="form-group">
						<div class="col-xs-2">
							<span>用户名</span>
						</div>
						<div class="col-xs-10">
							<input type="text" name="username" class="form-control"
								value="${travel.username }" />
						</div>
					</div>

					<div class="form-group">
						<div class="col-xs-2">
							<span>用户头像</span>
						</div>
						<div class="col-xs-10">
							<label>${travel.userpicurl}</label> <img alt=""
								src="../../${travel.userpicurl}" height="100" width="100">
						</div>
					</div>
					<c:forEach var="TravelTitle" items="${TravelTitles}">
						<div class="form-group">
							<div class="col-xs-2">
								<span>标题</span>
							</div>
							<div class="col-xs-10">
								<input type="text" class="form-control" name="title"
									value="${TravelTitle.title}">
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-2">
								<span>描述</span>
							</div>
							<div class="col-xs-10">
								<textarea class="form-control" rows="2">${TravelTitle.des}</textarea>
							</div>
						</div>
						<c:forEach var="pic" items="${TravelTitle.titlePics}">
							<div class="form-group">
								<div class="col-xs-2">
									<span>图片</span>
								</div>
								<div class="col-xs-10">
									<img alt="" src="../../${pic}" height="100" width="100">
								</div>
							</div>
						</c:forEach>

					</c:forEach>
				<!-- 	<div class="form-group">
						<div class="col-xs-2">
							<span>图片4</span>
						</div>
						<div class="col-xs-10">
							<input type="file" id="inputfile" class="form-control"
								name="travelpic">
						</div>
					</div> -->


					<div class="form-group">
						<div class="col-xs-2"></div>
						<div class="col-xs-10">
							<%-- 	<button class="btn btn-block btn-success"
								onclick="sbmitFrom(${travel.tid})" >添加描述</button> --%>
							<label onclick="sbmitFrom(${travel.tid})">添加描述</label>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>


<script type="text/javascript">
	

	function sbmitFrom(tid) {
	
	location.href="<%=request.getContextPath()%>/travel/toaddTitle.do?tid="+tid;
		
	}
</script>


</html>