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
	<article>
		<s:if test="category == 0">
			<div class="panel panel-danger">
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