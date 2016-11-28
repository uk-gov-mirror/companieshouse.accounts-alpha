package accounts.filing.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import accounts.filing.models.AccountingPolicies;
import accounts.filing.models.BalanceSheet;
import accounts.filing.models.TangibleAssetsNote;




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
			return "notes/accountingPoliciesNote";
		}
		accountingPolicies.cleanupPreparationStatement();		
		return "notesHomepage";
	}
	
	@RequestMapping(value="/tangible-assets", method = RequestMethod.GET)
	public String showTangibleAssetsNote(ModelMap model){
		model.addAttribute("tangibleAssetsNote", new TangibleAssetsNote());
		return "notes/tangibleAssetsNote";
	}
	
	@RequestMapping(value="/tangible-assets", method = RequestMethod.POST)
	public String submitTangibleAssetsNote(@ModelAttribute @Valid TangibleAssetsNote tangibleAssetsNote, BindingResult result, HttpSession session){
		
		BalanceSheet balancesheet = (BalanceSheet) session.getAttribute("balanceSheet");
		
		if (balancesheet.getCurrentTangibleAssets() != tangibleAssetsNote.getNetBookValueEnd()){
			result.rejectValue("netBookValueEnd", "tangibleAssetsNote", "Make sure the net book value for the period you are filing for matches tangible assets for that period.");
		}
		
		if (balancesheet.getPreviousTangibleAssets() != tangibleAssetsNote.getNetBookValueStart()){
			result.rejectValue("netBookValueStart", "tangibleAssetsNote", "Make sure the net book value for the period you are filing for matches tangible assets for that period.");
		}		
		
		if(result.hasErrors()){
			return "notes/tangibleAssetsNote";
		}
	
		return "notesHomepage";
	}
	
	
}