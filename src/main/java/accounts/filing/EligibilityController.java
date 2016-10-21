package accounts.filing;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EligibilityController {	
	
	@RequestMapping(value="/eligibility", method = RequestMethod.GET)
	public String showEligibilityPage(){
		return "eligibility";
}

@RequestMapping(value = "/eligibility", method = RequestMethod.POST)
public String completeEligibility() {
    return "balanceSheet";
}
}