<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="javax.websocket.Session"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href='https://fonts.googleapis.com/css?family=Roboto:400,700' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="${path}/resources/css/articleRegister.css" />
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${path}/resources/js/articleRegister.js"></script>
<title>포트폴리오 등록하기</title>
</head>
<body>
<form action="/createArticle" method="post" name="a_createForm">
<div class="centered">
  <div class="group">
    <input type="text" id="title" name="a_title" required="required"/>
    <label for="title">제목</label>
    <div class="bar"></div>
  </div>
  <div class="group">
    <input type="text" id="content" name="a_content" required="required"/>
    <label for="content">내용</label>
    <div class="bar"></div>
  </div>
  <div class="group">
    <input type="text" id="videocode" name="a_videocode" required="required"/>
    <label for="videocode">동영상코드(유튜브에서 영상클릭후 watch?v=옆 문자)</label>
    <div class="bar"></div>
  </div>
</div>
<div class="button" onclick="registerBtn()"></div>
</form>
</body>
</html>