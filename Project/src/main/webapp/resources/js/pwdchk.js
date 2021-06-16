//비밀번호 체크하는 서비스 만들고 ajax처리
$(document).ready(function() {
	$("#pwdChk").click(function() {
		var m_id = $('#userid').val();
		var m_pwd = $('#password').val();
		
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
				data: { id: m_id, pwd: m_pwd},
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
