package accounts.filing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EligibilityPageController {
    
	@RequestMapping(value="/eligibility", method = RequestMethod.GET)
	public String showEligibilityPage(){
		return "eligibility";
	}
 

}