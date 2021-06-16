<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="path" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>

<link rel="stylesheet" href="${path}/resources/css/join.css" />
<link rel="stylesheet" href="${path}/resources/css/userdelete.css" />
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${path}/resources/js/jquery-ui.js"></script>


</head>
<body>

<table class="sub_news" border="1" cellspacing="0" summary="게시판의 글제목 리스트">
<caption>게시판 리스트</caption>

<colgroup>
<col width="33%">
<col width="33%">
<col width="33%">
</colgroup>

<thead>

<tr>

<th scope="col">아이디</th>
<th scope="col">이름</th>
<th scope="col">등급</th>
</tr>
</thead>
<tbody>

<tr> 
<c:forEach var="jiseong" items="${list}" varStatus="i">
	<td class="title">
		<span>${list[i.index].M_ID}</span>
	</td>
		<td class="name">${list[i.index].M_NAME}</td>
		<td class="date">${list[i.index].M_DEPARTMENT}</td>
	</tr>
</c:forEach>

</tbody>
</table>



</body>
</html>