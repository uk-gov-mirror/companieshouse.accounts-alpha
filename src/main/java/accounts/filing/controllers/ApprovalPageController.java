package accounts.filing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ApprovalPageController {
    
	@RequestMapping(value="/approval", method = RequestMethod.GET)
	public String showLandingPage(){
		return "approval";
	}
 

}
 
	