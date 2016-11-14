package accounts.filing.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import accounts.filing.models.AccountingPolicies;




@Controller
@SessionAttributes("balanceSheet")
public class NotesController {
    
	@RequestMapping(value="/balance-sheet-notes", method = RequestMethod.GET)
	public String showNotesHomepage(){
	
		return "notesHomepage";
	}
	
	@RequestMapping(value="/accounting-policies", method = RequestMethod.GET)
	public String showAccountingPoliciesNote(ModelMap model){
		model.addAttribute("accountingPolicies", new AccountingPolicies());
		return "notes/accountingPoliciesNote";
	}
	
	@RequestMapping(value="/accounting-policies", method = RequestMethod.POST)
	public String submitAccountingPoliciesNote(@ModelAttribute @Valid AccountingPolicies accountingPolicies, BindingResult result){
		if(result.hasErrors()){
			System.out.println("Ruth preparation statement value:" + accountingPolicies.getPreparationStatement());
			System.out.println("Ruth other preparation value:" + accountingPolicies.getOtherPreparation());
			return "notes/accountingPoliciesNote";
		}
		
		accountingPolicies.cleanupPreparationStatement();
		System.out.println("Ruth preparation statement value:" + accountingPolicies.getPreparationStatement());
		System.out.println("Ruth other preparation value:" + accountingPolicies.getOtherPreparation());
		return "notesHomepage";
	}
	
	
}