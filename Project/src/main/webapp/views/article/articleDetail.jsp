<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="javax.websocket.Session"%>
<%    
    request.setCharacterEncoding("UTF-8");
    String title = request.getParameter("title");
    String videocode = request.getParameter("code");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href='https://fonts.googleapis.com/css?family=Roboto:400,700' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="${path}/resources/css/articleRegister.css" />
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${path}/resources/js/articleRegister.js"></script>
<title><%= title %></title>
</head>
<body>
<p align="middle"><iframe width="640" height="360" src="https://www.youtube.com/embed/<%= videocode %>" frameborder="0" allowfullscreen></iframe></p>
</body>
</html>