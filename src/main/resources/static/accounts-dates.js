$(document).ready(function(){
	    $('#dates-no').click(function(){
	        $('#dates-no-reveal').removeClass('js-hidden');
	        $('#dates-yes').click(function(){
	        $('#dates-no-reveal').addClass('js-hidden');
	    });
	});
  });

$(document).ready(function(){
    $("#Continue").click(function(){
        var selection=document.querySelector('input[name="change-date"]:checked')!=null?
                      document.querySelector('input[name="change-date"]:checked').value:"";
       if(selection!='')
        {
            //Continue to next page
        }
        else
        {
        	//Display error message from HTML
        	
        	//"There is a problem with this page that needs to be resolved before you can continue" 
        	System.out.println(errorMessage);
        }
    });
});