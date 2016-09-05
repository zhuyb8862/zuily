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
				<td>游记标题</td>
				<td>状态</td>
				<td>上下线操作</td>
				<td>预览量</td>
				<td>排序</td>
				<td>详情</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${travels}" var="item">
				<tr>
					<td>${item.tid}</td>
					<td>${item.tname}</td>
					
					<td><c:if test="${item.state==0}">未审核</c:if> <c:if
							test="${item.state==1}">已上线</c:if> <c:if test="${item.state==2}">已下线</c:if></td>
					<td>
						<div class="btn-group">
							<button type="button" class="btn btn-default"
								onclick="onLine(${item.tid})">上线</button>
							<button type="button" class="btn btn-default"
								onclick="offLine(${item.tid})">下线</button>
						</div>
					</td>
					<td>${item.look}</td>
					<td>排序暂时不做</td>
					<td><button type="button" class="btn btn-default"
							onclick="detail(${item.tid})">详情</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
<script type="text/javascript">

	function detail(tid){
		
		
		parent.location.href="<%=request.getContextPath()%>/travel/detail.do?tid="+tid;

	}
	
</script>


</html>