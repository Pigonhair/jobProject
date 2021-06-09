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
	           return;
            }
            
            compare_result = false;
            $s_result.text("비밀번호가 일치하지 않습니다.");
            $("#s_result").css({
               	"color": "red",
               	"padding": "10px 10px",
				"display": "block",
				"font-size": "15px"
           	});
 };







