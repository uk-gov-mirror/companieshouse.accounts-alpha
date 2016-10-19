package accounts.filing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class BalanceSheetController {
	

	private String cdnUrl = "http://wswebdev2.orctel.internal:21502";
	
	@RequestMapping(value="/balanceSheet")
	public String showBalanceSheetPage(Model model){
				
		model.addAttribute("cdnUrl", cdnUrl);
		return "balanceSheet";
		
	}
	
}
