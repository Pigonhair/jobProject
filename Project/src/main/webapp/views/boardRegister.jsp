<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href='https://fonts.googleapis.com/css?family=Roboto:400,700' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="${path}/resources/css/boardRegister.css" />
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<title>포트폴리오 등록하기</title>
</head>
<body>
<div class="centered">
  <div class="group">
    <input type="text" id="title" required="required"/>
    <label for="title">제목</label>
    <div class="bar"></div>
  </div>
  <div class="group">
    <input type="text" id="content" required="required"/>
    <label for="content">내용</label>
    <div class="bar"></div>
  </div>
  <div class="group">
    <input type="text" id="youtubeid" required="required"/>
    <label for="youtubeid">유튜브 계정</label>
    <div class="bar"></div>
  </div>
</div>
<div class="button"></div>
</body>
</html>