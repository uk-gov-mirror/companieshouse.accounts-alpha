package accounts.filing;

import javax.validation.constraints.AssertTrue;

public class StatementsPage {
    
	@AssertTrue(message = "Please agree to the legal statements")
	private boolean confirmation;
	
	public StatementsPage() {
	}

	public boolean isConfirmation() {
		return confirmation;
	}

	public void setConfirmation(boolean confirmation) {
		this.confirmation = confirmation;
	}
	

}


