$('#search_btn').click(function() {
	console.log($('#search_text').val());

	var ser_value = $('#search_text').val();

	if (ser_value == "") {
		console.log('다시 입력하세요!');
	} 
	else if (ser_value != "") {
		console.log('입력완료!!!');
	}
});

