package accounts.filing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes({"balanceSheet", "accountingPolicies", "tangibleAssetsNote", "employeesNote"})
public class ReviewPageController {
    
	@RequestMapping(value="/review", method = RequestMethod.GET)
	public String showReviewPage(){
		return "reviewPage";
	}
 

}