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
	
	/*(public class JavaDateAddSubtract {

	 public static void main(String[] args) {
		 
	 }
	 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	 Date d = sdf.parse("31/03/2016");
	 
	  System.out.println("31st March"+date.toString());
	  //test addDays method
	  
	  int i=1;
	  while(i<=7){
	   Date newDate = addDays(date, i);
	   System.out.println("Date after adding "+i+" days: "+newDate.toString());
	   i+=1;
	  }
	  
	  System.out.println("\n\n");
	  //test subtractDays method
	  i=1;
	  while(i<=7){
	   Date newDate = subtractDays(date, i);
	   System.out.println("Date after subtracting "+i+" days: "+newDate.toString());
	   i+=1;
	  }

}
}*/
	
}