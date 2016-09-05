<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
+ path + "/";

%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="col-sm-3 col-md-2 sidebar" >

	<ul class="panel nav nav-pills nav-stacked" >
		<li>
			<a class="nav-container"  data-toggle="collapse"  href="#item" aria-expanded="true" >商品<div class="caret-container"><span class="caret arrow"></span></div></a>          
			<ul class="nav nav-pills nav-stacked collapse" id="item">
				<li><a href="${pageContext.request.contextPath}/pages/AllItem.do">全部商品</a></li>
				<li><a href="${pageContext.request.contextPath}/route/publishItem.do">发布商品</a></li>
				<li><a href="#">待审核商品</a></li>
				<li><a href="#">已上线商品</a></li>
				<li><a href="#">已下线商品</a></li>
			</ul>
		</li>
	</ul>
	<ul class="panel nav nav-pills nav-stacked" >
		<li>
			<a class="nav-container"  data-toggle="collapse" href="#order" aria-expanded="true" >订单<div class="caret-container"><span class="caret arrow"></span></div></a>          
			<ul class="nav nav-pills nav-stacked collapse" id="order">
				<li><a href="#">全部订单</a></li>
				<li><a href="#">待支付订单</a></li>
				<li><a href="#">已完成订单</a></li>
				<li><a href="#">已取消订单</a></li>
			</ul>
		</li>
	</ul>
	<ul class="panel nav nav-pills nav-stacked">
		<li>
			<a class="nav-container" data-toggle="collapse" href="#ask">咨询<div class="caret-container"><span class="caret arrow"></span></div></a>          
			<ul class="nav nav-pills nav-stacked collapse" id="ask">
				<li><a href="#">全部咨询</a></li>
				<li><a href="#">已解答</a></li>
				<li><a href="#">未解答</a></li>
			</ul>
		</li>
	</ul>
	<ul class="panel nav nav-pills nav-stacked">
		<li>
			<a class="nav-container" data-toggle="collapse" href="#travel">游记<div class="caret-container"><span class="caret arrow"></span></div></a>          
			<ul class="nav nav-pills nav-stacked collapse" id="travel">
				<li><a href="#">所有游记</a></li>
				<li><a href="#">添加游记</a></li>
				<li><a href="#">已审核游记</a></li>
				<li><a href="#">已下线</a></li>
				<li><a href="#">已上线</a></li>
			</ul>
		</li>
	</ul>
	<ul class="panel nav nav-pills nav-stacked">
		<li>
			<a class="nav-container" data-toggle="collapse"  href="#model">运营模板<div class="caret-container"><span class="caret arrow"></span></div></a>          
			<ul class="nav nav-pills nav-stacked collapse" id="model">
				<li><a href="#">首页</a></li>
				<li><a href="#">大牌</a></li>
				<li><a href="#">热门</a></li>
			</ul>
		</li>
	</ul>
</div>

<script>
	var nav = $('.nav-container');
	nav.click(function(){
		nav.each(function(){
			$($(this).attr("href")).collapse('hide');
		});
	});
	function sidebarInit(id){
		console.log(id);
		$('#' + id).collapse('show');
	}
</script>