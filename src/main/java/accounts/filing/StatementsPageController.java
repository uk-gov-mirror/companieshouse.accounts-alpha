package accounts.filing;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class StatementsPageController {
    
	@RequestMapping(value="/statements", method = RequestMethod.GET)
	public String showStatementsPage(Model model){
		model.addAttribute("statementsPage", new StatementsPage());
		return "statements";
	}
	@RequestMapping(value="/statements", method = RequestMethod.POST)
	public String submitStatementsPage(@ModelAttribute @Valid StatementsPage statementsPage, BindingResult result){
		if (result.hasErrors()){
			return "statements";
		} 
		return "result2";
	}
 
	
}