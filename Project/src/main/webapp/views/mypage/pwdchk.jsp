<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="path" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>

<link rel="stylesheet" href="${path}/resources/css/pwdchk.css" />
<link rel="stylesheet" href="${path}/resources/css/login.css" />

<script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${path}/resources/js/pwdchk.js"></script>
<script type="text/javascript" src="${path}/resources/js/jquery-ui.js"></script>


</head>
<body>
<form class='login-form'  >
  <div class="flex-row">
    <input id="userid" name ="m_id" class='pwdchkid-input' type='text' value="${loginOK.id }" readonly>
  </div>
  <div class="flex-row">
    <input id="password" name ="m_pwd" class='pwdchkpwd-input' placeholder='Password' type='password' onKeyUp="pwdkeyUP()">
  </div>
  <input class='lf--submit' type='button' value='비밀번호 확인' id="pwdChk" onClick="pwdChk()">
</form>


</body>
</html>