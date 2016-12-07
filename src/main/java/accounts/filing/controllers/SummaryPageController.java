package accounts.filing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes({"balanceSheet", "accountingPolicies", "tangibleAssetsNote"})
public class SummaryPageController {
    
	@RequestMapping(value="/summary", method = RequestMethod.GET)
	public String showSummaryPage(){
		return "summaryPage";
	}
 

}