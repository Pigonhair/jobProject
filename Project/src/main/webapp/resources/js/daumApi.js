//다음 주소찾기Api  
$(document).ready(function() {
$("#m_address").click(function(){
      new daum.Postcode({
          oncomplete: function(data) {
              var addr = data.address; // 최종 주소 변수
              // 주소 정보를 해당 필드에 넣는다.
              document.getElementById("m_address").value = addr;

          }
      }).open();
   })
});