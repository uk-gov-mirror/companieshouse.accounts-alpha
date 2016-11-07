package accounts.filing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AccountsDatesController {
    
	@RequestMapping(value="/accountsDates", method = RequestMethod.GET)
	public String showAccountsDatesPage(Model model){
		model.addAttribute("accountsDates", new AccountsDates());
		return "accountsDates";
	}
	
	@RequestMapping(value="/accountsDates", method = RequestMethod.POST)
	public String submitStatementsPage(@ModelAttribute AccountsDates accountsDates){
		return "result3";
	}
	
	
}