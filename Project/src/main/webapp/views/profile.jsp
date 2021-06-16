<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원프로필</title>
<link rel="stylesheet" href="${path}/resources/css/profile.css" />
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>

</head>
<body>
	<div class="container">

<c:forEach var="profile" items="${p_list}">
		<div class="card-wrapper">
			<form action="/articlelist" method="post" id="p_listForm">
				<div class="card">
					<div class="card-image">
					<input TYPE="IMAGE" src="../resources/img/${profile.p_img}.jpg" name="a_img" value="Submit">
					</div>
                    <input type="hidden" value="${profile.p_id}" name="a_id">
					<ul class="social-icons">
						<li><a href=""> <i class="fab fa-facebook-f"></i>
						</a></li>
						<li><a href=""> <i class="fab fa-instagram"></i>
						</a></li>
						<li><a href=""> <i class="fab fa-twitter"></i>
						</a></li>
						<li><a href=""> <i class="fab fa-dribbble"></i>
						</a></li>
					</ul>

					<div class="details">
						<h2>
							${profile.p_name} <br> <span class="job-title">${profile.p_department}</span>
						</h2>
					</div>
				</div>
				</form>
		</div>
		</c:forEach>
		<!-- end box wrapper -->

<!-- 		<div class="card-wrapper"> -->
<!-- 			<div class="card-wrapper"> -->

<!-- 				<div class="card"> -->

<!-- 					<div class="card-image"> -->
<!-- 						<a href="/views/portfolio.jsp"> <img -->
<!-- 							src="../resources/img/park.jpg" alt="profile one"> -->
<!-- 						</a> -->
<!-- 					</div> -->

<!-- 					<ul class="social-icons"> -->
<!-- 						<li><a href=""> <i class="fab fa-facebook-f"></i> -->
<!-- 						</a></li> -->
<!-- 						<li><a href=""> <i class="fab fa-instagram"></i> -->
<!-- 						</a></li> -->
<!-- 						<li><a href=""> <i class="fab fa-twitter"></i> -->
<!-- 						</a></li> -->
<!-- 						<li><a href=""> <i class="fab fa-dribbble"></i> -->
<!-- 						</a></li> -->
<!-- 					</ul> -->

<!-- 					<div class="details"> -->
<!-- 						<h2> -->
<!-- 							박지성 <br> <span class="job-title">Developer</span> -->
<!-- 						</h2> -->
<!-- 					</div> -->
<!-- 				</div> -->
<!-- 			</div> -->

<!-- 		</div> -->
		<!-- END container -->
	</div>

</body>
</html>