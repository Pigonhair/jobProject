<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인 포트폴리오</title>
<link rel="stylesheet" href="${path}/resources/css/portfolio.css" />
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>

</head>
<body>
	<div class="button" onclick="location.href='/views/boardRegister.jsp'"></div>

	<div class="container">
		<div class="row flip-boxes">	
		<!-- for each문 쓰기 -->
		<c:forEach var="article" items="${list}">
			<div class="col-md-3 col-sm-4 col-8 flip-box">
				<div class="front" style="background-image: url({article.a_img});">
					<div class="content text-center">
						${article.a_title}<br> <span class="click-for-more"> </span>
					</div>
				</div>
				<div class="back">
					<div class="content">${article.a_writer}</div>
				</div>
			</div>
          </c:forEach>
		</div>
	</div>
</body>
</html>