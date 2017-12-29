<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	import="java.util.*"%>
<head>
	<title>Log In</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <script src="static/jquery/jquery-2.2.4.min.js" type="text/javascript"></script>
<link rel="stylesheet"
	href="static/bootstrap/css/3.3.6/bootstrap.min.css">
	<link rel="stylesheet" href="static/H+/css/style.min.css">
<script src="static/bootstrap/js/3.3.6/bootstrap.min.js"
	type="text/javascript"></script>
</head>

<body style="background:url('image/loginbackground.jpg') ;">
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">TaiPark</a>
				</div>
				
	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							 <a href="#">登陆</a>
						</li>
						<li>
							 <a href="#">上传</a>
						</li>
						<li>
							 <a href="#">数据</a>
						</li>
						<li>
							 <a href="#">关于</a>
						</li>
					</ul>	
				</div>
				
			</nav>
			<div class="row clearfix">
				
				<div class="col-md-6 column">
					<div class="jumbotron" style="text-align:center;">
						<h1>
							Face Recognition System
						</h1>
						<p>
							This is a face recognition system supported by Baidu Brain.Please log in your account and enjoy your recognition!
						</p>
						<p>
							 <a class="btn btn-primary btn-large" href="#">Learn more</a>
						</p>
					</div>
				</div><div class="col-md-6 column">
				<br><br><br><br><br><br><br><br>
					<form class="form-horizontal" role="form" action="login" method="post">
						<div class="form-group">
							 <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
							<div class="col-sm-10">
								<input name="inputEmail" type="email" class="form-control" id="inputEmail" />
							</div>
						</div>
						<br>
						<div class="form-group">
							 <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
							<div class="col-sm-10">
								<input name="inputPassword" type="password" class="form-control" id="inputPassword" />
							</div>
						</div>
						
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<div class="checkbox">
									 <label><input type="checkbox" />Remember me</label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								 <button type="submit" class="btn btn-default">Sign in</button>
							</div>
						</div>
					</form>
					
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-12 column">
						<div id="myCarousel" class="carousel slide">
	<!-- 轮播（Carousel）指标 -->
	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
		<li data-target="#myCarousel" data-slide-to="2"></li>
	</ol>   
	<!-- 轮播（Carousel）项目 -->
	<div class="carousel-inner" width="600" height="800">
		<div class="item active" >
			<img src="image/3.jpg" alt="First slide">
			<div class="carousel-caption">
							<h4>
								Introduce
							</h4>
							<p>
								This is a Java project based on Baidu brain artificial intelligence platform, which uses the Baidu brain SDK, BootStrap and other related technologies. The project recognizes faces and saves them in a database and has the ability to add, delete, and modify databases.
							</p>
						</div>
		</div>
		<div class="item">
			<img src="image/2.jpg" alt="Second slide">
			<div class="carousel-caption">
							<h4>
								はじめに
							</h4>
							<p>
								これは、Baiduの脳のSDK、BootStrapおよびその他の関連技術を使用してBaiduの脳の人工知能プラットフォームに基づいてJavaプロジェクトです。 プロジェクトは顔を認識してデータベースに保存し、データベースを追加、削除、変更することができます。
							</p>
						</div>
		</div>
		<div class="item">
			<img src="image/1.jpg" alt="Third slide">
			<div class="carousel-caption">
							<h4>
								介紹
							</h4>
							<p>
								這是一個基於百度大腦人工智能平台的Java項目，其中用到了百度大腦SDK，BootStrap和其他相關技術。該項目能夠識別人臉並將其保存在數據庫中且擁有對數據庫增刪改查的功能。
							</p>
						</div>
		</div>
	</div>
	<!-- 轮播（Carousel）导航 -->
	<a class="carousel-control left" href="#myCarousel" 
	   data-slide="prev">&lsaquo;</a>
	<a class="carousel-control right" href="#myCarousel" 
	   data-slide="next">&rsaquo;</a>
</div> 
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>