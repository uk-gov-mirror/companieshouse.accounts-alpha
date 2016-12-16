
function validateEmployee(evt) {
	
	  var theEvent = evt || window.event;
	  var key = theEvent.keyCode || theEvent.which;
	  key = String.fromCharCode( key );
	  var regex = /^[0-9]{0,3}$/;
	  
	  if (theEvent.keyCode == 8 || theEvent.keyCode == 46
			  || theEvent.keyCode == 37 || theEvent.keyCode == 39) {
			     return true;
			 }
	  
	  var element = document.getElementById(theEvent.target.id);
	  
	  var $this = $("#" + element.id);
	  
	  if($this.hasClass("can-be-negative")){
		  regex = /^-?[0-9]{0,4}$/;
	  }
	  
	  if( !regex.test(element.value) || !regex.test(key)) {		  
		  return false;
	  }	  
}

