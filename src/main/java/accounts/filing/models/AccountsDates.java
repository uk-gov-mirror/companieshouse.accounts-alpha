package accounts.filing.models;

import javax.validation.constraints.AssertTrue;

public class AccountsDates {

	private String defaultDateConfirmation;
	private String customDateConfirmation;
	
	@AssertTrue(message = "Please confirm the dates that you have prepared your accounts to.") 
	   public boolean isValidDateSelection(){
	       if ( defaultDateConfirmation == null || ( defaultDateConfirmation.equals("Yes") && customDateConfirmation == null)) {
	           return false;
	       }            
	       return true; 
	   }
	
	public AccountsDates() {
		
	}

	public String getDefaultDateConfirmation() {
		return defaultDateConfirmation;
	}

	public void setDefaultDateConfirmation(String defaultDateConfirmation) {
		this.defaultDateConfirmation = defaultDateConfirmation;
	}

	public String getCustomDateConfirmation() {
		return customDateConfirmation;
	}

	public void setCustomDateConfirmation(String customDateConfirmation) {
		this.customDateConfirmation = customDateConfirmation;
	}

	public void cleanupDatesSelection(){
        if (this.defaultDateConfirmation.equals("Yes")) {
            this.defaultDateConfirmation = this.customDateConfirmation;
        } else {
        	this.customDateConfirmation = null;
        }
    }

}