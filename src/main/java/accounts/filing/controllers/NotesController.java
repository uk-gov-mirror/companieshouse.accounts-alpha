package accounts.filing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;



@Controller
@SessionAttributes("balanceSheet")
public class NotesController {
    
	@RequestMapping(value="/balance-sheet-notes", method = RequestMethod.GET)
	public String showStatementsPage(){
	
		return "notesHomepage";
	}
	
}