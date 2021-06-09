<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입</title>

<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<!--  datepicker  -->
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="./jquery-ui-1.12.1/datepicker-ko.js"></script>

<script type="text/javascript">
$(function(){

    $(".datepicker").datepicker({
 	 	dateFormat: 'yy-mm-dd',	//날짜 포맷이다. 보통 yy-mm-dd 를 많이 사용하는것 같다.
		prevText: '이전 달',	// 마우스 오버시 이전달 텍스트
        nextText: '다음 달',	// 마우스 오버시 다음달 텍스트
        closeText: '닫기', // 닫기 버튼 텍스트 변경
        currentText: '오늘', // 오늘 텍스트 변경
        monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],	//한글 캘린더중 월 표시를 위한 부분
        monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],	//한글 캘린더 중 월 표시를 위한 부분
        dayNames: ['일', '월', '화', '수', '목', '금', '토'],	//한글 캘린더 요일 표시 부분
        dayNamesShort: ['일', '월', '화', '수', '목', '금', '토'],	//한글 요일 표시 부분
        dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],	// 한글 요일 표시 부분
        showMonthAfterYear: true,	// true : 년 월  false : 월 년 순으로 보여줌
        yearSuffix: '년',	//
        showButtonPanel: true,	// 오늘로 가는 버튼과 달력 닫기 버튼 보기 옵션
    });

});
</script>
<!--  -->






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
				<div class="join-form">
				<span><input class="join-id" type="text"> @ <input class="join-id2" name="join-id2" type="text">
				<select name="select_email" onChange="selectEmail(this)"> 
				<option value="" selected>선택하세요</option> 
				<option value="naver.com">naver.com</option> 
				<option value="gmail.com">gmail.com</option> 
				<option value="hanmail.com">hanmail.com</option> 
				<option value="1">직접입력</option> </select>
				</span>
				</div>
				<input type="password" id="member_pwd1" class="input" placeholder="비밀번호" />
				<input type="password" id="member_pwd2" class="input" placeholder="비밀번호 확인" onKeyUp="fn_compare_pwd();" />
				<span id="s_result" > hi </span>
				<input type="text" class="input" placeholder="이름" />
				<input type="text" class="input" placeholder="주소" />
				<input type="text" name="date" placeholder="생년월일" class="input datepicker" size="12" /> 
				<div class="join-form">
				<span class="stick"><input type="text" class="phone" placeholder="앞자리" /> - </span>
				<span class="stick"><input type="text" class="phone" placeholder="중간자리" /> - </span>
				<span><input type="text" class="phone" placeholder="끝자리" /></span>
				<span><button class="c-number">인증번호 받기</button></span></div>
				<input type="text" class="input" placeholder="인증번호" />
				
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