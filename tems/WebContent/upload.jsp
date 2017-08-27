<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- 国際化 -->
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%-- <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>UPLOAD</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"
	rel="stylesheet">
<!--[if lt IE 9]>
			<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
			<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
<style media="screen">
form div {
	margin: 10px;
}
</style>
</head>
<body>
	<header>
		<!-- 後にheader.jspでインクルード -->
		<h2>トレーニングを投稿する</h2>
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbarEexample7">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#"> タイトル </a>
				</div>

				<div class="collapse navbar-collapse" id="navbarEexample7">
					<ul class="nav navbar-nav">
						<li><a href="#">メニューＡ</a></li>
						<li class="active"><a href="#">メニューＢ</a></li>
						<li><a href="#">メニューＣ</a></li>
					</ul>
					<p class="navbar-text navbar-right">
						ようこそ <a href="#" class="navbar-link">ゲスト</a> さん。
					</p>
				</div>
			</div>
		</nav>
	</header>
	<article class="container">
		<div class="panel panel-primary">
			<div class="panel-heading">トレーニングを投稿する</div>
			<div class="panel-body">
				<form class="form-horizontal" action="InsertTraningAction"
					method="post">
					<!-- トレーニング名の入力フォーム -->
					<div class="input-group">
						<span class="input-group-addon">トレーニング名</span> <input type="text"
							name="traning_name" class="form-control" placeholder="トレーニング名を入力">
					</div>
					<!-- トレーニング種別のドロップダウン -->
										<!-- 選択ボックス -->
										<div class="input-group">
											<span class="input-group-addon">トレーニング種別を選択</span>
											<select class="form-control" style="width:30%;">
												<option value="1">攻撃系</option>
												<option value="1">守備系</option>
												<option value="1">GK</option>
												<option value="1">フィジカル</option>
											</select>
										</div>
<!-- 					<div class="btn-group"> -->
<!-- 						<button type="button" class="btn btn-default dropdown-toggle" -->
<!-- 							data-toggle="dropdown" aria-expanded="false"> -->
<%-- 							トレーニングの種類を選択 <span class="caret"></span> --%>
<!-- 						</button> -->
<!-- 						<ul class="dropdown-menu" role="menu"> -->
<!-- 							<li role="presentation"><a role="menuitem" tabindex="-1" -->
<!-- 								href="#">攻撃系</a></li> -->
<!-- 							<li role="presentation"><a role="menuitem" tabindex="-1" -->
<!-- 								href="#">守備系</a></li> -->
<!-- 							<li role="presentation"><a role="menuitem" tabindex="-1" -->
<!-- 								href="#">ゴールキーパー</a></li> -->
<!-- 							<li role="presentation"><a role="menuitem" tabindex="-1" -->
<!-- 								href="#">フィジカル</a></li> -->
<!-- 						</ul> -->
<!-- 					</div> -->
					<!-- 人数を入力 -->
					<div class="input-group">
						<span class="input-group-addon">人数</span> <input type="text"
							name="person" class="form-control" placeholder="トレーニング人数を入力">
					</div>
					<!-- 内容を入力 -->
					<div class="input-group">
						<span class="input-group-addon">トレーニング内容</span>
						<textarea name="traning_text" class="form-control"
							placeholder="具体的なトレーニングの内容を入力"></textarea>
					</div>
					<!-- キーワード -->
					<div class="input-group">
						<span class="input-group-addon">キーワード</span> <input type="text"
							name="key_word" class="form-control" placeholder="シュートなど">
					</div>
					<!-- 画像ファイルの選択 -->
					<div class="input-group text-center">
						<span class="input-group-addon">画像</span> <input type="file"
							name="traning_image" class="form-control">
					</div>
					<!-- 送信ボタン -->
					<div class="text-center">
						<button type="submit" class="btn btn-success">投稿する</button>
						<button type="submit" class="btn btn-danger">キャンセル</button>
					</div>
				</form>
			</div>
		</div>
	</article>
	<footer> </footer>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</body>
</html>
