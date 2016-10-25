$(function() {
		
	// Fixed assets
	attachOnChangeListener([$('#intangible-assets-current'),  $('#tangible-assets-current'),  $('#investments-fixed-assets-current')], 'total-fixed-assets-current' )
	attachOnChangeListener([$('#intangible-assets-previous'),  $('#tangible-assets-previous'),  $('#investments-fixed-assets-previous')], 'total-fixed-assets-previous' )
	
	// Current assets 
	attachOnChangeListener([$('#stocks-current'),  $('#debtors-current'),  $('#cash-at-bank-and-in-hand-current'), $('#investments-current-assets-current')], 'total-current-assets-current' )
	attachOnChangeListener([$('#stocks-previous'),  $('#debtors-previous'),  $('#cash-at-bank-and-in-hand-previous'), $('#investments-current-assets-previous')], 'total-current-assets-previous' )
	}
);


function attachOnChangeListener(arr, total){
	for(var i=0;i<arr.length;i++){
		arr[i].on('change', function() {
			findTotal(arr, total)
		});
	}
}


function findTotal(arr, totalField){
    var tot=0;
    for(var i=0;i<arr.length;i++){
        if(parseInt(arr[i].val()))
            tot += parseInt(arr[i].val());
    }
    document.getElementById(totalField).value = tot;
}



function validate(evt) {
	
	  var theEvent = evt || window.event;
	  var key = theEvent.keyCode || theEvent.which;
	  key = String.fromCharCode( key );
	  var regex = /^[0-9]{0,7}$/;
	  var element = document.getElementById(theEvent.target.id)	  
	  
	  if( !regex.test(element.value) || !regex.test(key)) {		  
		  theEvent.returnValue = false;
		  if(theEvent.preventDefault) theEvent.preventDefault();
	  }	  
}