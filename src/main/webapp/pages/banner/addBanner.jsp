<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<li class="active"><a href="#">首页bnner->添加专题</a></li>
			</ul>
		</div>
		<div class="row">
			<div style="padding: 10px 50px 10px;">
				<form class="form-horizontal" role="form"
					action="<%=request.getContextPath()%>/banner/addBnner.do" id="pForm"
					method="post" enctype="multipart/form-data">
					<div class="form-group">
						<div class="col-xs-6">
							<span style="color: rgb(255, 140, 60);"
								class="glyphicon glyphicon-plus"> </span> <label>运营位图片（运营位入口的图片）</label>
						</div>
					</div>
					<div class="form-group" id="pic1">
						<div class="col-xs-2">
							<font color="red">*</font><span>添加图片</span>
						</div>
						<div class="col-xs-10">
							<input type="file"  name="pic">
						</div>
					</div>

					<div class="form-group">
						<div class="col-xs-4">
							<span style="color: rgb(255, 140, 60);"
								class="glyphicon glyphicon-plus"> </span> <label>基础信息</label>
						</div>
					</div>

					<div class="form-group">
						<div class="col-xs-2">
							<font color="red">*</font><span>名称标题</span>
						</div>
						<div class="col-xs-10">
							<input type="text" class="form-control " name="bname">
						</div>
					</div>
					<div class="form-group" id="pic1">
						<div class="col-xs-2">
							<font color="red">*</font><span>添加图片</span>
						</div>
						<div class="col-xs-10">
							<input type="file" id="inputfile" name="pics">
						</div>
					</div>
					<div class="form-group" style="display: block;" id="jourDes1">
						<div class="col-xs-2">
							<font color="red">*</font><span>专题描述</span>
						</div>
						<div class="col-xs-10">
							<textarea class="form-control" rows="2" name="bdsc"
								placeholder="最多100个字"></textarea>
						</div>
					</div>

					<div class="form-group" id="banner1">
						<div class="col-xs-2">
							<font color="red">*</font><span>关联商品1</span>
						</div>
						<div class="col-xs-7">
							<input type="text" name="itemid" class="form-control">
						</div>

					</div>
					<div class="form-group">
						<div class="col-xs-2"></div>
						<div class="col-xs-2">
							<label onclick="additemid_zhu('banner')">添加+</label>
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
	

	/* 图片 */
	var addPicNum = 1;
	function addPic_zhu(param) {
		var oid = param + addPicNum;
		addPicNum++;
		$("#" + oid)
				.after(
						"<div class='form-group' id = 'pic"+addPicNum+"'>"
								+ "<div class='col-xs-2'></div>"
								+ "<div class='col-xs-10'>"
								+ "<input type='file' id='inputfile' name='pic'></div></div>");
	}
	
	/* 关联商品*/
	var addfeenum = 1;
	function additemid_zhu(param) {
		var oid = param + addfeenum;
		addfeenum++;

		$("#" + oid)
				.after(
						"<div class='form-group' id='banner"+addfeenum+"'><div class='col-xs-2'><font color='red'>*</font>"
								+ "<span>关联商品"
								+ addfeenum
								+ "</span></div>"
								+ "<div class='col-xs-7'>"
								+ "<input tyep='text' name='itemid' class='form-control'>"
								+ "</div></div>");


	}
	
	function submitFrom() {
		if (confirm('确定提交么？')) {
			$("#pForm").submit();
		} else {

		}

	}
</script>
<script type="text/javascript">
//异步上传图片  jquery.form.js js语言模拟一个Form从而把图片提交上去
function uploadPic(){
	alert("aaaa");
	var options = {
			url : "<%=request.getContextPath()%>
	/banner/upload.do",
			type : "post",
			dataType : "json",
			success : function(data) {
				alert(data);
				//返回二个路径  
				//全路径  显示图片
				//相对路径  保存数据库
				//data.url  data.path
				$("#picurl").attr("src", data.url);
			}
		}
		//异步上传完成
		alert("aavvv");
		$("#pForm").ajaxSubmit(options);

	}
</script>
</html>