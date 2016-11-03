package accounts.filing.controllers;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import accounts.filing.models.BalanceSheet;


@Controller
public class BalanceSheetController {
    

    @RequestMapping(value="/balanceSheet",method = RequestMethod.GET)
	public String showBalanceSheetPage(Model model){
    	model.addAttribute("balanceSheet", new BalanceSheet());
    	
		return "balanceSheet";
		
	}
    
    @RequestMapping(value="/balanceSheet",method = RequestMethod.POST)
	public String submitBalanceSheet(@ModelAttribute @Valid BalanceSheet balanceSheet, BindingResult result){
    	if ( result.hasErrors()){

    		return "balanceSheet";
    	}
		return "result";
	}

}