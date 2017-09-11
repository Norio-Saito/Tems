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
<title>traning</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"
	rel="stylesheet">
<!--[if lt IE 9]>
			<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
			<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
</head>
<body>
	<header>
		<jsp:include page="header.jsp" />
	</header>
	<article class="main container">
		<div class="row">
			<!-- アフィックス -->
			<!-- 検索欄は前ページに実装
        <div class="col-sm-4 ">
          <div class="input-group">
            <input type="text" class="form-control" placeholder="キーワードで検索">
            <span class="input-group-btn">
              <button class="btn btn-default" type="submit">
                <i class='glyphicon glyphicon-search'></i>
              </button>
            </span>
          </div>
        </div> -->
			<div class="col-sm-4">
				<!-- 絞り込み -->
				<div class="dropdown">
					<button class="btn btn-default dropdown-toggle" type="button"
						data-toggle="dropdown" aria-expanded="false">
						絞り込み <span class="caret"></span>
					</button>
					<ul class="dropdown-menu" role="menu">
						<li role="presentation"><a href="#">攻撃系</a></li>
						<li role="presentation"><a href="#">守備系</a></li>
						<li role="presentation"><a href="#">GK</a></li>
						<li role="presentation"><a href="#">フィジカル</a></li>
					</ul>
				</div>
			</div>
			<div class="col-sm-4">
				<!-- 並び替え -->
				<div class="dropdown">
					<button class="btn btn-default dropdown-toggle" type="button"
						data-toggle="dropdown" aria-expanded="false">
						並び替え <span class="caret"></span>
					</button>
					<ul class="dropdown-menu" role="menu">
						<li role="presentation"><a href="#">新着順</a></li>
						<li role="presentation"><a href="#">レビューの高い順</a></li>
						<li role="presentation"><a href="#">閲覧数の多い順</a></li>
					</ul>
				</div>
			</div>
		</div>
		<!-- トレーニングの一覧。のちにイテレータで表示 -->
		<!-- カテゴリの値によってパネルの色を変える予定 -->
		<section class="traning_list ">
			<s:iterator value="traningList">
				<s:if test="category == 0">
					<!-- 攻撃系のパネル（赤） -->
					<div class="panel panel-danger">
						<div class="panel-heading">
							<a href="SelectTraningAction"><s:property value="name" /></a>
						</div>
						<div class="panel-body" class="row">
							<div class="col-sm-3">
								<img src="img/<s:property value="img"/>" style="width: 100%">
							</div>
							<div class="col-sm-offset-1 col-sm-5">
								<s:property value="traning_text" />
							</div>
						</div>
					</div>
				</s:if>
				<s:elseif test="category == 1">
					<!-- 守備系のメニュー(青） -->
					<div class="panel panel-info">
						<div class="panel-heading">
							<a href="SelectTraningAction"><s:property value="name" /></a>
						</div>
						<div class="panel-body" class="row">
							<div class="col-sm-3">
								<img src="img/<s:property value="img"/>" style="width: 100%">
							</div>
							<div class="col-sm-offset-1 col-sm-5">
								<s:property value="traning_text" />
							</div>
						</div>
					</div>
				</s:elseif>
				<s:elseif test="category == 2">
					<!-- ポゼッション(黄） -->
					<div class="panel panel-warning">
						<div class="panel-heading">
							<a href="SelectTraningAction"><s:property value="name" /></a>
						</div>
						<div class="panel-body" class="row">
							<div class="col-sm-3">
								<img src="img/<s:property value="img"/>" style="width: 100%">
							</div>
							<div class="col-sm-offset-1 col-sm-5">
								<s:property value="traning_text" />
							</div>
						</div>
					</div>
				</s:elseif>
				<s:elseif test="category == 3">
					<!-- セットプレー(緑） -->
					<div class="panel panel-success">
						<div class="panel-heading">
							<a href="SelectTraningAction"><s:property value="name" /></a>
						</div>
						<div class="panel-body" class="row">
							<div class="col-sm-3">
								<img src="img/<s:property value="img"/>" style="width: 100%">
							</div>
							<div class="col-sm-offset-1 col-sm-5">
								<s:property value="traning_text" />
							</div>
						</div>
					</div>
				</s:elseif>
			</s:iterator>
		</section>

	</article>
	<article class="sidemenu"></article>
	<footer> </footer>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</body>
</html>
