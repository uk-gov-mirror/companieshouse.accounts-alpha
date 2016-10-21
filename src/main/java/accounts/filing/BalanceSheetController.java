package accounts.filing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BalanceSheetController {
    

    @RequestMapping("/balanceSheet")
	public String showBalanceSheetPage(Model model){

		return "balanceSheet";
		
	}

}

