<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<%@include file="/pages/main/head.jsp"%>
<script type="text/javascript">
	/* 	$(document).ready(function() {

	 }); */
	function addTime_zhu(a, c, b, d) {
		$("#" + a).attr('style', 'display:none;');

		$("#" + b).attr('style', 'display:block;');
		$("#" + c).attr('style', 'display:block;');
		$("#" + d).attr('style', 'display:block;');
	}
</script>
</head>

<body>
	<!-- navbar -->
	<%@include file="/pages/main/navbar.jsp"%>
	<br />
	<br />
	<br />
	<div class="container-fluid">
		<div class="row">
			<%@include file="/pages/main/left.jsp"%>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">



				<div style="padding: 10px 50px 10px;">
					<form class="form-horizontal" role="form"
						action="<%=request.getContextPath()%>/item/publishItem.do"
						id="pForm" method="post" enctype="multipart/form-data">
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
								<input type="text" class="form-control" name="iname">
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-2">
								<font color="red">*</font><span>产品分类</span>
							</div>
							<div class="col-xs-3">
								<select class="form-control" name="type">
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-2">
								<font color="red">*</font><span>价格</span>
							</div>
							<div class="col-xs-6 radio">
								<label> <input type="radio" name="noFree"
									id="optionsRadios1" value="option1" checked> 收费
								</label> <input type="text" width="100%" id="fee" name="fee">
							</div>
							<!-- 	<div class="col-xs-2">
							
						</div> -->
							<div class="col-xs-2 radio">
								<label> <input type="radio" name="free"
									id="optionsRadios2" value="option2"> 免费
								</label>
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-2">
								<font color="red">*</font><span>目的地</span>
							</div>
							<div class="col-xs-10">
								<input type="text" class="form-control " name="destination">
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-2">
								<font color="red">*</font><span>行程时间1</span>
							</div>
							<div class="col-xs-10">
								<input class="  laydate-icon " id="stime1" name="time1"
									value="开始时间"><label>至</label> <input
									class="laydate-icon " id="etime1" name="eTime1" value="结束时间">
							</div>
						</div>
						<div class="form-group" style="display: block;" id="2">
							<div class="col-xs-2"></div>
							<div class="col-xs-10" onclick="addTime_zhu('2','3','t2')">
								<label>添加时间+</label>
							</div>
						</div>
						<div class="form-group" style="display: none;" id="t2">
							<div class="col-xs-2">
								<font color="red">*</font><span>行程时间2</span>
							</div>
							<div class="col-xs-10">
								<input class="  laydate-icon " id="stime2" name="time2"
									value="开始时间"><label>至</label> <input
									class="laydate-icon " id="etime2" name="eTime2" value="结束时间">
								<!-- <label
								onclick="delTime('2','3','t2')">删除时间</label> -->
							</div>
						</div>
						<div class="form-group" style="display: none;" id="3">
							<div class="col-xs-2"></div>
							<div class="col-xs-10" onclick="addTime_zhu('3','4','t3')">
								<label>添加时间+</label>
							</div>
						</div>
						<div class="form-group" style="display: none;" id="t3">
							<div class="col-xs-2">
								<font color="red">*</font><span>行程时间3</span>
							</div>
							<div class="col-xs-10">
								<input class="  laydate-icon " id="stime3" name="time3"
									value="开始时间"><label>至</label> <input
									class="laydate-icon " id="etime3" name="eTime3" value="结束时间">
								<!-- <label
								onclick="delTime('3','4','t3')">删除时间</label> -->
							</div>
						</div>
						<div class="form-group" style="display: none;" id="4">
							<div class="col-xs-2"></div>
							<div class="col-xs-10" onclick="addTime_zhu('4','','t4')">
								<label>添加时间+</label>
							</div>
						</div>
						<div class="form-group" style="display: none;" id="t4">
							<div class="col-xs-2">
								<font color="red">*</font><span>行程时间4</span>
							</div>
							<div class="col-xs-10">
								<input class="  laydate-icon " id="stime4" name="time4"
									value="开始时间"><label>至</label> <input
									class="laydate-icon " id="etime4" name="eTime4" value="结束时间">
								<!-- <label
								onclick="delTime('4','','t4')">删除时间</label> -->
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-2">
								<font color="red"></font><span>商家电话</span>
							</div>
							<div class="col-xs-6">
								<input type="text" class="form-control " name="tel">
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-2">
								<font color="red"></font><span>来源网站</span>
							</div>
							<div class="col-xs-10">
								<input type="text" class="form-control " name="srcUrl">
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-2">
								<font color="red">*</font><span>商品简介</span>
							</div>
							<div class="col-xs-10">
								<textarea class="form-control" rows="2" name="iDiscr"></textarea>
							</div>
						</div>
						<div class="form-group" id="pic1">
							<div class="col-xs-2">
								<font color="red">*</font><span>添加图片</span>
							</div>
							<div class="col-xs-10">
								<input type="file" id="inputfile" name="pic">
							</div>
						</div>
						<div class="form-group" style="display: block;" id="addDesign1">
							<div class="col-xs-2"></div>
							<div class="col-xs-2" onclick="addPic_zhu('pic')">
								<label>图片+</label>
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-4">
								<span style="color: rgb(255, 140, 60);"
									class="glyphicon glyphicon-plus"> </span> <label>行程描述</label>
							</div>
						</div>
						<input type="hidden" name="jourtimes" value="1" id="jplan">
						<div class="form-group">
							<div class="col-xs-2">
								<font color="red">*</font><span>行程安排1</span>
							</div>
							<div class="col-xs-10">
								<input type="text" class="form-control " name="Jtitle1"
									placeholder="行程小标题。。。">
							</div>
						</div>
						<div class="form-group" style="display: block;" id="jourDes1">
							<div class="col-xs-2"></div>
							<div class="col-xs-10">
								<textarea class="form-control" rows="2" name="Jdescr1"
									placeholder="最多100个字"></textarea>
							</div>
						</div>
						<div class="form-group" style="display: block;" id="addDesign1">
							<div class="col-xs-2"></div>
							<div class="col-xs-2" onclick="add_zhu('jourDes')">

								<label>添加安排+</label>
							</div>
						</div>

						<div class="form-group">
							<div class="col-xs-4">
								<span style="color: rgb(255, 140, 60);"
									class="glyphicon glyphicon-plus"> </span><label>费用说明</label>
							</div>
						</div>
						<input type="hidden" name="includFeetimes" value="1"
							id="includFee">
						<div class="form-group" id="fee1">
							<div class="col-xs-2">
								<font color="red">*</font><span>费用包含1</span>
							</div>
							<div class="col-xs-7">
								<input type="text" name="feeinclud1" class="form-control">
							</div>

						</div>
						<div class="form-group">
							<div class="col-xs-2"></div>
							<div class="col-xs-2">
								<label onclick="addInpt_zhu('fee')">添加+</label>
							</div>
						</div>
						<input type="hidden" name="excludFeetimes" value="1"
							id="excludFee">
						<div class="form-group" id="exFee1">
							<div class="col-xs-2">
								<font color="red">*</font><span>费用不包含1</span>
							</div>
							<div class="col-xs-7">
								<input type="text" name="feeExclud1" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-2"></div>
							<div class="col-xs-2">
								<label onclick="addExFee_zhu('exFee')">添加+</label>
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-4">
								<span style="color: rgb(255, 140, 60);"
									class="glyphicon glyphicon-plus"> </span><label>预定须知</label>
							</div>
						</div>
						<input type="hidden" name="noticetimes" value="1" id="noticetime">
						<div class="form-group" id="notice1">
							<div class="col-xs-2">
								<font color="red">*</font><span>预定须知</span>
							</div>
							<div class="col-xs-7">
								<input type="text" name="notice1" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-2"></div>
							<div class="col-xs-2">
								<label onclick="addNotice_zhu('notice')">添加+</label>
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
	</div>
