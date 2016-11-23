package accounts.filing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * PAGE IS NOT USED AS OF 23/11/2016. Keep it in for some time just in case people decide to use it. 
 * @author flisowski
 *
 */

@Controller
public class EligibilityPageController {
    
	@RequestMapping(value="/eligibility", method = RequestMethod.GET)
	public String showEligibilityPage(){
		return "eligibility";
	}
 

}