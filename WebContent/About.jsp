<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	import="java.util.*"%>
<head>
	<title>About</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <script src="static/jquery/jquery-2.2.4.min.js" type="text/javascript"></script>
<link rel="stylesheet"
	href="static/bootstrap/css/3.3.6/bootstrap.min.css">
	<link rel="stylesheet" href="static/H+/css/style.min.css">
<script src="static/bootstrap/js/3.3.6/bootstrap.min.js"
	type="text/javascript"></script>
</head>

<body style="background:url('image/aboutbackground.jpg') no-repeat;">
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
		</div>
	</div>
	
	
	<div id="myCarousel" class="carousel slide">
	<!-- 轮播（Carousel）指标 -->
	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
		<li data-target="#myCarousel" data-slide-to="2"></li>
	</ol>   
	<!-- 轮播（Carousel）项目 -->
	<div class="carousel-inner">
		<div class="item active">
			<img src="image/1.jpg" alt="First slide">
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
			<img src="image/3.jpg" alt="Third slide">
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
</body>
</html>