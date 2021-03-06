<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<table class="table  table-bordered  ">
		<thead>
			<tr>
				<td>编号ID</td>
				<td>标题名称</td>
				<td>状态</td>
				<td>上下线操作</td>
				<td>预览量</td>
				<td>排序</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${blist}" var="item">
				<tr>
					<td>${item.bid}</td>
					<td>${item.btitle}</td>
					<td><c:if test="${item.state==0}">未审核</c:if> <c:if
							test="${item.state==1}">已上线</c:if> <c:if test="${item.state==2}">已下线</c:if></td>
					<td>
						<div class="btn-group">
							<button type="button" class="btn btn-default"
								onclick="onLine(${item.bid})">上线</button>
							<button type="button" class="btn btn-default"
								onclick="offLine(${item.bid})">下线</button>
						</div>
					</td>
					<td>${item.lookunm}</td>
					<td>yizhifu</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
<script type="text/javascript">
function onLine(id){
	
	location.href="<%=request.getContextPath()%>/banner/upLine.do?id="+id;
	
}
	function offLine(id){
		location.href="<%=request.getContextPath()%>/banner/offLine.do?id="+id;
	
	} 
	
	
</script>
</html>