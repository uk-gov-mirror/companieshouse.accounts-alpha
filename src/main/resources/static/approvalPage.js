function validateText(evt) {
	
	  var theEvent = evt || window.event;
	  var key = theEvent.keyCode || theEvent.which;
	  key = String.fromCharCode( key );
	  var regex = /^[a-zA-Z\s]{0,120}$/;
	  
	  if (theEvent.keyCode == 8 || theEvent.keyCode == 46
			  || theEvent.keyCode == 37 || theEvent.keyCode == 39) {
			     return true;
			 }
	  
	  var element = document.getElementById(theEvent.target.id);
	  
	  
	  if( !regex.test(element.value) || !regex.test(key)) {		  
		  return false;
	  }	  
}
