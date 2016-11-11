package accounts.filing;

import javax.validation.constraints.NotNull;

public class AccountsDates {
	
	@NotNull(message = "Please agree to the legal statements")
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