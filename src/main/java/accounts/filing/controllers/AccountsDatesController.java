package accounts.filing.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import accounts.filing.models.AccountsDates;


@Controller
public class AccountsDatesController {
    
	@RequestMapping(value="/accounts-dates", method = RequestMethod.GET)
	public String showAccountsDatesPage(Model model){
		model.addAttribute("accountsDates", new AccountsDates());
		return "accountsDates";
	}

	@RequestMapping(value="/accounts-dates", method = RequestMethod.POST)
	public String submitAccountsDates(@ModelAttribute @Valid AccountsDates accountsDates, BindingResult result){
		if (result.hasErrors()){
			return "accountsDates";
		} 
		
		accountsDates.cleanupDatesSelection();
		
		return "redirect:/balance-sheet";
	}
 
	
}