package accounts.filing;

import javax.validation.constraints.AssertTrue;

public class StatementsPage {
    
	@AssertTrue(message = "Please agree to the legal statements")
	private boolean confirmation;
	
	public StatementsPage() {
	}

	public StatementsPage(boolean confirmation) {
		super();
		this.confirmation = confirmation;
	}


	public boolean isConfirmation() {
		return confirmation;
	}

	public void setConfirmation(boolean confirmation) {
		this.confirmation = confirmation;
	}
	
	

}