<!-- footer -->
	<%@include file="/pages/main/footer.jsp" %>
</body>
<script type="text/javascript">
	/*预定须知  */
	var addNoticeNum = 1;
	function addNotice_zhu(param) {
		var oid = param + addNoticeNum;
		addNoticeNum++;
		$("#" + oid)
				.after(
						"<div class='form-group' id='notice"+addNoticeNum+"'>"
								+ "<div class='col-xs-2'></div>"
								+ "<div class='col-xs-7'>"
								+ "<input type='text' name='notice"+addNoticeNum+"' class='form-control'>"
								+ "</div></div>");
		$("#noticetime").val(addNoticeNum);

	}

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
	/* 行程安排 */
	var addJourNum = 1;
	function add_zhu(param) {
		var oid = param + addJourNum;
		addJourNum++;

		$("#" + oid)
				.after(
						"<div class='form-group'>"
								+ "<div class='col-xs-2'>"
								+ "<font color='red'>*</font><span>行程安排"
								+ addJourNum
								+ "</span>"
								+ "</div>"
								+ "<div class='col-xs-10'>"
								+ "<input type='text' class='form-control ' name='Jtitle"+addJourNum+"' placeholder='行程小标题。。。'>"
								+ "</div>"
								+ "</div>"
								+ "<div class='form-group' style='display: block;' id = 'jourDes"+addJourNum+"'>"
								+ "<div class='col-xs-2'></div>"
								+ "<div class='col-xs-10'>"
								+ "<textarea class='form-control' rows='2' name='Jdescr"+addJourNum+"' placeholder='最多100个字'></textarea>"
								+ "</div></div>");
		$("#jplan").val(addJourNum);
	}
	/* 费用包含 */
	var addfeenum = 1;
	function addInpt_zhu(param) {
		var oid = param + addfeenum;
		addfeenum++;

		$("#" + oid)
				.after(
						"<div class='form-group' id='fee"+addfeenum+"'><div class='col-xs-2'><font color='red'>*</font>"
								+ "<span>费用包含"
								+ addfeenum
								+ "</span></div>"
								+ "<div class='col-xs-7'>"
								+ "<input tyep='text' name='feeinclud"+addfeenum+"' class='form-control'>"
								+ "</div></div>");
		$("#includFee").val(addfeenum);

	}
	/* 费用不包含 */
	var addExFeeNum = 1;
	function addExFee_zhu(param) {
		var oid = param + addExFeeNum;
		addExFeeNum++;

		$("#" + oid)
				.after(
						"<div class='form-group' id='exFee"+addExFeeNum+"'><div class='col-xs-2'><font color='red'>*</font>"
								+ "<span>费用不包含"
								+ addExFeeNum
								+ "</span></div>"
								+ "<div class='col-xs-7'>"
								+ "<input tyep='text' name='feeExclud"+addExFeeNum+"' class='form-control'>"
								+ "</div></div>");

		$("#excludFee").val(addExFeeNum);
	}
	function submitFrom() {
		if (confirm('确定提交么？')) {
			$("#pForm").submit();
		} else {

		}

	}
