<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>

<html>

	<head>
		<meta charset="UTF-8">
		<title>添加管理员</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- Bootstrap CSS -->
		<link href="<%=basePath%>jsp/mayibackstage/css/bootstrap.min.css" rel="stylesheet">
		<!-- index CSS -->
		<link href="<%=basePath%>jsp/mayibackstage/css/index.css" rel="stylesheet">
		<!-- jquery JS -->
		<script src="<%=basePath%>jsp/mayibackstage/js/jquery-3.3.1.js"></script>
		<!-- Bootstrap JS  -->
		<script src="<%=basePath%>jsp/mayibackstage/js/bootstrap.min.js"></script>
	</head>

	<body>
		<!--内容开始-->
		<div class="container-fluid">
			<div class="kuang" style="margin-top: 2%; margin-left: 5%;">
				<h5 class="">添加管理员</h5>
			</div>
			<!--水平线-->
			<hr style="margin-left: 5%;" align="left" width="85%;" color="#FFAC0E" size="" />

			<!--表单开始-->
			<form class="form-horizontal">
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">姓名</label>
					<div class="col-sm-3">
						<input name="a_mane" type="text" class="form-control" id="fname" placeholder="name"><span id='DivFname'></span>
					</div>
				</div>
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">用户名</label>
					<div class="col-sm-3">
						<input name="a_user" type="text" class="form-control" id="inputEmail3" placeholder="username">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
					<div class="col-sm-3">
						<input name="a_password" type="password" class="form-control" id="inputPassword3" placeholder="Password">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">电话</label>
					<div class="col-sm-3">
						<input name="a_phone" type="text" class="form-control" id="" placeholder="13594546545">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">职位</label>
					<div class="col-sm-3">
						<input name="a_position" type="text" class="form-control" id="" placeholder="经理">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">年龄</label>
					<div class="col-sm-3">
						<input name="a_age" type="text" class="form-control" id="inputPassword3" placeholder="20">
					</div>
				</div>
				<div class="form-group">

					<label for="exampleInputFile" class="col-sm-2 control-label">头像</label>
					<div class="col-sm-3">
						<input id="url1" name="a_images" type="text" class="dfinput" value="" readonly="readonly">
						<input type="button" id="image1" class="dfinput" style="width:100px;" value="点我选择图片">
						<a href="#" id="clearImagePath1">清除路径</a>
						<i></i>

					</div>
				</div>
				<div class="form-group">

					<label for="exampleInputFile" class="col-sm-2 control-label">性别</label>
					<div class="col-sm-3">
						<label>
      				<input name="a_sex" type="radio" name="optionsRadios"   id="optionsRadios1" value="1" checked> 男
      				<input name="a_sex" type="radio" name="optionsRadios" id="optionsRadios2"  value="0">女
     				
  					 </label>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-1">
						<button type="submit" style="background-color: #00A1EC;color: #FFFFFF;" class="btn btn-default">添加</button>

					</div>
					<div class="col-sm-offset-1 col-sm-1">
						<button type="reset" style="background-color: #C30202;color: #FFFFFF;" class="btn btn-default">重置</button>

					</div>
				</div>
			</form>

			<!--表单结束-->

			<!--内容结束-->
		</div>

	</body>

</html>