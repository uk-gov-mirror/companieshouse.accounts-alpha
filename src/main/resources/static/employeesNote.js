
function validateEmployee(evt) {
	
	  var theEvent = evt || window.event;
	  var key = theEvent.keyCode || theEvent.which;
	  key = String.fromCharCode( key );
	  var regex = /^[0-9]{0,3}$/;
	  
	  if (theEvent.keyCode == 8 || theEvent.keyCode == 46) {
			     return true;
			 }
	  
	  var element = document.getElementById(theEvent.target.id);
	  
	  var $this = $("#" + element.id);
	  
	  if( !regex.test(element.value) || !regex.test(key)) {		  
		  return false;
	  }	  
}

function validateTextBox(evt) {
	
	  var theEvent = evt || window.event;
	  var key = theEvent.keyCode || theEvent.which;
	  key = String.fromCharCode( key );
	  var regex = /^.{0,19999}$/;
	  
	  if (theEvent.keyCode == 8 || theEvent.keyCode == 46) {
			     return true;
			 }
	  
	  var element = document.getElementById(theEvent.target.id);
	  
	  var $this = $("#" + element.id);
	  
	  if( !regex.test(element.value) || !regex.test(key)) {		  
		  return false;
	  }	  
}

//Regex to allow for a maximum of 10 characters. Check logic works and change to 20,000 characters
//^.{0,10}$