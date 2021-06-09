<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ������</title>


<!-- css,js ���� -->
<link rel="stylesheet" href="${path}/resources/css/join.css" />
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">

<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${path}/resources/js/join.js"></script>
<script type="text/javascript" src="${path}/resources/js/datepicker.js"></script>
<script type="text/javascript" src="${path}/resources/js/jquery-ui.js"></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script> 
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
					<span>
					<input class="join-id" type="text"> @ <input class="join-id2" name="join-id2" type="text">
					<select name="select_email" onChange="selectEmail(this)"> 
					<option value="" selected>�����ϼ���</option> 
					<option value="naver.com">naver.com</option> 
					<option value="gmail.com">gmail.com</option> 
					<option value="hanmail.com">hanmail.com</option> 
					<option value="1">�����Է�</option> </select>
					</span>
				</div>
				<input type="password" id="member_pwd1" class="input" placeholder="��й�ȣ" />
				<input type="password" id="member_pwd2" class="input" placeholder="��й�ȣ Ȯ��" onKeyUp="fn_compare_pwd();" />
				<span id="s_result" > </span>
				<input type="text" class="input" placeholder="�̸�" />
				<input type="text" class="input" placeholder="�ּ�" />
				<input type="text" name="date" placeholder="�������" class="input datepicker" size="12" /> 
				<div class="join-form">
				<span class="stick"><input type="text" class="phone" placeholder="���ڸ�" /> - </span>
				<span class="stick"><input type="text" class="phone" placeholder="�߰��ڸ�" /> - </span>
				<span><input type="text" class="phone" placeholder="���ڸ�" /></span>
				<span><button class="c-number">������ȣ �ޱ�</button></span></div>
				<input type="text" class="input" placeholder="������ȣ" />
				
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