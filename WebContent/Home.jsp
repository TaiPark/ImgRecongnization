<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	import="java.util.*"%>
<head>
<title>Home</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <script src="static/jquery/jquery-2.2.4.min.js" type="text/javascript"></script>
<link rel="stylesheet"
	href="static/bootstrap/css/3.3.6/bootstrap.min.css">
	<link rel="stylesheet" href="static/H+/css/style.min.css">
<script src="static/bootstrap/js/3.3.6/bootstrap.min.js"
	type="text/javascript"></script>
</head>

<body style="background:url('image/homebackground.jpg'); background-size:contain;">
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">Brand</a>
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
				<br><br>
					<form role="form" action="picupdate">		
						<div class="form-group">
							<div class="form-group">
							 <label for="InputName">Name</label><input type="text" class="form-control" id="InputName" />
						</div>
							 <label for="exampleInputFile">File input</label><input type="file" id="exampleInputFile" />
							<p class="help-block">
								Please select the picture you want to identify.
							</p>
						</div>
						 <button type="submit" class="btn btn-default">Submit</button>
					</form>
				</div>
				<div class="col-md-6 column">
				<br>
				<br>
					<img alt="140x140" src="v3/default3.jpg" class="img-thumbnail" />
				</div>
			</div>
			<div class="alert alert-success alert-dismissable">
				 <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
				<h4>
					注意!
				</h4>
				请尽量选择清晰的正面照！<br> 
				<strong>Warning!</strong>Please select a clear frontal view！<br>
				<strong>ノート!</strong>クリアなフロント写真を選択してください! <br>


			</div>
		</div>
	</div>
</div>
</body>
</html>