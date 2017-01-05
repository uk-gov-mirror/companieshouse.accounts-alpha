package accounts.filing.controllers;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import accounts.filing.helpers.CrossValidator;
import accounts.filing.models.AccountingPolicies;
import accounts.filing.models.BalanceSheet;
import accounts.filing.models.EmployeesNote;
import accounts.filing.models.TangibleAssetsNote;


@Controller
@SessionAttributes({"balanceSheet", "accountingPolicies", "tangibleAssetsNote", "employeesNote"})
public class NotesController {
	
	@Inject
	private CrossValidator crossValidator;	
    
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
			return "notes/accountingPoliciesNote";
		}
		accountingPolicies.cleanupPreparationStatement();		
		return "redirect:balance-sheet-notes";
	}
	
	@RequestMapping(value="/tangible-assets", method = RequestMethod.GET)
	public String showTangibleAssetsNote(ModelMap model){
		model.addAttribute("tangibleAssetsNote", new TangibleAssetsNote());
		return "notes/tangibleAssetsNote";
	}
	
	@RequestMapping(value="/tangible-assets", method = RequestMethod.POST)
	public String submitTangibleAssetsNote(@ModelAttribute @Valid TangibleAssetsNote tangibleAssetsNote, BindingResult result, HttpSession session){
		
		BalanceSheet balanceSheet = (BalanceSheet) session.getAttribute("balanceSheet");		
		
		crossValidator.tangibleAssetsNoteValidate(result, balanceSheet, tangibleAssetsNote);			
		
		if(result.hasErrors()){
			return "notes/tangibleAssetsNote";
		}
	
		return "redirect:balance-sheet-notes";
	}
	
	@RequestMapping(value="/employees-note", method = RequestMethod.GET)
	public String showEmployeesNote(ModelMap model){
		model.addAttribute("employeesNote", new EmployeesNote());
		return "notes/employeesNote";
	}
	
	@RequestMapping(value="/employees-note", method = RequestMethod.POST)
	public String submitAccountingPoliciesNote(@ModelAttribute @Valid EmployeesNote employeesNote, BindingResult result){
		if(result.hasErrors()){
			return "notes/employeesNote";
		}	
		return "redirect:balance-sheet-notes";
	}
}