package accounts.filing.models;

import javax.validation.constraints.AssertTrue;

public class Approval {

	private String directorConfirmation;
	
	@AssertTrue(message = "Please provide name details of accounts approver(s)") 
	   public boolean isValidDirectorSelection(){
	       if ( directorConfirmation == null) {
	           return false;
	       }            
	       return true; 
	   }
	
	public Approval() {
    }

	public String getDirectorConfirmation() {
		return directorConfirmation;
	}

	public void setDirectorConfirmation(String directorConfirmation) {
		this.directorConfirmation = directorConfirmation;
	}