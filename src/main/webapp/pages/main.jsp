<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
<script type="text/javascript" src="/resource/js/jquery-1.10.2.js"></script>

<link href="/resource/css/bootstrap-combined.min.css" rel="stylesheet"
	media="screen">
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container-fluid" style="padding: 10px 50px 10px;">
		<div class="row-fluid">
	<div class="span12"><div class="btn-group">
   <button type="button" class="btn btn-default dropdown-toggle" 
      data-toggle="dropdown">
      用户 <span class="caret"></span>
   </button>
   <ul class="dropdown-menu" role="menu">
      <li><a href="#">功能</a></li>
      <li><a href="#">另一个功能</a></li>
      <li><a href="#">其他</a></li>
      <li class="divider"></li>
      <li><a href="#">分离的链接</a></li>
   </ul>
</div></div>
		</div>
		<div class="row-fluid" >
			<div class="span2">
				<ul class="nav nav-list">
					<li class="nav-header">列表标题</li>
					<li class="active"><a
						href="<%=request.getContextPath()%>/pages/allItems/item.jsp" target="main">全部商品</a></li>
					<li><a href="/pages/allItems/pulishItems.jsp" target="main">发布商品</a></li>
					<li><a href="#">全部订单</a></li>
					<li><a href="#">咨询</a></li>
					<li class="divider"></li>
					<li><a href="<%=request.getContextPath()%>/pages/travel/travel.jsp" target="main">游记列表</a></li>
					<li><a href="<%=request.getContextPath()%>/pages/travel/publishTravel.jsp" target="main">添加游记</a></li>
					<li><a href="<%=request.getContextPath()%>/pages/banner/banner.jsp" target="main">运营模板</a></li>
					<li><a href="<%=request.getContextPath()%>/pages/banner/addBanner.jsp" target="main">添加运营模板</a></li>
					<li class="divider"></li>
					<li><a href="#">帮助</a></li>
				</ul>

			</div>
			<div class="span10">
				<div>
					<iframe name="main" frameborder="0" scrolling="auto" width="800"
						height="500"></iframe>
				</div>
			</div>

		</div>
	</div>
	<hr>
	<footer class="footer navbar-fixed-bottom ">
    <div class="container">
    <div class = "span12"><ul><li>ddd</li></ul>  </div>
    </div>
</footer>
</body>
</html>