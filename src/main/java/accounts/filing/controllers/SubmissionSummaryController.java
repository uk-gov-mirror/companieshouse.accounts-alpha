package accounts.filing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class SubmissionSummaryController {
    
	@RequestMapping(value="/submission-summary", method = RequestMethod.GET)
	public String showLandingPage(){
		return "submissionSummary";
	}

}
