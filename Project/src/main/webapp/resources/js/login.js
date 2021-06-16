$(document).ready(function() {
	//로그인버튼
		$("#loginBtn").click(function() {
			var m_id = $('#username').val();
			var m_pwd = $('#password').val();
			var $idresult = $("#idresult");
			var $pwdresult = $("#pwdresult");

			if (m_id == "") {
				$idresult.text("아이디를 입력해주세요");
				$("#idresult").css({
					"color": "red",
					"padding": "10px 10px 0px 10px",
					"display": "block",
					"font-size": "15px"
				});
				$('#username').focus();
				return false;
			}
			if (m_pwd == "") {
				$pwdresult.text("비밀번호를 입력해주세요");
				$("#pwdresult").css({
					"color": "red",
					"padding": "10px 10px 0px 10px",
					"display": "block",
					"font-size": "15px"
				});
				$('#password').focus();
				return false;
			} else {
				$.ajax({
					url: '/login',
					type: 'post',
					data: { id: m_id, pwd: m_pwd },
					dataType: 'json',
					cache: false,
					async: false,
					success: function(data) {
						if (data == "1") {
							//로그인성공
							location.href = '/views/index.jsp';

						} else if (data == "0") {
							//로그인실패

							Swal.fire({
								icon: 'error',
								title: '로그인오류',
								text: '로그인정보가 올바르지 않습니다!',
							})
						}

					},
					error: function() {
						alert('네트워크 오류 발생');
					}
				});
			}

		});
	

});

function idkeyUP() {
	var id = $("#username").val();
	var $idresult = $("#idresult");

	if (id !== "" || id !== null) {
		$idresult.text("");
		$("#idresult").css({
			"padding": "0px"
		});

	}
}

function pwdkeyUP() {
	var pwd = $("#password").val();
	var $pwdresult = $("#pwdresult");

	if (pwd !== "" || pwd !== null) {
		$pwdresult.text("");
		$("#pwdresult").css({
			"padding": "0px"
		});

	}
}