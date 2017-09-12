<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- 国際化 -->
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%-- <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> --%>
<!DOCTYPE html>
<html>
<head>
<body>
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbarEexample7">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="GoTopAction"> Tems </a>
				</div>

				<div class="collapse navbar-collapse" id="navbarEexample7">
					<ul class="nav navbar-nav">
						<li><a href="SelectTraningAction">Traning List</a></li>
						<li><a href="GoUploadAction">Upload New Traning</a></li>
						<li><a href="#">メニューＣ</a></li>
					</ul>
					<p class="navbar-text navbar-right">
						ようこそ <a href="#" class="navbar-link">ゲスト</a> さん。
					</p>
				</div>
			</div>
		</nav>
	</header>
</body>
</html>