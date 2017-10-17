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
<title>Tems_TOP</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"
	rel="stylesheet">
<link href="css/hover-min.css" rel="stylesheet" media="all">
<link href="css/demo-page.css" rel="stylesheet">
<link href="css/index_style.css" rel="stylesheet">
<!-- Font Awesomeを利用したい場合は -->
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet" media="all">
<!--[if lt IE 9]>
			<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
			<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
</head>
<body>

	<header>
		<jsp:include page="header.jsp" />
	</header>
	<article class="container">
		<div class="row">
		<form action="SelectTraningAction" method="post">
			<div class="input-group input-group-lg col-sm-6 col-sm-offset-3"
				style="margin-top: 250px;">
				<input name="searchName" type="text" class="form-control" placeholder="トレーニングを検索">
				<span class="input-group-btn">
					<button type="submit" class="btn btn-default">
						<span class="glyphicon glyphicon-search"></span>
					</button>
				</span>
			</div>
		</form>
			<div>
				<a href="SelectTraningAction" class="button hvr-float-shadow"
					style="font-size: 30px; margin-top: 50px;">トレーニング一覧</a> <a
					href="GoUploadAction" class="button hvr-float-shadow"
					style="font-size: 30px; width: 266px; margin-top: 50px;">投稿する</a>
			</div>
		</div>
	</article>
	<footer> </footer>
</body>
</html>