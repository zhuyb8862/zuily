<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<%@include file="/pages/main/head.jsp" %>
</head>

<body>
	<!-- navbar -->
	<%@include file="/pages/main/navbar.jsp" %>
	<br/>
	<br/>
	<br/>
	<div class="container-fluid">
		<div class="row">
			<%@include file="/pages/main/left.jsp" %>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<h1 class="page-header">控制台</h1>
				
				<div class="table-responsive">
					<div id="main" class="jumbotron">
						<h1>Welcome!</h1>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- footer -->
	<%@include file="/pages/main/footer.jsp" %>
</body>
</html>
