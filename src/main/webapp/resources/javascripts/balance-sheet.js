function calculateBalanceSheetSectionTotal($total, $val1, $val2, $val3){

$val1.add($val2).add($val3).on('change', function () 
		{
			$total.val(
					+$val1.val() + +$val2.val() + +$val3.val()
					);
			}
);
}

$(function() {
		
			calculateBalanceSheetSectionTotal($('#total-fixed-assets-current') ,$('#intangible-assets-current'),  $('#tangible-assets-current'),  $('#investments-fixed-assets-current'));
			calculateBalanceSheetSectionTotal($('#total-fixed-assets-previous') ,$('#intangible-assets-previous'),  $('#tangible-assets-previous'),  $('#investments-fixed-assets-previous'));
	}
);

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