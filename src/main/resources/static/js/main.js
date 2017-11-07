$(document).ready(function() {

	$("#result").hide();

	$("#cityList").on('change', function() {
		console.log('selected - ' + $('#cityList').val());
		if($('#cityList').val()==''){
			alert('City is not selected. Please select any city.')
		}else{
			fire_ajax_submit();
		}
		
	});

});

function fire_ajax_submit() {

	var search = {}
	search["cityName"] = $("#cityList").val();


	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "/api/search",
		data : JSON.stringify(search),
		dataType : 'json',
		cache : false,
		timeout : 600000,
		success : function(data) {

			$("#city").html(data.cityName);
			$("#time").html(data.time);
			$("#weather").html(data.weather);
			$("#temp").html(data.temperature+'&#x2103;');
			$("#wind").html(data.wind);

			$("#result").show();

		}
	});

}