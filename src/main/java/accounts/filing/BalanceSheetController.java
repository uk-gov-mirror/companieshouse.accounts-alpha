package accounts.filing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BalanceSheetController {
    

    @RequestMapping(value="/balanceSheet",method = RequestMethod.GET)
	public String showBalanceSheetPage(Model model){
    	model.addAttribute("balanceSheet", new BalanceSheet());
    	
		return "balanceSheet";
		
	}
    
    @RequestMapping(value="/balanceSheet",method = RequestMethod.POST)
	public String submitBalanceSheet(@ModelAttribute BalanceSheet balanceSheet){

		return "result";
	}
    
 

}

