console.clear();

$(document).ready(function(){
	const loginBtn = document.getElementById('login');
	const signupBtn = document.getElementById('signup');
	
	
	loginBtn.addEventListener('click', (e) => {
		let parent = e.target.parentNode.parentNode;
		Array.from(e.target.parentNode.parentNode.classList).find((element) => {
			if(element !== "slide-up") {
				parent.classList.add('slide-up')
			}else{
				signupBtn.parentNode.classList.add('slide-up')
				parent.classList.remove('slide-up')
			}
		});
	});
	
	signupBtn.addEventListener('click', (e) => {
		let parent = e.target.parentNode;
		Array.from(e.target.parentNode.classList).find((element) => {
			if(element !== "slide-up") {
				parent.classList.add('slide-up')
			}else{
				loginBtn.parentNode.parentNode.classList.add('slide-up')
				parent.classList.remove('slide-up')
			}
		});
	});
});


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


var ID_result = false;
function fn_compare_id() {
	var id = $("#member_id").val();
	var $idcheck_result = $("#idcheck_result");
	
	$.ajax({
		url: '/idCheck',
		type: 'POST',
		dataType: 'json', //서버로부터 내가 받는 데이터의 타입
		data: {id: id},
		cache:false,
		async: false,

		success: function(data) {
			if (data == 0) {
				idcheck_result = true;
				$idcheck_result.text("사용할 수 있는 아이디입니다.");
				$("#idcheck_result").css({
					"color": "green",
				});

			} else {
				idcheck_result = false;
				$idcheck_result.text("중복된 아이디가 존재합니다.");
				$("#idcheck_result").css({
					"color": "red",
					"padding": "10px 10px",
					"display": "block",
					"font-size": "15px"
				});
			}
		},
		error: function() {

		}
	});

};