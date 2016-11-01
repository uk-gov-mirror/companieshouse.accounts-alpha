$(function() {
		
	// Fixed assets
	attachOnChangeListener([$('#intangible-assets-current'),  $('#tangible-assets-current'),  $('#investments-fixed-assets-current')], 'total-fixed-assets-current')
	attachOnChangeListener([$('#intangible-assets-previous'),  $('#tangible-assets-previous'),  $('#investments-fixed-assets-previous')], 'total-fixed-assets-previous' )
	
	// Current assets 
	attachOnChangeListener([$('#stocks-current'),  $('#debtors-current'),  $('#cash-at-bank-and-in-hand-current'), $('#investments-current-assets-current')], 'total-current-assets-current' )
	attachOnChangeListener([$('#stocks-previous'),  $('#debtors-previous'),  $('#cash-at-bank-and-in-hand-previous'), $('#investments-current-assets-previous')], 'total-current-assets-previous' )
	    
	// Net current assets 
	attachOnChangeListener([$('#total-current-assets-current'),  $('#creditors-amounts-falling-due-within-one-year-current')], 'net-current-assets-liabilities-current', true )
	attachOnChangeListener([$('#total-current-assets-previous'),  $('#creditors-amounts-falling-due-within-one-year-previous')], 'net-current-assets-liabilities-previous', true )	
	
	// Total assets less current liabilities
	attachOnChangeListener([$('#total-fixed-assets-current'),  $('#net-current-assets-liabilities-current')], 'total-assets-less-current-liabilities-current' )
	attachOnChangeListener([$('#total-fixed-assets-previous'),  $('#net-current-assets-liabilities-previous')], 'total-assets-less-current-liabilities-previous' )
	
	// Total net assets (liabilities)
	attachOnChangeListener([$('#total-assets-less-current-liabilities-current'),  $('#creditors-amounts-falling-due-after-more-than-one-year-current'), $('#provision-for-liabilities-current')], 'total-net-assets-liabilities-current', true )
	attachOnChangeListener([$('#total-assets-less-current-liabilities-previous'),  $('#creditors-amounts-falling-due-after-more-than-one-year-previous'), $('#provision-for-liabilities-previous')], 'total-net-assets-liabilities-previous', true )	

    //Capital and reserves
	attachOnChangeListener([$('#called-up-share-capital-current'),  $('#share-premium-account-current'),  $('#revaluation-reserve-current'), $('#other-reserves-current'), $('#profit-and-loss-account-current')], 'total-shareholders-funds-current' )
	attachOnChangeListener([$('#called-up-share-capital-previous'),  $('#share-premium-account-previous'),  $('#revaluation-reserve-previous'), $('#other-reserves-previous'), $('#profit-and-loss-account-previous')], 'total-shareholders-funds-previous' )

	$(".grid-row").focusin(function() {	
		var $this = $(this);
		$('details').removeAttr('open');
		$this.find('details').attr('open', 'true')
		})
});


function attachOnChangeListener(arr, total, substract){
	for(var i=0;i<arr.length;i++){
		arr[i].on('change', function() {
			if( substract ){
				findDifference(arr, total)
			} else {
				findTotal(arr, total)	
			}
			
		});
	}
}


function findTotal(arr, totalField){
    var tot=0;
    for(var i=0;i<arr.length;i++){
        if(parseInt(arr[i].val()))
            tot += parseInt(arr[i].val());
    }
    
    $("#" + totalField).val(tot).change();   
}

function findDifference(arr, totalField){
    var tot= arr[0].val();
    for(var i=1;i<arr.length;i++){
        if(parseInt(arr[i].val()))
            tot -= parseInt(arr[i].val());
    }

    $("#" + totalField).val(tot).change();   
}


function validate(evt) {
	
	  var theEvent = evt || window.event;
	  var key = theEvent.keyCode || theEvent.which;
	  key = String.fromCharCode( key );
	  var regex = /^[0-9]{0,7}$/;
	  
	  if (theEvent.keyCode == 8 || theEvent.keyCode == 46
			  || theEvent.keyCode == 37 || theEvent.keyCode == 39) {
			     return true;
			 }
	  
	  var element = document.getElementById(theEvent.target.id);
	  
	  var $this = $("#" + element.id);
	  
	  if($this.hasClass("can-be-negative")){
		  regex = /^-?[0-9]{0,7}$/;
	  }
	  
	  if( !regex.test(element.value) || !regex.test(key)) {		  
		  return false;
	  }	  
}

