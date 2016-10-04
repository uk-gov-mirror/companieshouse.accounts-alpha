package accounts.filing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BalanceSheetController {
	
	

	@RequestMapping(value="/balanceSheet")
	public String showBalanceSheetPage(){
		return "balanceSheet";
	}
	
}
