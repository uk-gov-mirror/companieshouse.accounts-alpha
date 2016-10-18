package accounts.filing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BalanceSheetController {

	@Value({cdn.url}")
	private String cdnUrl;
	
	@RequestMapping(value="/balanceSheet")
	public String showBalanceSheetPage(Model model){
		model.addAttribute("cdUrl", cdnUrl);
		return "balanceSheet";
		
	}
	
}
