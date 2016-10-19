package accounts.filing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class BalanceSheetController {
	

	private String cdnUrl = "http://chs-dev:8080";
	
	@RequestMapping(value="/balanceSheet")
	public String showBalanceSheetPage(Model model){
				
		model.addAttribute("cdnUrl", cdnUrl);
		return "balanceSheet";
		
	}
	
}
