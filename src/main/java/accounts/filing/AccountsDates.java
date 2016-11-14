package accounts.filing;

import javax.validation.constraints.NotNull;

public class AccountsDates {
	
	@NotNull(message = "Please confirm the dates that you have prepared your accounts to.")
	private String dateConfirmation;
	
	public AccountsDates() {
		
	}

	public String getDateConfirmation() {
		return dateConfirmation;
	}

	public void setDateConfirmation(String dateConfirmation) {
		this.dateConfirmation = dateConfirmation;
	}
	

}