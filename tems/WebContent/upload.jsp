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
	margin: 30px;
}
</style>
</head>
<body>
	<header>
		<jsp:include page="header.jsp" />
	</header>
	<article class="container">
		<div class="panel panel-primary">
			<div class="panel-heading">トレーニングを投稿する</div>
			<div class="panel-body">
				<form class="form-horizontal" action="InsertTraningAction"
					enctype="multipart/form-data" method="post">
					<!-- トレーニング名の入力フォーム -->
					<div class="input-group">
						<span class="input-group-addon">トレーニング名</span> <input type="text"
							name="name" class="form-control" placeholder="トレーニング名を入力">
					</div>
					<!-- トレーニング種別のドロップダウン -->
					<!-- 選択ボックス -->
					<div class="input-group">
						<span class="input-group-addon">トレーニング種別を選択</span> <select
							class="form-control" style="width: 30%;" name="category">
							<option value="0">攻撃系</option>
							<option value="1">守備系</option>
							<option value="2">ポゼッション</option>
							<option value="3">セットプレー</option>
						</select>
					</div>
					<!-- 目標 -->
					<div class="input-group">
						<span class="input-group-addon">トレーニングの目的</span> <input
							type="text" name="goal" class="form-control"
							placeholder="選手間の連動性を高めるなど">
					</div>
					<!-- 人数を入力 -->
					<div class="input-group">
						<!-- 最小人数を入力 -->
						<span class="input-group-addon">最小人数</span> <input type="text"
							name="nop_min" class="form-control" placeholder="トレーニング人数を入力">
						<!-- 最大人数を入力 -->
						<span class="input-group-addon">最大人数</span> <input type="text"
							name="nop_max" class="form-control" placeholder="トレーニング人数を入力">
					</div>
					<!-- トレーニング範囲 -->
					<div class="input-group">
						<span class="input-group-addon">トレーニング範囲</span> <input type="text"
							name="organize" class="form-control" placeholder="15m X 15m">
					</div>
					<!-- 内容を入力 -->
					<div class="input-group">
						<span class="input-group-addon">トレーニング内容</span>
						<textarea name="traning_text" class="form-control" rows="15"
							placeholder="具体的なトレーニングの内容を入力"></textarea>
					</div>
					<!-- 見るべきポイント -->
					<div class="input-group">
						<span class="input-group-addon">見るべきポイント</span> <input type="text"
							name="phenomenon" class="form-control" placeholder="アプローチの早さなど">
					</div>
					<!-- キーワード -->
					<div class="input-group" id="keyword1">
						<span class="input-group-addon">キーワード1</span> <input type="text"
							name="getkeyword" class="form-control" placeholder="シュートなど">
					</div>
					<div class="btn btn-default" id="addForm">キーワードを追加</div>
					<div class="btn btn-default" id="delKeyword">キーワードを削除</div>
					<!-- 画像ファイルの選択 -->
					<div class="input-group text-center" id="addImg1">
						<span class="input-group-addon">画像1</span> <input type="file"
							name="img_file" class="form-control">
					</div>
					<div class="btn btn-default" id="addImgForm">画像を追加</div>
					<div class="btn btn-default" id="delImg">画像を削除</div>
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
	<script>
		$(function() {

			var kCount = 1;
			var kId = 2;

			$(function() {

				// キーワード追加ボタンがクリックされた時...
				$('#addForm')
						.click(
								function() {

									$('#keyword' + kCount)
											.after(
													'<div class="input-group" id="keyword' + kId +'">'
															+ '<span class="input-group-addon">キーワード'
															+ kId
															+ '</span> <input type="text"'
											+'name="getkeyword" class="form-control" placeholder="シュートなど">'
															+ '</div>');
									kCount++;
									kId++;
								});
			});

			$('#delKeyword').click(function() {

				if (kId != 2) {
					$('#keyword' + (kId - 1)).remove();

					kCount--;
					kId--;
				}
			});
		});

		$(function() {

			var imgCount = 1;
			var imgId = 2;

			$(function() {

				// 画像追加ボタンがクリックされた時...

				$('#addImgForm')
						.click(
								function() {

									$('#addImg' + imgCount)
											.after(
													'<div class="input-group text-center" id="addImg' + imgId +'">'
															+ '<span class="input-group-addon">画像'
															+ imgId
															+ '</span> <input type="file"'
											+'name="img_file" class="form-control">'
															+ '</div>');
									imgCount++;
									imgId++;
								});
			});
			$('#delImg').click(function() {

				if (imgId != 2) {
					$('#addImg' + (imgId - 1)).remove();

					imgCount--;
					imgId--;
				}
			});
		});
	</script>
</body>
</html>
