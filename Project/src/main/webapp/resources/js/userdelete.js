function clck(i) {
	if ($('#change_chk' + i).is(":checked") == true) {
		var grade = $('#select_grade' + i).val();
		var input = new Array();
		input[i] = document.createElement("input");
		$(input[i]).attr("type", "hidden");
		$(input[i]).attr("name", "m_grade" + i);
		$(input[i]).attr("id", "m_grade" + i);
		$(input[i]).val(grade);
		$('#change_chk' + i).append(input[i]);
		$('#m_grade' + i).val(grade);

	} else if ($('#change_chk' + i).is(":checked") == false) {
		var parent = document.getElementById("change_chk" + i);
		var child = document.getElementById("m_grade" + i);
		parent.removeChild(child);

	}
}

function clck2(i) {
	var grade = $('#select_grade' + i).val();
	$('#m_grade' + i).val(grade);
}




