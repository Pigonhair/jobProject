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
<script type="text/javascript" src="${path}/resources/js/userdelete.js"></script>
<script type="text/javascript" src="${path}/resources/js/jquery-ui.js"></script>


</head>
<body>
<form action="/m_grade" method="post">
   <table class="sub_news" border="1" summary="게시판의 글제목 리스트">
   
   <caption>게시판 리스트</caption>
   <colgroup>
   <col width="20%">
   <col width="20%">
   <col width="20%">
   <col width="20%">
   <col width="20%">
   </colgroup>
   
   <thead>
   
   <tr>
   <th scope="col">선택</th>
   <th scope="col">아이디</th>
   <th scope="col">이름</th>
   <th scope="col">등급</th>
   <th scope="col">등급변경</th>
   </tr>
   </thead>
   <tbody>
   
   
   <c:forEach var="jiseong" items="${list}" varStatus="i">
         <tr>
            <td>
               <input type="checkbox" id="change_chk${i.index }" name="m_id" value="${list[i.index].M_ID}" onclick="clck(${i.index});" />
            </td>
            
            <td class="title">
               <input type="text" value="${list[i.index].M_ID}" disabled style="background : white; border : white"/>
            </td>
            <td class="name">${list[i.index].M_NAME}</td>
            <td class="date">${list[i.index].M_DEPARTMENT}</td>
            <td>
               <select id="select_grade${i.index }" name="select_grade" onchange="clck2(${i.index })">
                  <option value="1">사용자</option>
                  <option value="2">운영자</option>
                  <option value="3">통합관리자</option>
               </select>
               
            </td>
         </tr>
   </c:forEach>
   </tbody>
   </table>
   <input type="submit" value="변경" />
</form>


</body>
</html>