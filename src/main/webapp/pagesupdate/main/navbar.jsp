<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<link
	href="//cdn.bootcss.com/jquery.bootstrapvalidator/0.5.2/css/bootstrapValidator.min.css"
	rel="stylesheet">

<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="${pageContext.request.contextPath}/pages/main/main.jsp">ZUI LV YOU</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">设置 <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<!-- <li><a href="javascript:;" data-toggle="modal"
							data-target="#modpwdModal">修改密码</a></li> -->
						<li><a href="${pageContext.request.contextPath}/logout.action">退出</a></li>
					</ul></li>
			</ul>
			<!-- <form class="navbar-form navbar-right">
				<input type="text" class="form-control" placeholder="Search...">
			</form> -->
		</div>
	</div>
</nav>


<!-- 修改密码 -->
<div class="modal fade" id="modpwdModal" tabindex="-1" role="dialog"
	aria-labelledby="myModal">
	<div class="modal-dialog modal-md" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title">修改密码</h4>
			</div>
			<form action="/usr/modpwd" name="modpwdForm" id="modpwdForm"
				method="post" class="form-horizontal">
				<div class="modal-body">
					<div class="form-group">
						<label for="originalpwd" class="col-sm-4 control-label">原始密码</label>
						<div class="col-sm-8">
							<input type="password" class="form-control" id="originalpwd"
								size="16" name="originalpwd" placeholder="请输入原始密码">
						</div>
					</div>
					<div class="form-group">
						<label for="newpwd" class="col-sm-4 control-label">新密码</label>
						<div class="col-sm-8">
							<input type="password" class="form-control" id="newpwd" size="16"
								name="newpwd" placeholder="请输入新密码">
						</div>
					</div>
					<div class="form-group">
						<label for="renewpwd" class="col-sm-4 control-label">确认新密码</label>
						<div class="col-sm-8">
							<input type="password" class="form-control" id="renewpwd"
								size="16" name="renewpwd" placeholder="请确认新密码">
						</div>
					</div>
					<div class="modal-footer" style="text-align: center;"
						id="modal-footer">
						<button id="savebtn" type="submit" class="btn btn-primary">保存</button>
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					</div>
				</div>
			</form>
		</div>
	</div>

	<script
		src="//cdn.bootcss.com/jquery.bootstrapvalidator/0.5.2/js/bootstrapValidator.min.js"></script>
	<script
		src="//cdn.bootcss.com/jquery.bootstrapvalidator/0.5.2/js/language/zh_CN.min.js"></script>

	<script type="text/javascript">
		$(document).ready(
				function() {
					$('#modpwdForm').bootstrapValidator({
						//excluded : [ ':disabled', ':not(:visible)' ],
						message : 'This value is not valid',
						feedbackIcons : {
							valid : 'glyphicon glyphicon-ok',
							invalid : 'glyphicon glyphicon-remove',
							validating : 'glyphicon glyphicon-refresh'
						},
						fields : {
							originalpwd : {
								validators : {
									notEmpty : {
										message : '原始密码不能为空'
									}
								}
							},
							newpwd : {
								validators : {
									notEmpty : {
										message : '新密码不能为空'
									},
									stringLength : {
										min : 6,
										max : 16,
										message : '密码长度为6~16位'
									},
									regexp : {
										regexp : /^[a-zA-Z0-9]+$/,
										message : '密码只允许输入数字、大小写字母'
									},
									identical : {
										field : 'renewpwd',
										message : '两次输入密码不一致'
									}
								}
							},
							renewpwd : {
								validators : {
									notEmpty : {
										message : '确认密码不能为空'
									},
									stringLength : {
										min : 6,
										max : 16,
										message : '密码长度为6~16位'
									},
									regexp : {
										regexp : /^[a-zA-Z0-9]+$/,
										message : '密码只允许输入数字、大小写字母'
									},
									identical : {
										field : 'newpwd',
										message : '两次输入密码不一致'
									}
								}
							}
						}
					}).on(
							'success.form.bv',
							function(e) {
								debugger;
								// Prevent form submission
								e.preventDefault();
								// Get the form instance
								var $form = $(e.target);
								// Get the BootstrapValidator instance
								var bv = $form.data('bootstrapValidator');
								// Use Ajax to submit form data
								$.post($form.attr('action'), $form.serialize(),
										function(result) {
											$('#modpwdModal').modal('hide');
											console.log(result);
											if (result.msg == "200") {
												alert("密码修改成功，请重新登录");
												location.href = "/usr/tologin";
											} else {
												alert(result.msg);
											}
										}, 'json');
							});

					/**隐藏弹出窗时清除数据**/
					$('#modpwdModal').on('hide.bs.modal', function(e) {
						$("#originalpwd").val("");
						$("#newpwd").val("");
						$("#renewspwd").val("");
						$(this).removeData("bs.modal");
						$('#modpwdForm').bootstrapValidator('resetForm', true);
					});
				});
	</script>
</div>
