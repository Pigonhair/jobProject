function smsclick(){
	 let phoneNumber = $('#inputPhoneNumber').val();
		Swal.fire('인증번호 발송 완료!')

		$.ajax({
			type : "GET",
			url : "/check/sendSMS",
			data : {
				"phoneNumber" : phoneNumber
			},
			success : function(res) {
				$('#checkBtn').click(function() {
					if ($.trim(res) == $('#inputCertifiedNumber').val()) {
						
						Swal.fire({
							icon : 'success',
							title : '인증성공',
							text : '휴대폰 인증이 정상적으로 완료되었습니다.',
						})
						$("#inputPhoneNumber").attr("readonly",true);
						$('#sms_chk').val("Y");
					} else {
						Swal.fire({
							icon : 'error',
							title : '인증오류',
							text : '인증번호가 올바르지 않습니다!',
						})
					}
				})
			}
		});

    function newFunction() {
        return true;
    }
};