</script>
<script type="text/javascript">
	!function() {
		laydate.skin('molv');//切换皮肤，请查看skins下面皮肤库
		laydate({
			elem : '#stime1'
		}); //绑定元素
		laydate({
			elem : '#etime1'
		});
		laydate({
			elem : '#stime2'
		});
		laydate({
			elem : '#etime2'
		});
		laydate({
			elem : '#stime3'
		});
		laydate({
			elem : '#etime3'
		});
		laydate({
			elem : '#stime4'
		});
		laydate({
			elem : '#etime4'
		});
	}();

	//日期范围限制
	var start = {
		elem : '#start',
		format : 'YYYY-MM-DD',
		min : laydate.now(), //设定最小日期为当前日期
		max : '2099-06-16', //最大日期
		istime : true,
		istoday : false,
		choose : function(datas) {
			end.min = datas; //开始日选好后，重置结束日的最小日期
			end.start = datas //将结束日的初始值设定为开始日
		}
	};

	var end = {
		elem : '#end',
		format : 'YYYY-MM-DD',
		min : laydate.now(),
		max : '2099-06-16',
		istime : true,
		istoday : false,
		choose : function(datas) {
			start.max = datas; //结束日选好后，充值开始日的最大日期
		}
	};
	laydate(start);
	laydate(end);

	//自定义日期格式
	/* laydate({
	 elem: '#test1',
	 format: 'YYYY年MM月DD日',
	 festival: true, //显示节日
	 choose: function(datas){ //选择日期完毕的回调
	 alert('得到：'+datas);
	 }
	 }); */

	//日期范围限定在昨天到明天
	/* laydate({
	 elem: '#hello3',
	 min: laydate.now(-1), //-1代表昨天，-2代表前天，以此类推
	 max: laydate.now(+1) //+1代表明天，+2代表后天，以此类推
	 }); */
</script>
</html>