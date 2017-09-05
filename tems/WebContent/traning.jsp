<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- 国際化 -->
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%-- <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> --%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>traning</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet">
		<!--[if lt IE 9]>
			<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
			<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
  </head>
  <body>
    <header>
      <h2>トレーニング</h2>
      <nav class="navbar navbar-inverse">
      	<div class="container-fluid">
      		<div class="navbar-header">
      			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbarEexample7">
      				<span class="sr-only">Toggle navigation</span>
      				<span class="icon-bar"></span>
      				<span class="icon-bar"></span>
      				<span class="icon-bar"></span>
      			</button>
      			<a class="navbar-brand" href="#">
      				タイトル
      			</a>
      		</div>

      		<div class="collapse navbar-collapse" id="navbarEexample7">
      			<ul class="nav navbar-nav">
      				<li><a href="#">メニューＡ</a></li>
      				<li class="active"><a href="#">メニューＢ</a></li>
      				<li><a href="#">メニューＣ</a></li>
      			</ul>
      			<p class="navbar-text navbar-right">ようこそ <a href="#" class="navbar-link">ゲスト</a> さん。</p>
      		</div>
      	</div>
      </nav>
    </header>
    <article class="main container">
      <div class="row"><!-- アフィックス -->
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
        <div class="col-sm-4"><!-- 絞り込み -->
          <div class="dropdown">
	          <button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown" aria-expanded="false">
		          絞り込み
		          <span class="caret"></span>
	          </button>
	          <ul class="dropdown-menu" role="menu">
		          <li role="presentation"><a href="#">攻撃系</a></li>
		          <li role="presentation"><a href="#">守備系</a></li>
		          <li role="presentation"><a href="#">GK</a></li>
              <li role="presentation"><a href="#">フィジカル</a></li>
	          </ul>
          </div>
        </div>
        <div class="col-sm-4"><!-- 並び替え -->
          <div class="dropdown">
	          <button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown" aria-expanded="false">
		          並び替え
		          <span class="caret"></span>
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
      <!-- カテゴリの値によってパネルの色を変えたい -->
      <section class="traning_list ">
      <s:iterator value="traningList">
		<div class="panel panel-danger">
	        <div class="panel-heading">
		        <s:property value="name"/>
	        </div>
	        <div class="panel-body" class="row">
	        		<div class="col-sm-3">
	        		<img src="img/<s:property value="img"/>" style="width:100%">
	        		</div>
		        <div class="col-sm-offset-1 col-sm-5">
		        <s:property value="traning_text" />
		        </div>
	        </div>
        </div>
      </s:iterator>
        <!-- 攻撃系のパネル -->
        <div class="panel panel-danger">
	        <div class="panel-heading">
		        トレーニングメニュー（攻撃系）
	        </div>
	        <div class="panel-body">
		        トレーニングの内容
	        </div>
        </div>
        <!-- 守備系のメニュー -->
        <div class="panel panel-info">
	        <div class="panel-heading">
		        トレーニングメニュー（守備系）
	        </div>
	        <div class="panel-body">
		        トレーニングの内容
	        </div>
        </div>
        <!-- GKのメニュー -->
        <div class="panel panel-warning">
	        <div class="panel-heading">
		        トレーニングメニュー（GK）
	        </div>
	        <div class="panel-body">
		        トレーニングの内容
	        </div>
        </div>
          <!-- フィジカル系のメニュー -->
        <div class="panel panel-success">
	        <div class="panel-heading">
		        トレーニングメニュー（フィジカル系）
	        </div>
	        <div class="panel-body">
		        トレーニングの内容
	        </div>
        </div>
      </section>

    </article>
    <article class="sidemenu">

    </article>
    <footer>

    </footer>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
  </body>
</html>
