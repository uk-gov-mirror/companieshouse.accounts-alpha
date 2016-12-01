function attachOnChangeListener(arr1, arr2, total){
	for(var i=0;i<arr1.length;i++){
		arr1[i].on('change', function() {
			calculate(arr1, arr2, total)			
		});
	}
	for(var i=0;i<arr2.length;i++){
		arr2[i].on('change', function() {
			calculate(arr1, arr2, total)			
		});
	}
}


function calculate(sumArr, subArr, totalField){
    var tot=0;
    for(var i=0;i<sumArr.length;i++){
        if(parseInt(sumArr[i].val()))
            tot += parseInt(sumArr[i].val());
    }
    
    for(var i=0;i<subArr.length;i++){
        if(parseInt(subArr[i].val()))
            tot -= parseInt(subArr[i].val());
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

