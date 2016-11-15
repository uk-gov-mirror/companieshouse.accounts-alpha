$(function() {
		
			$('#prepared-not-standard-102').click(function(){ 
				$('#other-policy-text').removeClass('js-hidden')
			})
			
			$('#prepared-standard-102').click(function(){ 
				$('#other-policy-text').addClass('js-hidden')
			})
			
			$('#policies-yes').click(function(){ 
				$('#additional').removeClass('js-hidden')
			})
			
			$('#policies-no').click(function(){ 
				$('#additional').addClass('js-hidden')
			})
		
});
