<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입</title>

<!-- css,js 적용 -->
<link rel="stylesheet" href="${path}/resources/css/join.css" />
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">

<script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${path}/resources/js/join.js"></script>
<script type="text/javascript" src="${path}/resources/js/datepicker.js"></script>
<script type="text/javascript" src="${path}/resources/js/form-validate.js"></script>
<script type="text/javascript" src="${path}/resources/js/jquery-ui.js"></script>
<script type="text/javascript" src="${path}/resources/js/SMS.js"></script>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript" src="${path}/resources/js/daumApi.js"></script>
<!-- css,js 적용 -->


</head>
<body>
	<div class="form-structor">
		<div class="signup">
			<h2 class="form-title" id="signup">
				<span>or</span>Sign up
			</h2>
			
			<form action="/join" method=post id="form_id">
				<div class="form-holder">
					<div class="join-form">
						<span>
						<input class="join-id" type="text" name="m_id"> @ <input class="join-id2" name="join-id2" type="text">
						<select name="select_email" onChange="selectEmail(this)"> 
						<option value="" selected>선택하세요</option> 
						<option value="naver.com">naver.com</option> 
						<option value="gmail.com">gmail.com</option> 
						<option value="hanmail.com">hanmail.com</option> 
						<option value="1">직접입력</option> </select>
						</span>
					</div>
					<input type="password" id="member_pwd1" name="m_pwd" class="input" placeholder="비밀번호" /> 
					<input type="password" id="member_pwd2"	class="input" placeholder="비밀번호 확인" onKeyUp="fn_compare_pwd();" />
					<span id="s_result"></span> 
					<input type="text" class="input" id="m_name" name="m_name" placeholder="이름" /> 
					<input type="text" class="input" id="m_address" name="m_address" placeholder="주소" /> 
					<input type="text" name="date" id="m_date" name="m_date" placeholder="생년월일" class="input datepicker " size="12" />
					<div class="join-form">
						<span class="stick">
						<input type="text" class="phone" id="inputPhoneNumber" name="m_phone" placeholder="전화번호" />
						</span>
						<span><button type="button" class="c-number" id="sendPhoneNumber" onclick="smsclick();">인증번호 받기</button></span>
					</div>
					<input type="text" class="phone" placeholder="인증번호" id = "inputCertifiedNumber"/>
					<span><button type="button" class="c-number" id = "checkBtn">인증확인</button></span>
				</div>
				<input type="hidden" name="m_department" value=""/>
				<input type="hidden" name="m_grade" value=""/>
				<input type="hidden" name="m_img" value=""/>
				<input type="hidden" name="cache" value=""/>
				<input type="hidden" name="token" value=""/>
				<input type="hidden" id="sms_chk" value="N"/>
				<input type="submit" id="form" class="submit-btn" value="Sign Up"/>	
			</form>
			
		</div>
		<div class="login slide-up">
			<div class="center">
				<h2 class="form-title" id="login">
					<span>or</span>Log in
				</h2>
				<form class='login-form' action="/login" method=post>
					<div class="form-holder">
						<input type="text" class="input" name="m_id" placeholder="Email" />
						<input type="password" class="input" name="m_pwd"
							placeholder="Password" />
					</div>
					<button type="submit" class="submit-btn">Log in</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>