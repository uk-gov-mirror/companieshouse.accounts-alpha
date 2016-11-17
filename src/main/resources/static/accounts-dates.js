$(document).ready(function(){
	
	if ($('#dates-yes').is(':checked')){
		$('#dates-yes-reveal').removeClass('js-hidden');
	}
	
	$('#dates-yes').click(function(){
		$('#dates-yes-reveal').removeClass('js-hidden');
	});
	
	$('#dates-no').click(function(){
		$('#dates-yes-reveal').addClass('js-hidden');
	});
});

