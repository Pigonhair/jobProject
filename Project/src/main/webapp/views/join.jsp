<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입123123</title>

<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>

<!-- css,js 적용 -->
<link rel="stylesheet" href="${path}/resources/css/join.css" />
<script type="text/javascript" src="${path}/resources/js/join.js"></script> 
<!---->

</head>
<body>
	<div class="form-structor">
		<div class="signup">
			<h2 class="form-title" id="signup">
				<span>or</span>Sign up
			</h2>
			<div class="form-holder">
				<input type="email" class="input" placeholder="ID" />
				<input type="password" class="input" placeholder="Password" />
				<input type="password" class="input" placeholder="Password2" />
				<input type="text" class="input" placeholder="Name" />
				<input type="text" class="input" placeholder="Address" />
				<input type="text" class="input" placeholder="Phone" /> 
			</div>
			<button class="submit-btn">Sign up</button>
		</div>
		<div class="login slide-up">
			<div class="center">
				<h2 class="form-title" id="login">
					<span>or</span>Log in
				</h2>
				<form class='login-form' action="/login" method=post>
					<div class="form-holder">
						
							<input type="text" class="input" name="m_id" placeholder="Email" /> 
							<input type="password" class="input" name="m_pwd" placeholder="Password" />
						
					</div>
					<button type="submit" class="submit-btn">Log in</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>