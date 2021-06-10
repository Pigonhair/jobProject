//비밀번호 
var compare_result = false;
 function fn_compare_pwd(){
            var pwd1 = $("#member_pwd1").val();
            var pwd2 = $("#member_pwd2").val();
            var $s_result = $("#s_result");

            if(pwd1 == pwd2){
	           compare_result = true;
	           $s_result.text("비밀번호가 일치합니다.");
	           $("#s_result").css({
	           	"color": "green",
	           });
				if(pwd1=="" || pwd2=="" || pwd1==null || pwd2==null){
						$s_result.text("비밀번호를 입력해주세요.");
			            $("#s_result").css({
			               	"color": "red",
			               	"padding": "10px 10px",
							"display": "block",
							"font-size": "15px"
			           	});	
				}
	           return;
            }
            else{
				compare_result = false;
	            $s_result.text("비밀번호가 일치하지 않습니다.");
	            $("#s_result").css({
	               	"color": "red",
	               	"padding": "10px 10px",
					"display": "block",
					"font-size": "15px"
	           	});
			}
 };


//이메일
function selectEmail(ele){ 
	var $ele = $(ele); 
	var $email2 = $('input[name=join-id2]'); 
	if($ele.val() == "1"){ 
		$email2.attr('readonly', false); 
		$email2.val(''); 
	} 
	else { 
		$email2.attr('readonly', true); 
		$email2.val($ele.val());
	} 
};

//빈칸 체크
function form_chk(){ 
	var id = $(".join-id").val();
	var id2 = $(".join-id2").val();
	var pwd1 = $("#member_pwd1").val();
	var pwd2 = $("#member_pwd2").val();
	var name = $("#m_name").val();
	var address = $("#m_address").val();
	var date = $("#m_date").val();
	var p_first = $("#p_first").val();
	var p_mid = $("#p_mid").val();
	var p_last = $("#p_last").val();
	if(id==""){
		alert("아이디 입력")
		$(".join-id").focus();
		return;
	}
	if(id2==""){
		alert("도메인 입력")
		$(".join-id2").focus();
		return;
	}
	if(!compare_result){
		alert("비밀번호를 체크해주세요.")
		$("#member_pwd1").focus();
		return;
	}
	if(name==""){
		alert("이름 입력")
		$("#m_name").focus();
		return;
	}
	if(address==""){
		alert("주소 입력")
		$("#m_address").focus();
		return;
	}
	if(date==""){
		alert("생년월일 입력")
		$("#m_date").focus();
		return;
	}
	if(p_first==""){
		alert("앞자리 입력")
		$("#p_first").focus();
		return;
	}
	if(p_mid==""){
		alert("중간자리 입력")
		return;
	}
	if(p_last==""){
		alert("마지막자리 입력")
		return;
	}
	
};
