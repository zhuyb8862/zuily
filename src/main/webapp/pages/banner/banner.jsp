<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resource/js/jquery-1.10.2.js"></script>

<link href="/resource/css/bootstrap-combined.min.css" rel="stylesheet"
	media="screen">
</head>
<body>
	<div class="container-fluid">
		<div class = "row" >
		<ul class="nav nav-tabs">
			<li class="active"><a href="<%=request.getContextPath()%>/banner/AllBanner.do" target="banner">首页banner</a></li>
			<li><a href="/pages/banner/" target="banner">大牌专区</a></li>
			<li><a href="#" target="banner">热门专题</a></li>


		</ul>
		</div>
		<div class="row">
		
		<iframe name = "banner" width="750" height="550"frameborder="0" scrolling="auto" ></iframe>
		</div>
	
	</div>
</body>
</html>