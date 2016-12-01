$(function() {
		
	// Fixed assets
	attachOnChangeListener([$('#intangible-assets-current'),  $('#tangible-assets-current'),  $('#investments-fixed-assets-current')], [], 'total-fixed-assets-current')
	attachOnChangeListener([$('#intangible-assets-previous'),  $('#tangible-assets-previous'),  $('#investments-fixed-assets-previous')], [], 'total-fixed-assets-previous' )
	
	// Current assets 
	attachOnChangeListener([$('#stocks-current'),  $('#debtors-current'),  $('#cash-at-bank-and-in-hand-current'), $('#investments-current-assets-current')], [], 'total-current-assets-current' )
	attachOnChangeListener([$('#stocks-previous'),  $('#debtors-previous'),  $('#cash-at-bank-and-in-hand-previous'), $('#investments-current-assets-previous')], [], 'total-current-assets-previous' )
	    
	// Net current assets 
	attachOnChangeListener([$('#total-current-assets-current')],  [$('#creditors-amounts-falling-due-within-one-year-current')], 'net-current-assets-liabilities-current' )
	attachOnChangeListener([$('#total-current-assets-previous')],  [$('#creditors-amounts-falling-due-within-one-year-previous')], 'net-current-assets-liabilities-previous' )	
	
	// Total assets less current liabilities
	attachOnChangeListener([$('#total-fixed-assets-current'),  $('#net-current-assets-liabilities-current')], [], 'total-assets-less-current-liabilities-current' )
	attachOnChangeListener([$('#total-fixed-assets-previous'),  $('#net-current-assets-liabilities-previous')], [], 'total-assets-less-current-liabilities-previous' )
	
	// Total net assets (liabilities)
	attachOnChangeListener([$('#total-assets-less-current-liabilities-current')],  [$('#creditors-amounts-falling-due-after-more-than-one-year-current'), $('#provision-for-liabilities-current')], 'total-net-assets-liabilities-current' )
	attachOnChangeListener([$('#total-assets-less-current-liabilities-previous')],  [$('#creditors-amounts-falling-due-after-more-than-one-year-previous'), $('#provision-for-liabilities-previous')], 'total-net-assets-liabilities-previous' )	

    //Capital and reserves
	attachOnChangeListener([$('#called-up-share-capital-current'),  $('#share-premium-account-current'),  $('#revaluation-reserve-current'), $('#other-reserves-current'), $('#profit-and-loss-account-current')], [], 'total-shareholders-funds-current' )
	attachOnChangeListener([$('#called-up-share-capital-previous'),  $('#share-premium-account-previous'),  $('#revaluation-reserve-previous'), $('#other-reserves-previous'), $('#profit-and-loss-account-previous')], [], 'total-shareholders-funds-previous' )

	$(".grid-row").focusin(function() {	
		var $this = $(this);
		$('details').removeAttr('open');
		$this.find('details').attr('open', 'true')
		})
		
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


