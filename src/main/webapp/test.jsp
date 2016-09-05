<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- <script type="text/javascript" src="/resource/js/jquery-1.10.2.js"></script> -->
<script type="text/javascript" src="/resource/js/jquery-1.10.2.js"></script>
<script type="text/javascript" src="/resource/js/query.form.js"></script>
<script type="text/javascript">
function uppic() {
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
			/* 			$("#allUrl").attr("src", data.url);
						$("#path").val(data.path); */
			picids = picids + "," + data;
			alert(data);

		}
	}
	alert("wwwwwwwwwwwww");
	$("#pform").ajaxSubmit(options);
}



</script>
</head>
<body>
	<h3>测试添加input</h3>
	
	<div onclick="test()">
	<label >ddddd(ss)</label></div>
	<form action="" id = "pform">
		<input type="file" name = "pic" onchange="uppic()">
	</form>
	
</body>

</html>