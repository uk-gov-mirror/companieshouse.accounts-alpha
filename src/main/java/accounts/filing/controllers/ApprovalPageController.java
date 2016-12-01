package accounts.filing.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import accounts.filing.models.Approval;


@Controller
public class ApprovalPageController {
    
	@RequestMapping(value="/approval", method = RequestMethod.GET)
	public String showApprovalPage(Model model){
		model.addAttribute("approval", new Approval());
		return "approval";
	}

	@RequestMapping(value="/approval", method = RequestMethod.POST)
	public String submitApprovalPage(@ModelAttribute @Valid Approval approval, BindingResult result){
		if (result.hasErrors()){
			return "approval";
	} 
	return "redirect:/summary-page";
}
}
	