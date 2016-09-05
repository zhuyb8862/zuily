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
			<li class="active"><a href="<%=request.getContextPath()%>/pages/AllItem.do" target="item">全部商品</a></li>
			<li><a href="/pages/allItems/pendItems.jsp" target="item">待审核</a></li>
			<li><a href="/pages/allItems/shelveItems.jsp" target="item">已上线</a></li>
			<li><a href="/pages/allItems/UnShelveItems.jsp" target="item">已下线</a></li>

		</ul>
		</div>
		<div class="row">
		
		<iframe name = "item" width="750" height="550"frameborder="0" scrolling="auto" ></iframe>
		</div>
	
	</div>
</body>
</html>