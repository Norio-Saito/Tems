<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%-- <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Traning</title>
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
	<article class="container">
		<!-- テスト -->
		<div class="row">
			<div class="panel panel-danger">
				<div class="panel-heading">
					<h3>トレーニング名</h3>
					<span class="label label-default">攻撃系トレーニング</span>
				</div>
				<div class="panel-body">
					<h4 style="position:relative;
    margin:0 -1px;
    font:bold 30px/1.6 Arial, Helvetica, sans-serif;
    text-align:center;
    color:#333;
    background:#f0e800;
    -webkit-transform: rotate(-3deg) skew(-3deg);
    -moz-transform: rotate(-3deg) skew(-3deg);
    -o-transform: rotate(-3deg) skew(-3deg);
    -ms-transform: rotate(-3deg) skew(-3deg);
    transform: rotate(-3deg) skew(-3deg);

    text-shadow:1px 1px 0 rgba(255,255,255,1);

    box-shadow: 0 1px 2px 0 rgba(0,0,0,0.2),

                30px 0 0 0 #f0e800,

                -30px 0 0 0 #f0e800;
					">トレーニングの目的</h4>
					<p>goal</p>
					<h4>キーワード</h4>
					<p>keyword</p>
					<h4>トレーニング人数</h4>
					<p>nop_min ~ nop_max</p>
					<h4>トレーニング範囲</h4>
					<p>organize</p>
					<h4>トレーニング方法</h4>
					<p>traning_text</p>
					<img src="img/soccer_jpg.jpg" style="width:300px;height:100%;">
					<h4>見るべきポイント</h4>
					<p>phenomenon</p>
				</div>
			</div>
		</div>


		<s:if test="category == 0">
			<div class="panel panel-danger">
				<div class="panel-heading">
					トレーニング名
					<s:property value="traning_name" />
					<span class="label label-default">オフェンストレーニング</span>
				</div>
				<div class="panel-body">
					<s:property value="category" />
					<s:property value="nop_max" />
					<s:property value="nop_min" />
					<s:property value="traning_text" />
					<s:property value="organize" />
					<s:property value="phenomenon" />
					<s:property value="img" />
				</div>
			</div>
		</s:if>
		<s:elseif test="category == 1">
			<div class="panel panel-info">
				<div class="panel-heading">
					<s:property value="traning_name" />
					<span class="label label-default">オフェンストレーニング</span>
				</div>
				<div class="panel-body">
					<s:property value="category" />
					<s:property value="nop_max" />
					<s:property value="nop_min" />
					<s:property value="traning_text" />
					<s:property value="organize" />
					<s:property value="phenomenon" />
					<s:property value="img" />
				</div>
			</div>
		</s:elseif>
		<s:elseif test="category == 2">
			<div class="panel panel-warning">
				<div class="panel-heading">
					<s:property value="traning_name" />
					<span class="label label-default">オフェンストレーニング</span>
				</div>
				<div class="panel-body">
					<s:property value="category" />
					<s:property value="nop_max" />
					<s:property value="nop_min" />
					<s:property value="traning_text" />
					<s:property value="organize" />
					<s:property value="phenomenon" />
					<s:property value="img" />
				</div>
			</div>
		</s:elseif>
		<s:elseif test="category == 3">
			<div class="panel panel-success">
				<div class="panel-heading">
					<s:property value="traning_name" />
					<span class="label label-default">オフェンストレーニング</span>
				</div>
				<div class="panel-body">
					<s:property value="category" />
					<s:property value="nop_max" />
					<s:property value="nop_min" />
					<s:property value="traning_text" />
					<s:property value="organize" />
					<s:property value="phenomenon" />
					<s:property value="img" />
				</div>
			</div>
		</s:elseif>
	</article>
	<footer> </footer>

</body>
</html>