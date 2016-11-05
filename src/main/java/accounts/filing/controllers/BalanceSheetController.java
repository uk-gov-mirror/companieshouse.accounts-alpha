package accounts.filing.controllers;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import accounts.filing.models.BalanceSheet;


@Controller
@SessionAttributes("balanceSheet")
public class BalanceSheetController {
    

    @RequestMapping(value="/balanceSheet",method = RequestMethod.GET)
	public String showBalanceSheetPage(Model model){
    	model.addAttribute("balanceSheet", new BalanceSheet());
    	
		return "balanceSheet";
		
	}
    
    @RequestMapping(value="/balanceSheet",method = RequestMethod.POST)
	public String submitBalanceSheet(@ModelAttribute @Valid BalanceSheet balanceSheet, BindingResult result, ModelMap model){
    	if ( result.hasErrors()){

    		return "balanceSheet";
    	}
    	model.put("balanceSheet", balanceSheet);
    
		return "redirect:/statements";
	}

}