package accounts.filing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BalanceSheetController {
    
	private String cdnUrl = "http://wswebdev2.orctel.internal:21502";

    @RequestMapping("/balanceSheet")
	public String showBalanceSheetPage(Model model){
		
		model.addAttribute("cdnUrl", cdnUrl);
		return "balanceSheet";
		
	}

}

